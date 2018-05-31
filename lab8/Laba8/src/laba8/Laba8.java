package laba8;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Laba8 {
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Арбуз");
        set.add("Банан");
        set.add("Вишня");
        set.add("Груша");
        set.add("Дыня");
        set.add("Ежевика");
        set.add("Жень-шень");
        set.add("Земляника");
        set.add("Ирис");
        set.add("Картофель");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            String text = itr.next();
            System.out.println(text);
        }
    }   
}
