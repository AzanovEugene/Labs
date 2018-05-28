
package laba3_4;

public class Laba3_4 {

    public static void main(String[] args) {
        int mass[][] = new int [8][5];
        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 5; j++){
                int a = (int) (Math.random() * 90 + 10);
                mass[i][j] = a;
                System.out.print(mass[i][j] + " ");           
            }
            System.out.println(" ");
        }      
    }
}
