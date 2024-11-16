import java.io.*;
import java.util.*;

public class pep2 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        if(n>=90){
            System.out.println("Excellent");
        }else if(n>=80 && n<90){
            System.out.println("good");
        }else if(n>=70 && n<80){
            System.out.println("meet");
        }else{
            System.out.println("pass");
        }

    }
}
