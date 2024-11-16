import java.util.*;
import java.io.*;

public class test3 {
    public static void main(String[] str){
        String s = "advait";
        String rev = " ";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            rev=ch+rev;
           
        }
        System.out.print(rev);
    }
}
