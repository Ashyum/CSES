package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_Spiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String[] arr=new String[2];
            arr=br.readLine().split(" ");

            long row=Long.valueOf(arr[0]);
            long col=Long.valueOf(arr[1]);

            if(row==col){
                System.out.println(row*row-row+1);
            }
            if(row>col){
                if((row&1)==0){
                    System.out.println(row*row-col+1);
                }
                else System.out.println((row-1)*(row-1)+1 +col-1);
            }
            else if(row<col){
                if((col&1)==1){
                    System.out.println(col*col-row+1);
                }
                else{
//                    System.out.println(col*col-col+1);??Why is this wrong?
                    System.out.println((col-1)*(col-1)+1+row-1);
                }
            }
        }
    }
}