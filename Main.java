import java.util.Scanner;
public class Main{

    public static void main (String args[])
    {
//     float number0 = 20;
//     float number1 = 30;
//      float results = number0 + number1;
//      System.out.println (results);
//
         Scanner input=new Scanner(System.in);

        System.out.println("Enter Age");
        int Age = input.nextInt();

        System.out.println("Enter height");
        float height =input.nextFloat();

        if(Age>=height)
            System.out.println("adult");
        else if (Age<height)
                System.out.println("child");

    }
}
