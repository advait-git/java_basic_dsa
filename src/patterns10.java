import java.io.*;
import java.util.*;

public class patterns10 {
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int icj=1;
            for(int j=0;j<=i;j++){
               System.out.print(icj+"\t");
               int icjp1 = icj * (i-j) /(j+1);
               icj=icjp1;
            }
            System.out.println();
        }
    }
}
