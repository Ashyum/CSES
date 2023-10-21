package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weird_Algorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        while(n != 1L) {
            System.out.print(n + " ");
            if ((n & 1L) == 1L) {
                n = n * 3L + 1L;
            } else {
                n /= 2L;
            }
        }

        System.out.print(n);
    }
}