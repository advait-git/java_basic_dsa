import java.io.*;
import java.util.*;

public class servicenow5 {
    public static void rev(int []arr,int i,int j){
         
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int []arr,int m){
        m=m%arr.length;
        if(m<0){
            m=m+arr.length;
        }
        rev(arr,0,arr.length-1-m);
        rev(arr,arr.length-m,arr.length-1);
        rev(arr,0,arr.length-1);
    }
    public static void main(String[]str){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        rotate(arr,m);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
