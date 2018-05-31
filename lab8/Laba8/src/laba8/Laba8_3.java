package laba8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
        
public class Laba8_3 {
    public static void main(String[] args){
        Cat[] cats = new Cat[10];
        String[] names = new String[]{"Котэ", "Барсик", "Мурзик", "Том", "Гарфилд", "Борис","Лаки","Тор", "Локи", "Кокс" };
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        for (int i = 0; i < 10; i++){
            cats[i] = new Cat(names[i]);
            map.put(cats[i].name, cats[i]);
        }
        Iterator<Map.Entry<String, Cat>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
        Map.Entry<String, Cat> para = itr.next();
        System.out.println(para.getKey());
        }
    }
}
