package DSA;

public class Main {

    public static void main(String[] args)
    {
        Cookie c1=new Cookie("blue");
        Cookie c2= new Cookie("Red");

        c2.setColor("white");


        System.out.println(c1.getColor());
        System.out.println(c2.getColor());
    }
}
