package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String s= br.readLine();
        int ans=0,count=0;
        char l='\0';

        for(char a:s.toCharArray()){
            if(a==l)count++;
            else {
                ans=Math.max(ans,count);
                count=1;
                l=a;
            }
        }
        ans=Math.max(ans,count);
        System.out.println(ans);
    }
}