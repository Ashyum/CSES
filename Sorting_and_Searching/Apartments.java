package Sorting_and_Searching;

import java.io.*;
import java.util.*;

public class Apartments {
    // TLE on 1 test case - (on test case 19)
    public static void main(String[] args) {
        int n = ni(), m = ni(), k = ni();
        int[] a1=new int[n];
        int[] a2=new int[m];
        for (int i = 0; i < n; i++) {
            a1[i]=ni();
        }
        for (int i = 0; i < m; i++) {
            a2[i]=ni();
        }

        Arrays.sort(a1);
        Arrays.sort(a2);
        int ans=0,i=0,j=0;

        while(i<n && j<m){
            if(a1[i]==a2[j]){
                ans++;
                i++;
                j++;
            }
            else if(a1[i]>a2[j]){
                if(a1[i]-k<=a2[j]) {
                    ans++;
                    i++;
                    j++;
                }
                else j++;
            }
            else if(a1[i]<a2[j]){
                if(a1[i]+k>=a2[j]) {
                    ans++;
                    i++;
                    j++;
                }
                else i++;

            }
        }
        System.out.print(ans);
    }

//#########################################################################//

    static InputStream is = System.in;
    static byte[] inbuf = new byte[1 << 24];
    static int lenbuf = 0, ptrbuf = 0;

    static int readByte() {
        if (lenbuf == -1)
            throw new InputMismatchException();
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0)
                return -1;
        }
        return inbuf[ptrbuf++];
    }

    static boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    static int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b))
            ;
        return b;
    }

    static double nd() {
        return Double.parseDouble(ns());
    }

    static char nc() {
        return (char) skip();
    }

    static String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    static char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    static int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    static long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

}