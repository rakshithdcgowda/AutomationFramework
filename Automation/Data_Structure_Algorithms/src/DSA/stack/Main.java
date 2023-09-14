package DSA.stack;

public class Main {

    public static void main(String[] args)
    {
        Stack st=new Stack(5);

        st.getHeight();
        st.getTop();

        //add new node at the top of the stack list
        st.push(10);
        st.push(2);

        //remove top node from the stack list
        System.out.println(st.pop().value+ "\n");
        System.out.println(st.pop().value+ "\n");
        System.out.println(st.pop().value+ "\n");
        System.out.println(st.pop()+ "\n");


        st.printStack();
    }
}
