package laba4_4;
import java.util.Date;

public class Laba4_4 {
    
    static long fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
    
    public static void main(String[] args) {
       for (int i = 1; i <= 100; i++){
           Date start = new Date();
           System.out.println(fib(i));
           Date end = new Date();
           long dif = end.getTime() - start.getTime();
           if (dif > 60000){
               System.out.println(i);
               System.out.println(dif);
               break;
           }             
       } 
    } 
}
