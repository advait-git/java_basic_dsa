import java.util.*;
import java.io.*;

public class test2 {
    public static void main(String []str){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>2 && n%2!=0){
            System.out.println("YES");
        }else if(n==2){
            System.out.print("yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
