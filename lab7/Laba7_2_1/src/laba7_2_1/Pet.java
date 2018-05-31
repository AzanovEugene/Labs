package laba7_2_1;

public abstract class Pet {
    public String name;
    public int age;
    public boolean hungry;
    public abstract void voice();
    
    public static void main(String[] args) {
        Fish animal=new Fish();
        animal.voice();      
    }
    
}
