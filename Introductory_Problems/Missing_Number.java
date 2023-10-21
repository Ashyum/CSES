package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Missing_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        long sum=(long)((long)n * (n+1))/2;
        n--;
        String[] arr=new String[5];
        arr = br.readLine().split(" ");
        n--;
        while(n>-1){
            sum-=Integer.valueOf(arr[n]);
            n--;
        }


        System.out.println(sum);


    }
}