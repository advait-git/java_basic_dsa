import java.util.*;
import java.io.*;
public class count {
    public static void main(String a[]){
        int arr[]={1,2,3,4,5,5,4,3,2,1,1,1};
        int n=arr.length;
        countFreq(arr,n);
    }
    public static void countFreq(int[] arr,int n){
        boolean [] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
}
