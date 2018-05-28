package laba.pkg4_1;

public class Laba4_1 {
    
    public static int numbers (int a, int b){
        return (int) (Math.random() * (b - a + 1)) + a;
    } 

    public static void main(String[] args) {
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++){
           mass[i] = numbers(-47, 50);
           System.out.print(mass[i] + " ");
        }
    }    
}
