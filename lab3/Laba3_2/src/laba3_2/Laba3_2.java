package laba3_2;

public class Laba3_2 {

    public static void main(String[] args) {
        int i, a = 0;
        for (i = 1; i < 100; i++){
            if (0 != i % 2)
                a++;
        }
        
        int[] mass = new int[a];
        for (i = 1, a = 0; i < 100; i++) {
            if (i % 2 != 0) {
                mass[a] = i;
                System.out.print(mass[a] + " ");
                a++;
            }
        }
        
        System.out.println(" ");
        for (i = 100, a = 0; i >= 1; i--) {
            if (i % 2 != 0) {
                mass[a] = i;
                System.out.print(mass[a] + " ");
                a++;
            }
        }
    }
    
}
