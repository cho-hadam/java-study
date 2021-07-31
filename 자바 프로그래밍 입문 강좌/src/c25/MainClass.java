package c25;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("Hello");
    list.add("Java");
    System.out.println(list);

    list.set(1, "C");
    System.out.println(list);

    String str = list.get(1);
    System.out.println("list.get(1): " + str);
    System.out.println(list);

    str = list.remove(1);
    System.out.println("list.remove(1): " + str);
    System.out.println(list);

    list.clear();
    System.out.println("list.clear(): " + list);

    boolean b = list.isEmpty();
    System.out.println("list.isEmpty(): " + b);

    System.out.println();

    HashMap<Integer, String> map = new HashMap<Integer, String>();

    map.put(2, "Hello");
    map.put(6, "Java");
    System.out.println(map);

    map.put(6, "C");
    System.out.println(map);

    str = map.get(2);
    System.out.println("map.get(2): " + str);

    str = map.remove(6);
    System.out.println("map.remove(6): " + str);
    System.out.println(map);

    b = map.containsKey(2);
    System.out.println("map.containsKey(2): " + b);

    b = map.containsValue("World");
    System.out.println("map.containsValue(\"World\"): " + b);

    map.clear();
    System.out.println("map.clear(): " + map);

    b = map.isEmpty();
    System.out.println("map.isEmpty(): " + b);
  }
}
