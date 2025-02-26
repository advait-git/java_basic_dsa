import java.io.*;
import java.util.*;

public class servicenow4 {
    public static void rev(int []arr){
        int i=0;
        int j=arr.length-1;
        

       while(i<j){
        int k=arr[i];
        arr[i]=arr[j];
        arr[j]=k;
        i++;j--;
       }
    }
    public static void main(String []str){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        rev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        
    }
}
