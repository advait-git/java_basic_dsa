import java.util.*;
import java.io.*;

public class pep7 {
    public static void main(String str[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            System.out.println(n%10);
            n=n/10;
        }
    }    
}
