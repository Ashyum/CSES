package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Creating_Strings {
    private static int c;
    private static StringBuilder sb=new StringBuilder();
    private static HashSet<String> hs=new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String s=br.readLine();
        permute(s,0,s.length()-1);
        List<String> li=new ArrayList<>(hs);
        Collections.sort(li);

        System.out.println(li.size());
        for(String st:li)
            sb.append(st+"\n");

        System.out.println(sb.toString());
//        List<String> ans=permutation("",s);
//        System.out.println(ans.size());
//        for(String a:ans){
//            System.out.println(a);
//        }
//printPermutn(s,"");
//        System.out.println(c);
    }
    static void permute(String a,int l,int r){
        if(l==r)
            hs.add(a);
        else{

            for(int i=l;i<=r;i++){
                char s1[]=a.toCharArray();
                a=swap(s1,l,i);
                permute(a,l+1,r);
                a=swap(s1,l,i);
            }
        }
    }
    static String swap(char[] a,int l, int r ){
        char tem=a[l];
        a[l]=a[r];
        a[r]=tem;

        return String.valueOf(a);
    }
    private static List<String> permutation(String p, String up) {
        if (up.length() == 0) {
            List<String> l=new ArrayList<>();
            l.add(p);

            return l;
        }
        List<String> ans=new ArrayList<>();
        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            String res= up.substring(0, i) + up.substring(i + 1);

            ans.addAll(permutation(p+ch,res));
        }
        return ans;
    }
static void printPermutn(String str, String ans)
{
    if (str.length() == 0) {

        System.out.println(ans);
        c++;
        return;
    }

    for (int i = 0; i < str.length(); i++) {


        char ch = str.charAt(i);


        String ros = str.substring(0, i) +
                str.substring(i + 1);


        printPermutn(ros, ans + ch);
    }
}
}