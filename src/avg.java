import java.io.*;
import java.util.*;

public class avg {
    public static void main(String[] args){
        int sum=0;

        int[] nums={1,2,3,4,5,19};
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int avg=sum/nums.length;
        System.out.print(avg);
    }
}
