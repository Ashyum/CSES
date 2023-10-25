package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindrome_Reorder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s= br.readLine();
        int[] c=new int[26];
        int count=0;
        StringBuilder str=new StringBuilder();
        for(char a:s.toCharArray()){
            c[a-'A']++;
        }
        for(int i=0;i<26;i++){
            if((c[i]&1)==1){
                count++;
            }
        }
        if(count>1) {
            System.out.println("NO SOLUTION");
            return;
        }


        for(int i=0;i<26;i++){
            if((c[i]&1)==0){
                for(int j=0;j<c[i]/2;j++){
                    str.append((char)('A'+i));
                }
            }
        }
        System.out.print(str);
        for(int i=0;i<26;i++){
            if((c[i]&1)==1){
                for(int j=0;j<c[i];j++){
                    System.out.print((char)('A'+i));
                }
            }
        }
//        System.out.println(m);
        System.out.println(str.reverse());

    }
}
