import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Queue queue = new Queue();

        System.out.print("Enter the no of values to be inserted: ");
        int choice = scanner.nextInt();

        for(int i=1;i<=choice;i++)
        {
            System.out.print("ENQUEUE: ");
            int data = scanner.nextInt();
            queue.enqueue(data);
        }

        queue.show();

        queue.dequeue();
        queue.dequeue();

        queue.show();

    }
}
