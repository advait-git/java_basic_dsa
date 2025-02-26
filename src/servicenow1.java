import java.io.*;
import java.util.*;
public class servicenow1 {
    public static boolean twoSum(int[] arr,int ans){

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==ans){
                    return true;
                }   
            }
        }
        return false;
    }
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=sc.nextInt();

        if(twoSum(arr,ans)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
         

    }
}
