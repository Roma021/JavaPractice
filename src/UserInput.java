import java.util.Scanner;
public class UserInput {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        //System.out.println("What's your name? ");
        //String name = reader.nextLine();

        //System.out.println("Hi, " + name);

        //System.out.println("How old are you? ");
        //int number = Integer.parseInt(reader.nextLine());
        //System.out.println("You are " + number + " Years old.");

        //System.out.println("What's your name? ");
       // String name = reader.nextLine();

       // System.out.println("How old are you? ");
       // int age = Integer.parseInt(reader.nextLine());

       // System.out.println("Your name is " + name + " and you are " + age + " years old.");

      //  System.out.println("Type a number: ");
      //  int numberA = Integer.parseInt(reader.nextLine());
      //  System.out.println("Type another number: ");
      //  int numberB = Integer.parseInt(reader.nextLine());

     //   int sum = numberA + numberB;

       // System.out.println("Sum of the numbers is " + sum);

      //  System.out.println("Enter a number: ");
      //  int a = Integer.parseInt(reader.nextLine());

      //  System.out.println("Enter another number: ");
      //  int b = Integer.parseInt(reader.nextLine());

      //  double quotient = (double)a/b;

      //  System.out.println("Division: " + a + " / " + b + " = " + quotient);

       // System.out.println("Type the radius: ");
       // int radius = Integer.parseInt(reader.nextLine());

      //  double circumference = 2 * Math.PI * radius;

      //  System.out.println("Circumference of the circle: " + circumference);

        System.out.println("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());

        int bigerNum = Math.max(x,y);

        System.out.println("The bigger number of the two numbers given was: " + bigerNum);

    }


}
