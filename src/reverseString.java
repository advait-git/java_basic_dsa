import java.util.*;
import java.io.*;
public class reverseString {
    public static void main(String[] a){
        //this line will take the input for the string
        Scanner sc=new Scanner(System.in);
        String word= sc.nextLine();

        // i can easily write: char[] arr = cha.toCharArray();
        char[] arr =new char[word.length()];
        for(int i=0;i<word.length();i++){
            arr[i]=word.charAt(i); //converted into array format from string
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
