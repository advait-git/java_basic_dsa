import java.io.*;
import java.util.*;

public class arrays4 {
    public static void main(String []str){
        Scanner sc=new Scanner(System.in);
        //array 1
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        //array 2
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        int[] sum = new int[n > m ? n : m ];
        //carry
        int c = 0;
        //indexes
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;

        while(k>=0){
            int d=c;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            c=d/10;
            d=d%10;
            sum[k]=d;

            i--;j--;k--;

        }
        if(c!=0){
            System.out.print(c);
        }
        for(int val: sum){
            System.out.print(val);
        }

    }    
}
