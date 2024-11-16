import java.util.*;
import java.io.*;

public class test4 {
    public static String rev(String a){
        char[] arr=new char[a.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=a.charAt(i);
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);

    }
    public static void main(String[]str){

        String a="Advait";
       System.out.print(rev(a));
    }   
}
