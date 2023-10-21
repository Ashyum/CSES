package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        if(n<4){
            if(n==1){
                System.out.println("1");
                return;
            }
            System.out.println("NO SOLUTION");
            return;
        }
        StringBuilder ans=new StringBuilder();
        int i=2;
        while(i<=n){
            ans.append(i);
            ans.append(" ");
            i+=2;
        }
        i=1;
        while(i<=n){
            ans.append(i);
            ans.append(" ");
            i+=2;
        }
        System.out.println(ans);
    }
}