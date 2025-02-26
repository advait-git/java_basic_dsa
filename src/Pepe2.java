import java.util.*;
import java.io.*;

public class Pepe2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int limit = (int)Math.pow(2,n);

        for(int i=0;i<limit;i++){
            String set="";
            int temp=i;
            for(int j=n-1;j>=0;j--){
                int r=temp%2;
                temp=temp/2;
                if(r==0){
                    set="-\t"+set;
                }else{
                    set=arr[j]+"\t"+set;
                }
            }
            System.out.println(set);
            
        }
    }
}
