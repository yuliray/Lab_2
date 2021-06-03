import java.util.Scanner;
public class fifthprim {
    public static int f(int n){
        System.out.println("f(" + n + ")");
        if(n==0){
            System.out.println("0");
            return 0;
        }else
        if(n==1){
            System.out.println("1");
            return 1;
        }else {
            return f(n-2)+f(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(f(5));
    }
}
