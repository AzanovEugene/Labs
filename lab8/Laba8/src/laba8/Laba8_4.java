package laba8;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class Laba8_4 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++)
            map.put("key " + i, "value");
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, String> para = itr.next();
            String key = para.getKey();
            System.out.println(key);
        }
    }
}
