package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apple_Division {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] arr= br.readLine().split(" ");
        long sum=0;
        for(String a:arr){
            sum+=Long.valueOf(a);
        }
        long ans=helper(arr,0,0,sum);
        System.out.println(ans);
    }
    private static long helper(String[] arr, long g1, int i, long sum){
        if(i==arr.length-1){
            return Math.abs((sum-g1)-g1);
        }
            return Math.min(helper(arr,g1+Integer.valueOf(arr[i]),i+1,sum),helper(arr,g1,i+1,sum));
    }
}