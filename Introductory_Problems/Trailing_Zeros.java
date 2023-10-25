package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trailing_Zeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long n=Long.parseLong(br.readLine());
        long ans=0;
        for(int i=5;i<=n;i*=5){
            ans+=n/i;
        }
        System.out.println(ans);
    }
}