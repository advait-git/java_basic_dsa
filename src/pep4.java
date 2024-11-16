import java.util.*;
import java.io.*;

public class pep4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lo=sc.nextInt();
        int hi=sc.nextInt();
        
        for(int i=lo;i<=hi;i++){
            int count =0;

            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }

            if(count==0){
                System.out.println(i);
            }
            
        }
    }
}
