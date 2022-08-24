package STACK_QUEUE_LINKEDLIST;

// IS
import java.util.Scanner;
public class De_queue {
    int arr[],size,front,rear;
    De_queue(int l)
    {
        int arr[] = new int[10];
        front=0;
        rear=0;
        size=l;
    }
    void addfront(int val)
    {
        if(front>size-1)
        {
            System.out.println("Overflow from front");
        }
        else
        {
            arr[front++]=val;
        }
    }
    void addrear(int val)
    {
        if(rear>size-1)
        {
            System.out.println("Overflow from rear");
        }
        else
        {
            arr[rear++]=val;
        }
    }
    int popfront()
    {
        if (front == rear)
        {
            return -9999;
        }
        else
        {
            return arr[front--];
        }
    }
    int poprear()
    {
        if (front == rear)
        {
            return -9999;
        } else
        {
            return arr[rear--];
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter element");
        int a=in.nextInt();
        De_queue object = new De_queue(10);

        object.addrear(a);
        object.addrear(14);

        object.addfront(12);
        object.addrear(16);
        object.popfront();
        object.poprear();
    }
}
