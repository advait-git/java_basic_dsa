import java.io.*;
import java.util.*;

public class arrays2 {
    public static void main(String []str){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                idx=i;
                break;
            }
            
        }
        System.out.println(idx);
    }    
}
