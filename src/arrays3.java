import java.io.*;
import java.util.*;

public class arrays3 {
    public static void main(String [] str){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int [n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }

       int max=arr[0];
       for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       for(int floor=max;floor>=1;floor--){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=floor){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
       }
    }    
}
