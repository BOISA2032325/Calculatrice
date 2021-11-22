package sample;

public class ArrayStack {
    private int MaxSize;
    private int[] arr;
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.MaxSize = maxSize;
        arr = new int[MaxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {

        return top == MaxSize - 1;
    }

    public int peek(){
        return arr[top];
    }

    public void push(int val) {

        if (isFull()) {
            System.out.println("The stack is full.~~");
            return;
        }
        top++;
        arr[top] = val;
    }

    // Stack out
    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("The stack is empty and can't get out of the stack!");
        }
        int val = arr[top];
        top--;
        return val;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("no data");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public boolean isOper(char oper){
        return oper == '+' || oper == '-' || oper =='*' || oper == '/' || oper == '√' || oper =='^';
    }

    public int priority(int oper){
        if(oper == '^'){
            return 2;
        }
        else if(oper == '*' || oper == '/'){
            return 1;
        }
        else if(oper == '+' || oper == '-'){
            return 0;
        }
        else {
            return -1;
        }
    }

    public double cal(double num1,double num2,int oper){
        double res = 0.0;
        switch (oper){
            case '+': res = num1 + num2;
            break;
            case '-': res = num2 - num1;
            break;
            case '*': res = num1 * num2;
            break;
            case '/': res = num2 /num1;
            break;
            case '√': res = Math.sqrt(num1);
            break;
            case '^': res = Math.pow(num1,2);
        }
        return res;
    }

    public double cal2(double num,int oper){
        double res = 0.0;
        switch (oper){
            case '√': res = Math.sqrt(num);
                break;
            case '^': res = Math.pow(num,2);
        }
        return res;
    }
}
