package laba5;
import java.util.Scanner;

public class Laba5 {
    
    static String encoding = System.getProperty("console.encoding", "windows-1251");
    static Scanner sc = new Scanner(System.in,encoding); 
    
    public static int get_Int(){
        while (!sc.hasNextInt()){
            System.out.println("Введите корректное значение!");
                sc.nextLine();
        }
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }
    //---------------------------------------###--------------------------------------------------
    public static class Circle{
        public double x, y, r;
        
        // Вычисление длины окружности (Задание 1)
        void longCircle(){
            System.out.println("P = " + Math.PI * r * 2);
        }
        
        //Перемещает центр окружности в рандомную точку (Задание 2)
        public Circle(int a){
            x = (int) (Math.random() * 199) - 99;
            y = (int) (Math.random() * 199) - 99;
            r = (int) (1 + Math.random() * a );
            System.out.println("Центр окружности: x = " + x + " y = " + y + " С радиусом " + r);
          
        }
        
        //Ввод координат центра окружности и радиуса(Задание 3)
        public Circle(){
            System.out.print("Введите x: ");
            x = get_Int();
            System.out.print("Введите y: ");
            y = get_Int();
            System.out.print("Введите радиус: ");
            r = get_Int();
        
        }
        
        //Расстояние между 2 окружнастями(Задание 4)
        void distance(Circle circ){
            double dx = this.x - circ.x;
            double dy = this.y - circ.y;
            double d = Math.sqrt(dx * dx + dy * dy);
            double dd = d - this.r - circ.r;
            System.out.println("Расстояние между центрами: " + d);
            System.out.println("Расстояние окружнастями: " + dd);
        }
        //Пересечение окружностей в точке (5 задание)
        public void tCircle (Circle circ){
            double a = circ.x - this.x;
            double b = circ.y - this.y;
            double s = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            if (s == Math.abs(this.r - circ.r) || s == this.r + circ.r){
                System.out.println("Окружности касаються в точке");
            } else {
                System.out.println("Окружности не касаються");
            }
        }
    }
//Основной ход программы
    public static void main(String[] args) {
        System.out.print("Введите максимальный радиус для 1 окружности: ");
        int a = get_Int();  
        Circle cir_1 = new Circle(a);
        Circle cir_2 = new Circle();
        System.out.println("------------------------###------------------------");
        cir_1.tCircle(cir_2);
        cir_1.longCircle();
        cir_2.longCircle();
        cir_1.distance(cir_2);
        
    }   
}
