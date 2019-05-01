import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack();

        System.out.print("Enter the number of values to be inserted in stack: ");
        int choice = scanner.nextInt();

        for(int i=1;i<=choice;i++)
        {
            System.out.print("PUSH: ");
            int data = scanner.nextInt();
            stack.push(data);
        }

        System.out.print("Stack: ");
        stack.show();

        stack.pop(); // Removing the last inserted value as LIFO

        System.out.print("Stack: ");
        stack.show();
    }
}
