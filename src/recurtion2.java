import java.util.Scanner;

public class recurtion2 {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printInt(n);
    }
    public static void printInt(int n){
        if(n==0){
            return;
        }
        printInt(n-1);
        System.out.println(n);
    }
}
