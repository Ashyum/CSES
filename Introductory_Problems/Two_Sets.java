package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Two_Sets {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());

        long sum=n*(n+1)/2;
        if(sum%2!=0){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");

            List<Integer> l1=new ArrayList<>();
            List<Integer> l2=new ArrayList<>();
//            Set<Integer> set2 = new HashSet<>();
            if (n%2== 0) {

                for (int i = 0; i < n / 2; i++) {
                    if ((i & 1) == 0) {
                        l1.add(i + 1);
                        l1.add((int) (n - i));
                    } else {
                        l2.add(i + 1);
                        l2.add((int) (n - i));
                    }
                }
            } else {
                for(int i=0;i<(n-1)/2;i++){
                    if ((i & 1) == 0) {
                        l1.add(i + 1);
                        l1.add((int) (n - 1 - i));
                    } else {
                        l2.add(i + 1);
                        l2.add((int) (n - 1 - i));
                    }
                }
                if(l1.size()< l2.size()){
                    l1.add((int)n);
                }
                else {
                    l2.add((int)n);
                }
            }
            System.out.println(l1.size());
//            for(int a:set1){
//                System.out.print(a + " ");
//            }
//            System.out.println(Arrays.toString(l1.toArray()).replaceAll("\\[|\\]|,", ""));  //regex

            // OR

            System.out.println(Arrays.toString(l1.toArray()).replace("]", "").replace("[","").replace(",",""));

            System.out.println(l2.size());
            System.out.println(Arrays.toString(l2.toArray()).replaceAll("\\[|\\]|,", ""));

            System.out.println();
        }
    }
}