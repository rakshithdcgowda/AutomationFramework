package DSA.hashtables;

public class Main {

    public static void main(String[] args) {
        HashTable ht = new HashTable();

        ht.set("Bolt", 100);
        ht.set("Nuts",300);
        ht.set("lights", 10);
        ht.set("screws",500);
        ht.set("Tyres",200);


        /*System.out.println(ht.get("lights"));
        System.out.println(ht.get("bulbs"));
        System.out.println(ht.get("Tyres"));*/

        System.out.println(ht.keys());


       // ht.printTable();
    }
}
