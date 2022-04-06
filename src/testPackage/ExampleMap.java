package testPackage;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        
        System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));
    }
}