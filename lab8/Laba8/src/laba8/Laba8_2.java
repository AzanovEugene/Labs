package laba8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Laba8_2 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("Арбуз", "Ягода");
        map.put("Бана", "Трава");
        map.put("Вишня", "Ягода");
        map.put("Груша", "Фрукт");
        map.put("Дыня", "Овощ");
        map.put("Ежевика", "Куст");
        map.put("Жень-шень", "Корень");
        map.put("Земляника", "Ягода");
        map.put("Ирис", "Цветок");
        map.put("картофель", "Клубень");
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, String> para = itr.next();
            String key = para.getKey();
            String value = para.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
