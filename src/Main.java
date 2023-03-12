import Queue.Queue;
import StackL.Stack;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack();
        Queue q = new Queue();

        for (int i = 0; i < 20; i++) {
            String temp = "Bro I'm testing this queue function 💀💀 ";
            q.enQueue(temp);
            System.out.println("User 1: " + temp);
        }


        while (!q.isEmpty()) {
            String temp = q.dequeue();
            stk.pushStack(temp);
        }

        System.out.println();

        while (!stk.isEmpty()) {
            System.out.println("User 2: " + stk.popStack());
        }
    }
}

