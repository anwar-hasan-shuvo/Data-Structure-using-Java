import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> value = new ArrayList<>();
    int top=0;

    //method of push
    public void push(int data)
    {
        value.add(top,data);
        top++;
    }


    //method of pop
    public void pop()
    {
        if(value.size() != 0)
        {
            System.out.println("\nPOP: "+value.remove(top-1));
            top--;
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }

    //method of getting size
    public int getSize()
    {
        return value.size();
    }

    //Method of showing value
    public void show()
    {
        if(!value.isEmpty())
        {
            System.out.println(value);
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }

}
