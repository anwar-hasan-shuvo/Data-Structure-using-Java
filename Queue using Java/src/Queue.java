import java.util.ArrayList;

public class Queue {

    ArrayList<Integer> value = new ArrayList<>();
    int count=0;

    //method of Enqueue
    public void enqueue(int data)
    {
        value.add(data);
        count++;
    }

    //method of Dequeue
    public void dequeue()
    {
        if(!value.isEmpty())
        {
            System.out.println("DEQUEUE: "+value.remove(value.size()-count));
            count--;
        }
        else
        {
            System.out.println("Empty Queue! Dequeue isn't possible from an empty queue");
        }
    }

    //method of showing value
    public void show()
    {
        if(!value.isEmpty())
        {
            System.out.println(value);
        }
    }

}
