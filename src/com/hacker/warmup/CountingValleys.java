package com.hacker.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int numValleys = 0;
    	int currentState = 0;
    	char[] steps = s.toCharArray();
    	for(int i=0;i<n;i++) {
    		if(steps[i]=='D') {
    			currentState--;
    		}else if(steps[i]=='U') {
    			currentState++;
    			if(currentState==0) {
    				numValleys++;
    			}
    		}
    	}
    	System.out.println(numValleys);
		return numValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
