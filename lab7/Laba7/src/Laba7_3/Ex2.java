package Laba7_3;
import java.util.Scanner;

public class Ex2 {
    static Scanner sc = new Scanner(System.in);
    
    public static int get_Int(){
        while (!sc.hasNextInt()){
            System.out.println("Введите целое число!");
                sc.nextLine();
        }
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }
    
    public static int print(int n){
        return n;       
    }
    public static Integer print(Integer n){
        return n;
    }
    
    public static void main(String[] args){
        int n = get_Int();
        int m = get_Int();
        System.out.println(print(n));
        System.out.println(print(new Integer (m)));
    }
}
