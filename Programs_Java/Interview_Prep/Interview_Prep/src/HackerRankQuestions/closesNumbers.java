package HackerRankQuestions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void closestNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
        int minAbs = Integer.MAX_VALUE;
        StringBuilder pairs = new StringBuilder("");
        for(int i=0; i<numbers.size()-1;i++){
            int absDiff;
            if((numbers.get(i)<0 && numbers.get(i+1)<0) || (numbers.get(i)>0 && numbers.get(i+1)>0)){
                absDiff = Math.abs(numbers.get(i)-numbers.get(i+1));
            }else{
                absDiff = Math.abs(numbers.get(i)+numbers.get(i+1));
            }
            if(absDiff < minAbs){
                minAbs = absDiff;
                pairs = new StringBuilder("");
                pairs.append(numbers.get(i)+ " "+numbers.get(i+1)+"\n");
            }else if(absDiff == minAbs){
                pairs.append(numbers.get(i)+ " "+numbers.get(i+1)+"\n");
            }
        }
        
        System.out.println(pairs);
        
        

    }

}
public class closesNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numbersCount; i++) {
            int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
            numbers.add(numbersItem);
        }

        Result.closestNumbers(numbers);

        bufferedReader.close();
    }
}