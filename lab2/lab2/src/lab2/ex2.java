package lab2;
import java.util.Scanner;

public class ex2 {
    
    static String encoding = System.getProperty("console.encoding", "windows-1251");
    static Scanner sc = new Scanner(System.in,encoding);
    
    public static int get_Int(){
        while (!sc.hasNextInt()){
                System.out.println("Введите корректное значение!");
                sc.nextLine();
        }
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }

public static void main(String[] args){

        int i, j;    
        System.out.print("Введите первое число - длину: ");
        int m = get_Int();
        System.out.print("Введите второе число - ширину: ");
        int n = get_Int();
            for (i = 0; i < m; i++) {
                for (j=0; j < n; j++) {
                    System.out.print("8");}
            System.out.print("\n");}               

}
}
