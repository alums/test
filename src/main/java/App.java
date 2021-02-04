package src.main.java;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        HashMap<String, Object> obj = new HashMap<>();

        obj.put("name", "Tom");
        obj.put("age", 11);
        obj.put("sex", "male");

        System.out.println(obj);
    }
}
