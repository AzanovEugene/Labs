package laba.pkg4_1;

public class Laba4_2 {
    
    public static void output_array(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];
        int[] mass3 = new int[10];
        int[] mass4 = new int[10];
        int[] mass5 = new int[10];
        for (int i = 0; i < mass2.length; i++) {
            mass1[i] = Laba4_1.numbers(-30,30);
            mass2[i] = Laba4_1.numbers(-30,30);
            mass3[i] = Laba4_1.numbers(-30,30);
            mass4[i] = Laba4_1.numbers(-30,30);
            mass5[i] = Laba4_1.numbers(-30,30);           
        }
        output_array(mass1);
        output_array(mass2);
        output_array(mass3);
        output_array(mass4);
        output_array(mass5);
    }
}

    

