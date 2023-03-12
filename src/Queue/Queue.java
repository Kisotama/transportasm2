package Queue;

import java.util.LinkedList;

public class Queue {
    private int total = 0;
    private String[] queue;
    public int rear;
    public int front;
    public Queue(){
        queue = new String[250];
        rear = 0;
        front = -1;
    }

    public void enQueue(String s) {
        if (total <= 250){
            total ++;
            front++;
            queue[front] = s;
                }
            }


    public String dequeue(){
        if (total > 0){
            total --;
            String temp = queue[rear++];
            if (rear == queue.length){
                rear = 0;
                front = -1;
            }
            return temp;
        }
        return  "";
    }
    public boolean isEmpty(){
        return  total == 0;
    }
    public  boolean isFull(){
        return total == queue.length;
    }
}


