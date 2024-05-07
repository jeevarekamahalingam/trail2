
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Making_anagram {




    /*
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int makingAnagrams(String s1, String s2) {
    // Write your code here
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<s1.length();i++){
            if (map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            else
                map.put(s1.charAt(i),1);
        }
        for (int i=0;i<s2.length();i++){
            if (map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            }
            else
                map.put(s2.charAt(i),-1);
        }
        int count=0;
        for(Character k:map.keySet()){
            if (map.get(k)!=0){
                count+=Math.abs(map.get(k));
            }
        }
        return count;

    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


