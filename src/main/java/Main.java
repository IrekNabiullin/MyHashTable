import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        Hashtable<String,  Integer> myTable = new Hashtable<String, Integer>();
        HashSet<String> mySet = new HashSet<>();
        MyHashTable<String,  Integer> myHashTable = new MyHashTable<String, Integer>();
//        myTable.put("one", 1);
//        System.out.println(myTable.put("one", 1));
        myHashTable.put("one", 1);
        myHashTable.put("2", 2);
        myHashTable.put("3", 3);
        myHashTable.put("4", 4);
        myHashTable.put("5", 5);
        myHashTable.put("6", 6);
        myHashTable.put("7", 7);
        myHashTable.put("8", 8);
        myHashTable.put("9", 9);
        myHashTable.put("10", 10);
        myHashTable.put("11", 11);
        myHashTable.put("12", 12);
        myHashTable.put("13", 13);
        myHashTable.put("14", 14);
        myHashTable.put("15", 15);
        myHashTable.put("16", 16);
        myHashTable.put("17", 17);
        myHashTable.put("18", 18);
//        myHashTable.put("one", 1);
        System.out.println("Main menu: " + myHashTable.put("one", 1));
//        System.out.println(myTable.put("one", 1).equals(myHashTable.put("one", 1)));
//        System.out.println(hash(200));
        myTable.keys();
    }

    static int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
}
