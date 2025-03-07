import java.io.*;
import java.util.*;

public class Pepe6{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total=n*m;
        int count=0;
        while(count<total){
            //left wall
            for(int i=minr, j=minc ; i <= maxr && count<total ;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            
            //bottom wall
            for(int i=maxr,j=minc;j<=maxc && count<total;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            
            //right wall
            for(int i=maxr,j=maxc;i>=minr && count <total;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            
            //top wall
            for(int i=minr,j=maxc;j>=minc && count<total;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
            
        }
    }

}