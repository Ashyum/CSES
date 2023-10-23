package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two_Knights {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long n=Long.parseLong(br.readLine());

        long total_comb=0,attack=0,i;
        for(i=1;i<=n;i++){
            total_comb=((i*i)*((i*i)-1))/2;
            attack=4*(i-1)*(i-2);
            System.out.println(total_comb-attack);
        }
    }
}