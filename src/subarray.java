import java.util.*;
import java.io.*;

public class subarray {
    public static boolean search(int ele, int[] arr,int k){
        int str=0;
        int end=k-1;
        while(str<=end){
            int mid=(str+end)/2;
            if(arr[mid] ==ele){
                return true;
            }else if(arr[mid]<ele){
                str=mid+1;
            }else{
                end=mid-1;
            }
        } 
        return false;
    }
    public static boolean isSub(int[] arr1,int m,int[] arr2,int n){
        if(m>n) return false;

        //gona sort the arr then use binary search

        Arrays.sort(arr2);
        for(int i=0;i<m;i++){
            boolean present=search(arr1[i],arr2,n);
            if(present==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        int m=arr1.length;
        int n=arr2.length;

        boolean ans= isSub(arr1,m,arr2,n);
        if(ans==true){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
