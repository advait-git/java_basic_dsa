import java.io.*;
import java.util.*;

public class primefactor {
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        for(int m=2;m*m<=n;m++){
            while(n%m==0){
                n=n/m;
                System.out.println(m);
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
