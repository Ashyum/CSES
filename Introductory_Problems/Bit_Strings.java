package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bit_Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int ans=1,mod= (int) 1e9+7;
        for(int i=1;i<=n;i++){
            ans=(ans*2)%mod;
        }
        System.out.println(ans);
    }
}
