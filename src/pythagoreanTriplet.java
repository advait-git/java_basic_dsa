import java.io.*;
import java.util.*;

public class pythagoreanTriplet {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int max=n;
        if(m>=max){
            max=m;
        }
        if(l>=max){
            max=l;
        }
        if(max==n){
            boolean flag = ((m*m + l*l)==(n*n));
            System.out.println(flag);
        }else if(max==m){
            boolean flag = ((n*n + l*l)==(m*m));
            System.out.println(flag);
        }else{
            boolean flag = ((m*m + n*n)==(l*l));
            System.out.println(flag);
        }
    }
}
