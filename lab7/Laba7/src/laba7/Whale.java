package laba7;

public class Whale extends Cow {
    public void getName(){
        System.out.println("Я кит, а не корова");
    }
    public static void main(String[] args){
        Whale whale = new Whale();
        whale.getName();
    }
}
