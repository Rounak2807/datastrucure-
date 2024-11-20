package org.example.hashtable;

import java.util.ArrayList;

public class HashTable {
    private int size=7;
    private Node[] dataMap;
    public HashTable() {
        dataMap = new Node[size];
             }
    class Node {
        private String key;
        private String value;
        private Node next;
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    private int hash(String key){
        int hash = 0;
        for(int i = 0; i < key.length(); i++){
            hash = hash + ((int) (key.charAt(i)) *11);
        }
        return hash %dataMap.length;
    }
    public void set(String key, String value){
        int hash = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[hash]==null){
            dataMap[hash] = newNode;
        }
        else{
            Node temp = dataMap[hash];
            if(temp.key.equalsIgnoreCase(key)){
                temp.value =value;
                return;
            }
            while(temp.next!=null){
                if(temp.key.equalsIgnoreCase(key)){
                    temp.value =value;
                    return;
                }
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }
    public String get(String key){
        int index =hash(key);
        Node temp =dataMap[index];
        while(temp!=null){
            if(temp.key.equalsIgnoreCase(key)){
                return temp.value;
            }
            temp = temp.next;
        }
      return null;
    }
    public void printHashMap(){
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null) {
                System.out.println("Index:"+i+"key:" + temp.key + " value:" + temp.value);
                temp = temp.next;
            }
        }
    }
}
