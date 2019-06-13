package com.hacker.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedA {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	if(!s.contains("a")) return 0;
    	
    	long numStrRepetitions=0;
    	long leftoverStrLength=0;
    	long totalNumOfA=0;
    	
    	numStrRepetitions = n/s.length();
    	
    	leftoverStrLength = n%s.length();
    	
    	String leftOverStr = s.substring(0, (int)leftoverStrLength);
    	String aInleftOverStr = leftOverStr.replaceAll("[^a]", "");
    	String aInActualStr = s.replaceAll("[^a]", "");
    	
    	totalNumOfA = numStrRepetitions * aInActualStr.length() + aInleftOverStr.length();
    	System.out.println(totalNumOfA);
		return totalNumOfA;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
