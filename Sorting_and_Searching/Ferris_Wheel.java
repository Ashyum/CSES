package Sorting_and_Searching;

import java.io.*;
import java.util.*;

public class Ferris_Wheel {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] s=br.readLine().split(" ");
        String[] w=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]),x=Integer.parseInt(s[1]);
        Integer[] weight=new Integer[n];

        for(int i=0;i<n;i++){
            weight[i]=Integer.parseInt(w[i]);
        }
        Arrays.sort(weight);
        int i=0,j=n-1,count=0;

        while(i<=j){
            if(i==j){
                count++;
                break;
            }
            count++;
            if(weight[i]+weight[j]<=x){
                i++;
            }
            j--;
        }
        System.out.println(count);

    }
}