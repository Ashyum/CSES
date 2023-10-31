package Introductory_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chessboard_and_Queens {
    private static int w=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[][] arr=new char[8][8];
        boolean[] attacked=new boolean[16];
        boolean[] attacked2=new boolean[16];
        boolean[] row=new boolean[16];
        boolean[] col=new boolean[8];
        for(int i=0;i<8;i++){
            arr[i]=br.readLine().toCharArray();
        }
        helper(arr,0,0,attacked,attacked2,row,col);
        System.out.println(w);
    }
    private static void helper(char[][] board, int r, int queens, boolean[] attacked, boolean[] attacked2,boolean[] row, boolean[] col){
//        System.out.println(Arrays.deepToString(board));
        if(r==8){
            w++;
            return;
        }
//        if(c==8) return 0;
//        if(r!=-1 && ()){
//            return 0;
//        }
//        if(r!=-1) {
//            attacked[r + c] = attacked[r - c + 7] = true;
//            row[r]=true;
//            col[c]=true;
////            board[r][c] = "Q";
//        }
//        else {
//            r=0;
//            c=0;
//        }
//         int ans=0;
                for(int c=0;c<8;c++){
                    if(attacked[r+c]==true || attacked2[r-c+7]==true || row[c]==true || board[r][c]=='*') {
                        continue;
                    }
//                        board[r][c]='Q';
                        attacked[r + c] = attacked2[r - c + 7] = true;
                        row[c]=true;
//                        col[c]=true;
                        helper(board,r+1,queens+1,attacked,attacked2,row,col);
//                        board[r][c]='.';
                        attacked[r + c] =   attacked2[r - c + 7] = false;
                        row[c]=false;
//                        col[c]=false;
                }
    }
}