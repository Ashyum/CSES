package Sorting_and_Searching;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Distinct_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(Integer.valueOf(s[i]));
        }
        System.out.println(set.size());
    }
}