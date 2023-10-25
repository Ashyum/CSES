package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two_Knights {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        // total no of ways to place two knights on an n*n chessboard
        //for first knight:   n^2
        // for second knight: n^2 - 1
        //total ways: (n^2)*(n^2-1)/2! note that the knights are identical, so according to the rules of permutations,
        // we will consider the positions to be the same, even if the knights exchange their positions.
        // So, the number of ways to place will be halved as the knights are identical.

        //total no of ways two knight can attack each other on an n*n chessboard
        //for 2 x 3 : (n-1)(n-2)
        //for 3 x 2 : (n-2)(n-1)
        //add both ways: 2(n-1)(n-2)
        //total: 2*2(n-1)(n-2) in each block of 2x3 or 3x2 there are two ways that the knights can attack each other

        long n=Long.parseLong(br.readLine());

        long total_comb=0,attack=0,i;
        for(i=1;i<=n;i++){
            total_comb=((i*i)*((i*i)-1))/2;
            attack=4*(i-1)*(i-2);
            System.out.println(total_comb-attack);
        }
    }
}