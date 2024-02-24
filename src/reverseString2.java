import java.util.*;
//abcdefg => bacdfeg , k=2 ,n=7
public class reverseString2 {
    public static String swap(char[] ch,int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        i++;
        j--; 

        return new String(ch); 
     }
    public static void main(String s,int k){

        //input string
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        k=sc.nextInt();
        //convert the string to char
        char[] ch = new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }

        int i=0;
        int n=ch.length;
        while(i<n){
            int j = Math.min(n-1,(i+k-1));
            swap(ch,i,j);
            i=i+2*k;
        }
    }
}
