import java.io.*;
import java.util.*;
public class servicenow6 {
    public static void main(String str[]){
        Scanner sc=new Scanner (System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int []inv=new int[n];
        for(int i=0;i<arr.length;i++){
            int v=arr[i];
            inv[v]=i;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(inv[i]+"\t");
        }
    }
}
