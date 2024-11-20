package org.example.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.set("rounak","1");
        table.set("suman","3");
        table.set("shiva","4");
        table.set("rounak","2");
        table.set("chandan","5");
        table.set("Abhi","5");
        table.set("rekha","5");
        table.set("raju","5");

        table.printHashMap();
    }
}
