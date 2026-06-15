import java.util.ArrayList;
import java.util.Scanner;
public class Student
{

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String>history = new ArrayList<>();

//        System.out.println("Enter your name ");
//        String name = input.nextLine();
//
//        System.out.println("Enter your year of study");
//        int year = input.nextInt();
//        input.nextLine();
//
//        System.out.println("What is your course of interest");
//        String course = input.nextLine();
//
//        System.out.println("my name is " +name+ " a " +year+ " year student studying bachelor degree in " +course);

//        System.out.println("username");
//        String username = input.nextLine();
//
//        System.out.println("password:");
//        String password = input.nextLine();
//
//        if(username.equals("admin")&& password.equals("12345")){
//            System.out.println("login Successfull!");
//
//        }else{
//            System.out.println("invalid Credentials");
//        }

        while(true){
            System.out.println("\n 1.Add 2.Subtract 3.mutiply 4.Divide 5.History 6.Exit");
            int choice = input.nextInt();

            if(choice==6){
                System.out.println("history saved. Goodbye!!");
                break;
            }


            if(choice==5){
                System.out.println("\n ---History---");
                for(String h : history)System.out.println(h);
                continue;
            }

            System.out.println("first number: ");
            double a = input.nextDouble();

            System.out.println("second number: ");
            double b = input.nextDouble();
            double result = 0;

            if(choice==1)result = a + b;
            else if(choice==2)result = a - b;
            else if(choice==3)result = a * b;
            else if(choice==4)result = a / b;

            String calculation = a + (choice==1?"+" : "-")+b+"="+result;
            history.add(calculation);
            System.out.println("Result: " +result);

        }



    }
}