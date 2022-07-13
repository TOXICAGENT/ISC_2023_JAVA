package STACK_QUEUE_LINKEDLIST;

import java.util.Scanner;
public class Chain {
    int ele[] = new int[50];
    int cap, front, rear;

    Chain(int max) {
        cap = max;
        front = rear;
        rear = 0;
        ele = new int[max];
    }

    void pushfront(int v) {
        if (front > 0) {
            front = front - 1;
            ele[front] = v;

        } else {
            System.out.println("full from front");
        }
    }

    int popfront() {
        if (front == rear) {
            front = 0;
            rear = 0;
            return -9999;
        } else {

            return ele[front++];
        }
    }

    void pushrear(int v) {
        if (rear < cap-1) {

            ele[rear++] = v;
        } else {
            System.out.println("full from rear");
        }

    }

    int poprear() {
        if (front == 0 && rear == 0) {

            return -9999;
        } else {
            rear = rear - 1;
            return ele[rear];
        }
    }
}