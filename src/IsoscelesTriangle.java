import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner in=new Scanner(System.in);
        System.out.print("a=");
        a=in.nextDouble();
        System.out.println(a);
        System.out.print("b=");
        b=in.nextDouble();
        System.out.println(b);
        System.out.print("c=");
        c=in.nextDouble();
        System.out.println(c);
        in.close();

        if (a==b||a==c||b==c)
        {
            System.out.println("Triangle is isosceles");
        }
        else {
            System.out.println("not isosceles");
        }
    }
}
