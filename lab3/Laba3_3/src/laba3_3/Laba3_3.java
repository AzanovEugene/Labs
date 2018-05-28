package laba3_3;


public class Laba3_3 {
 
    public static void main(String[] args) {
        int j = 0;
        int mass[] = new int[15];
        for(int i = 0; i < 15; i++){
            int a = (int) (Math.random() * 10);
            mass[i] = a;
            System.out.print (a + " ");
            if (mass[i] % 2 == 0){
                if (mass[i] != 0)
                    j++;
            }
        }
        System.out.println();
        System.out.println("Четных чисел в массиве: " + j);
    }
    
}
