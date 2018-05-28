package lab2;
import java.util.Scanner;

public class ex4 {

    static String encoding = System.getProperty("console.encoding", "windows-1251");
    static Scanner sc = new Scanner(System.in,encoding);    
   
    static float minNumber(int a, int b){
        if (a>b){
            return b;
        }
        else{
            return a;
        }
    }
    
    public static int get_Int(){
        while (!sc.hasNextInt()){
            System.out.println("Введите корректное значение!");
                sc.nextLine();
        }
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }

            
    public static void main(String[] args) {
        
        System.out.print("Write first number: ");
        int a = get_Int();        
        System.out.print("Write second number: ");
        int b = get_Int();        
        System.out.println("Minimum number is " + minNumber(a,b) );
            
    }
}