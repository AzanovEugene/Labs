package lab2;
import java.util.Scanner;


public class ex5 {
    
    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "windows-1251");
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Первое имя");
        s1 = sc.nextLine();
        System.out.println("Второе имя");
        s2 = sc.nextLine();
        if (s1.equals(s2))
            System.out.println("Имена идентичны");
        else
            if(s1.length()==s2.length())
                System.out.println("Длины имен равны");
    }        
}
