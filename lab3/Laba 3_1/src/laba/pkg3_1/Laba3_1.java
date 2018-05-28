package laba.pkg3_1;

public class Laba3_1 {

    
    public static void main(String[] args) {
        int i, a = 0;
        for (i = 2; i < 20 + 1; i++){
            if (i % 2 == 0)
                a++;
        }
        int [] mass = new int [a];
        for (i = 2, a = 0; i < 20 + 1; i++){
            if (i % 2 == 0){
                mass[a] = i;
                System.out.print(mass[a] + " ");
                a++;
            }           
        }
        System.out.println(" ");
        for (i = 0; i < mass.length; i++) { 
            System.out.println(mass[i]);
        }
    
    }
}
