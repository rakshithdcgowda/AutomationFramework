package DSA.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        //add value to last
        myLinkedList.append(6);
        myLinkedList.append(3);

        //remove 3 from list
       // System.out.println(myLinkedList.removeLast().value);

        //remove 6 from the list
        // System.out.println(myLinkedList.removeLast().value);

        //remove 4 from the list
       // System.out.println(myLinkedList.removeLast().value);

        // return null
       // System.out.println(myLinkedList.removeLast());


        // add value to first
        //myLinkedList.prepend(1);

        //remove the first element in the list
      //  myLinkedList.removeFirst();

        //get the value by index
       // System.out.println(myLinkedList.get(2).value+"\n");

        //set the value by index
        //myLinkedList.set(1,5);

        //Insert the value by using index
        myLinkedList.insert(2, 8);

        //remove the value by index
       // myLinkedList.remove(2);

        //reverse a list
        myLinkedList.reverse();


        myLinkedList.printList();
    }
}
