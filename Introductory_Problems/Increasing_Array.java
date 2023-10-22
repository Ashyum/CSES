package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Increasing_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        String[] arr=new String[n];
        arr=br.readLine().split(" ");
        long ans=0,mx=0;
        for(int i=0;i<n;i++){


            mx=Math.max(mx,Integer.valueOf(arr[i]));
            ans+=mx-Integer.valueOf(arr[i]);


//            if(i-1>=0){
//                if(Integer.valueOf(arr[i-1])>Integer.valueOf(arr[i])) {
//                    ans+=(long)(Integer.valueOf(arr[i-1]) - Integer.valueOf(arr[i]));
//                    arr[i]=String.valueOf(Integer.valueOf(arr[i])+(Integer.valueOf(arr[i-1]) - Integer.valueOf(arr[i])));
//                }
//            }
        }
        System.out.println(ans);

    }
}