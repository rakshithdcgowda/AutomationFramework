package DSA.binarysearchtree;

public class Main {

    public static void main(String[] args)
    {
        BinarySearchTree bt=new BinarySearchTree();

        System.out.println("Root= "+bt.root);

        bt.insert(10);
        bt.insert(20);
        bt.insert(4);
        bt.insert(5);

        System.out.println("Root= "+bt.root.left.value);

        //return true/false if present/not
        System.out.println(bt.contains(4));
        System.out.println(bt.contains(2));


    }
}
