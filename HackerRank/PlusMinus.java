import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) positive++;
            else if (arr.get(i) < 0) negative++;
            else zero++;
        }
        float n = arr.size();
        System.out.printf("%.6f%n", positive / n);
        System.out.printf("%.6f%n", negative / n);
        System.out.printf("%.6f%n", zero / n);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}