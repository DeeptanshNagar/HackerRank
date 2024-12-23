// https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b  
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int Alice_score = 0;
        int Bob_score = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                Alice_score++;
            } else if (a.get(i) < b.get(i)) {
                Bob_score++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(Alice_score);
        ans.add(Bob_score);
        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Use a default output file path if OUTPUT_PATH is not set
        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath == null) {
            outputPath = "output.txt"; // Default output file path
        }
        
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = Result.compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
