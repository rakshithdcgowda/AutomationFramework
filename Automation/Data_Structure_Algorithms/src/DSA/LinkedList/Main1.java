package DSA.LinkedList;

public class Main1 {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(3);

        //myDLL.getHead();
        //myDLL.getTail();
        //myDLL.getLength();

        myDLL.append(5);
        myDLL.append(1);

       // myDLL.printList();

        //(3) items -returns 1 Node
      //  System.out.println(myDLL.removeLast().value);
        //2 Item- return 5 node
       // System.out.println(myDLL.removeLast().value);
        //1 iTem - returns 3 node
      //  System.out.println(myDLL.removeLast().value);
        //0 items - returns null
       // System.out.println(myDLL.removeLast());

        //adding new node at first
        myDLL.prepend(2);


        //myDLL.printList();

        //remove first will remove the first node in the list
      //  System.out.println(myDLL.removeFirst());

        //return the value by index
       // System.out.println(myDLL.get(2).value);
       System.out.println(myDLL.get(0).value+ "\n");

        // set the value by index
      //  myDLL.set(1,10);

        //insert-> add the new node by index
       // myDLL.insert(3,12);

        //remove node by index
      //  myDLL.remove(2);

        myDLL.printList();


    }


}
