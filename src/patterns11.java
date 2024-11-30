import java.io.*;
import java.util.*;

public class patterns11 {
    public static void main(String [] str){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int v=n*i;
            System.out.println(n+"*"+i+"="+v);
        }
        System.out.println();
    }
}
