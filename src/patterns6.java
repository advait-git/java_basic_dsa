import java.util.Scanner;

public class patterns6 {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
            if(i==j){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
           }  
            System.out.println();    
        }
    }
}