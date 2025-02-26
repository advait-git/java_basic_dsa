import java.util.*;
import java.io.*;

public class servicenow2 {
    public static boolean twoSum(int[]arr,int target){
        Arrays.sort(arr);
        int i=0; int j=arr.length-1;

        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                return true;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public static void main(String []str){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
       
        if(twoSum(arr,target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
