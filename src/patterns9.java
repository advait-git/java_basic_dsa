import java.io.*;
import java.util.*;
public class patterns9 {
    public static void main(String []str){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+"\t");
                val++;
            }
            System.out.println("\t");
        }
    }
}
