package lab2;
import java.util.Scanner;


public class ex6 {
    
static String encoding = System.getProperty("console.encoding", "windows-1251");
static Scanner sc = new Scanner(System.in,encoding); 
    
    public static int get_Int(){
        while (!sc.hasNextInt()){
            System.out.println("Введите корректное значение");
                sc.nextLine();
        }
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }
    
    public static int min(int a, int b){
        int min1;
        if (a>b)
            min1 = b;
        else
            min1 = a;
        return min1;
    }
       
    public static int min(int a, int b, int c, int d){
        int min2;
        if (min(a,b) < min(c,d))
            min2 = min(a,b);
        else 
            min2=min(c,d);
        return min2;   
    }
    
    public static void main(String[] args) {
        System.out.println("Введиет первое число: ");
        int a = get_Int();
        System.out.println("Введиет второе число: ");
        int b = get_Int();
        System.out.println("Введиет третье число: ");
        int c = get_Int();
        System.out.println("Введиет четвёртое число: ");
        int d = get_Int();
        System.out.println(min(a,b,c,d));        
    }
}