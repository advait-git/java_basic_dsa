import java.util.*;
import java.io.*;

public class test1 {
    public static void revrse(int[]nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void arr(int[]nums,int k){
        revrse(nums,0,nums.length-1);
        revrse(nums,0,k-1);
        revrse(nums,k,nums.length-1);
    }
    public static void main(String []str){
        int [] nums={1,2,3,4,5,6};
        arr(nums,2);
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
