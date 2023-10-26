package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Gray_Code {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        List<String> ans;
        ans=helper(n);
        for(String a:ans){
            System.out.println(a);
        }
    }
    private static List<String> helper(int n){
        if(n==0){
            return new ArrayList<>(List.of(new String[]{"0"}));
        }
        if(n==1){
            return new ArrayList<>(List.of(new String[]{"0", "1"}));
        }
        List<String> ans=new ArrayList<>();
        List<String> l1=helper(n-1);
        for(int i=0;i<l1.size();i++){
            ans.add(0+l1.get(i));
        }
        for(int i=l1.size()-1;i>=0;i--){
            ans.add(1+l1.get(i));
        }
        return ans;
    }
}