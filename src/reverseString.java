import java.util.*;
import java.io.*;
public class reverseString {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String cha= sc.nextLine();

        // i can easily write: char[] arr = cha.toCharArray();
        char[] arr =new char[cha.length()];
        for(int i=0;i<cha.length();i++){
            arr[i]=cha.charAt(i); //converted into array format from string
        }
        //swap
        int left=0;
        int right=arr.length-1;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        //convert it again to string
        String reverse = new String(arr);
        System.out.print(reverse);

    }
}
