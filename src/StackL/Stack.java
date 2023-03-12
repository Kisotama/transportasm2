package StackL;


public class Stack {
    private String[] stack;
    private int index;
    private int total = 0;

    public Stack(){
        stack = new String[250];

    }
    public void pushStack(String s){
        if (index < 247){
            total++;
            stack[++index] = s;
        }
    }
    public String popStack(){
        if (index >= 0){
            total--;
            return stack[index--];
        }
        return "";
    }


    public boolean isEmpty(){
        return total == 0;
    }
    public boolean isFull(){
        return total == 250;
    }
}
