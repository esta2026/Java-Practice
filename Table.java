import java.util.Scanner;
public class Table
{

    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int anynum=input.nextInt();
        for(int i = 0; i<=12; ++i)
        {
            float result = anynum * i;
            System.out.println(anynum + "x "+ i +"=" + result);
        }

    }
}
