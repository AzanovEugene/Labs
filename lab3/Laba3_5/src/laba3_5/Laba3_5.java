package laba3_5;

public class Laba3_5 {

    public static void main(String[] args) {
        int[][] mass = new int[7][4];
        int max = 0;
        int string = 0;
        for (int i = 0; i < 7; i++){
            int x = 1;
            for (int j = 0; j < 4; j++){
                mass[i][j] = (int)(Math.random() * 12 - 6);
                System.out.print(mass[i][j] + " ");
                x *= Math.abs(mass[i][j]);
            }
            System.out.println();
            if (x > max){
                max = x;
                string = i + 1;
            }
        }
        System.out.println("Строка №: " + string);
        System.out.println("Наибольшее произведение: " + max);
    }
    
}
