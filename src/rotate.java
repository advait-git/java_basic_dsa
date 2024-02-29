import java.util.*;
import java.io.*;

public class rotate {
    public static void rev(int[] nums,int i,int j){
        while(i<j){
            int temps=nums[i];
            nums[i]=nums[j];
            nums[j]=temps;
            i++;
            j--;

        }
    }
    public static void arr(int[] nums,int k){

        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};
        arr(nums,2);
        for(int i=0;i<nums.length;i++){
          System.out.print(nums[i]+" ");
        }
       
    }
}
