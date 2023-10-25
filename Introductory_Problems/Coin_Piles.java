package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin_Piles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t-->0) {
            String[] arr = new String[2];
            arr = br.readLine().split(" ");
            long a=Long.valueOf(arr[0]);
            long b=Long.valueOf(arr[1]);

            if((a+b)%3==0 && 2*a>=b && 2*b>=a){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}