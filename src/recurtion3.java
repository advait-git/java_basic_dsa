
import java.util.Scanner;

public class recurtion3 {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pdi(n);
    }
    public static void pdi(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
