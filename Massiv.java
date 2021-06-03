import java.util.Scanner;
public class Massiv {
    static int [] arr;
    static Scanner sc;

    public static void fillArrRec(int i){
        if(i<arr.length){
            System.out.println("Input number with "+i+" index");
            arr[i]=sc.nextInt();
            fillArrRec(++i);
        }
    }

    public static void printArrRec(int i){
        if(i<arr.length){
            System.out.print(arr[i]);
            printArrRec(++i);
        }
    }

    public static void main(String[] args){
        arr=new int[5];
        sc=new Scanner(System.in);
        fillArrRec(0);
        printArrRec(0);
    }
}
