import java.io.*;
import java.util.*;

public class pep3 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        for(int i=2;i*i<=n;i++){ // opti 1
            if(n%i==0){
                count++;
                break;  //optimazation 2
            }
        }
        if(count==0){
            System.out.println("Prime");
    }
    else{
        System.out.print("Not Prime");
    }
}
}
