import java.util.*;
import java.io.*;
public class twoarray2 {
    public static void main(String [] str){
        Scanner sc=new Scanner (System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        while(true){
            //left wall
            for(int i=minr,j=minc;i<=maxr;i++){
                System.out.println(arr[i][j]);
            }
            //bottom wall
            for(int i=maxr,)
            //right wall 
            //top wall
        }
    }
}
