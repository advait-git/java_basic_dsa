import java.io.*;
import java.util.*;
public class Pepe1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }

    }
}
