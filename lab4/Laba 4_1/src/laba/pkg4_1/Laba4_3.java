package laba.pkg4_1;

public class Laba4_3 {
    public static void main(String[] args) {
        Laba4_3 met = new Laba4_3();
        met.testQuickSort();
    }  
    int partition(int mass[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int main = mass [(left + right) / 2];
        
        while (i <= j){
            while(mass[i] < main)
                i++;
            while(mass[j] > main)
                j--;
            if (i <= j){
                tmp = mass[i];
                mass[i] = mass[j];
                mass[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
    void quickSort(int mass[], int left, int right){
        int index = partition(mass, left, right);
        if (left < index - 1)
            quickSort(mass, left, index - 1);
        if (index < right)
            quickSort(mass, index, right);
    }
    public void testQuickSort(){
        int[] mass = new int [10];
        for(int i = 0; i < mass.length; i++){
            mass[i] = (int) Math.round(Math.random() * 100);
            System.out.print(mass[i] + " ");
        }
        quickSort(mass, 0, mass.length - 1);
        System.out.println();
        
        for(int i = 0; i < mass.length; i++)
            System.out.print(mass[i] +" ");       
    }
}
