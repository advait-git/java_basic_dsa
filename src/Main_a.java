import java.util.*;
import java.io.*;

public class Main_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int count=0;
            for(int idx=2;idx*idx<=n;idx++){
                if(n%idx==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }

    }
}
