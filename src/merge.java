import java.util.*;

public class merge {
    public static void Merge(int[] arr,int l,int mid,int r){
        int merged[] = new int[r-l+1];
        int idx1=l;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=r){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }else{
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=mid){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while(idx2<=r){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }
        for(int i=0,j=l;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void mergeSort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        Merge(arr,l,mid,r);
    }
    public static void main(String[] args){
        int[] arr={6,5,3,1,2,4};
        int n=arr.length;
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        
    }
}
