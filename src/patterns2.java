import java.io.*;
import java.util.*;

public class patterns2 {
    public static void main(String[] str){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
