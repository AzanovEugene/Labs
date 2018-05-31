package laba8;
import java.util.HashMap;

public class Laba8_6 {
    public static void main(String[] args) throws Exception{
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Собака", "друг");
        map.put("Родители", "семья");
        map.put("Оценка", 5);
        map.put("Рост", 150.5);
        map.put("Человек", "мужчина");
        map.put("Лабы", true);
        map.put("Университет", "ЮГУ");
        map.put("Диплом", "вода");
        map.put("Время", 0);
        map.entrySet().forEach((pair) -> {
            String key=pair.getKey();
            Object value=pair.getValue();
            System.out.println(key + " - " + value);});    
    }
}
