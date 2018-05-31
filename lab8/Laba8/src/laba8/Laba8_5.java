package laba8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Laba8_5 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 1; i < 10; i++)
            map.put("Key " + i, "Value " + i);
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, String> para = itr.next();
            String value = para.getValue();
            System.out.println(value);
        }
    }
}
