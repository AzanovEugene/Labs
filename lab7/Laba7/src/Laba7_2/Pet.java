package Laba7_2;

public class Pet {
    
    public Pet getChild(){
        return new Pet();
    }
    
    public static void main(String[] args){
        Cat pet_c = new Cat();
        Pet cat = pet_c.getChild();
        
        Pet pet_d = new Dog();
        Pet dog = pet_d.getChild();
    }
}
