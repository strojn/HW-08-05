package treeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Львів","Іванови");
        map.put("Київ","Петрови");
        map.put("Лондон","Абрамовичі");

        System.out.println(map.keySet().toString());

        System.out.println("Виберіть місто:");
        Scanner scanner = new Scanner(System.in);
        System.out.println( map.get(scanner.nextLine()) );
    }
}
