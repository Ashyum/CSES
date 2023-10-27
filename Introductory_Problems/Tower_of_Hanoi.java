package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tower_of_Hanoi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2,n)-1);
        helper(n,1,3);
    }
    private static void helper(int n,int s, int e){
        if(n==1){
            System.out.println(s+" "+e);
            return;
        }
        else{
            int o=6-(s+e);
            helper(n-1,s,o);
            System.out.println(s+" "+e);
            helper(n-1,o,e);
        }
    }
}