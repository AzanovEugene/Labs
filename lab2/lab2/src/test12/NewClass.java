package test12;
import java.util.Scanner;

public class NewClass {
    
    static String encoding = System.getProperty("console.encoding", "windows-1251");
    static Scanner sc = new Scanner(System.in,encoding);

    public static int get_Int(){
            while (!sc.hasNextInt()){
                    System.out.println("Invalid data");
                    sc.nextLine();
                }
            int result = sc.nextInt();
            sc.nextLine();
            return result;
    }

public static void main(String[] args){
    
    int a = get_Int();
    int b = get_Int();
    System.out.print(a+b);
    
} 

}
