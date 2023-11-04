package Sorting_and_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Concert_Tickets {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");

        String[] t=br.readLine().split(" ");
        int nt=Integer.parseInt(s[0]);
        int nc=Integer.parseInt(s[1]);
//        System.out.println(t.length+" "+nt);
        LinkedList<Integer> tickets=new LinkedList<>();
        for(int i=0;i<nt;i++){
            tickets.add(i, Integer.parseInt(t[i]));
        }
        Collections.sort(tickets);
        String[] cust=br.readLine().split(" ");
        for(int i=0;i<nc;i++){
            int a=helper(tickets, Integer.parseInt(cust[i]), tickets.size());
            if(a!=-1){
                System.out.println(tickets.get(a));
                tickets.remove(a);
            }
            else System.out.println(-1);
        }

    }
    private static int helper(LinkedList<Integer> list, int x, int n){
        int s=0,e=n-1,ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(x-list.get(mid)>=0){
                ans=mid;
                s=mid+1;
            }
            else e=mid-1;
        }
        return ans;
    }
}