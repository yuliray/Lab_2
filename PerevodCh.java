import java.util.Scanner;
public class PerevodCh {
    static private String  xToBin(int x){
        return (x!=0)?(xToBin(x/2)+x%2): "";
    }
    static public void main(String[] args){
        System.out.println("Input number: ");
        Scanner sc= new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("In binary: "+ xToBin(value));
        sc.nextLine();
    }
}
