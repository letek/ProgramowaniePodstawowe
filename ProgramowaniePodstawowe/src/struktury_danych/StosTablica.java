package struktury_danych;

public class StosTablica {

    private int[] tab;
    private int top;

    public StosTablica(int size) {
        tab = new int[size];
        top = -1;
    }

    public void push(int value) {
        tab[++top] = value;
        //preincrementacja
        //powinno obsłużyć wyjatek jeżeli stos pełny
    }
    public int pop(){
        return tab[top--];
        //postinkrementacja
        //powinno obsłużyć wyjatek jeżeli stos pusty
    }

    public int getTop() {
        return top;
    }

    public int peek(){
        return tab[top];
    }
    public int size(){
    return top+1;
    }
    public boolean isEmpty(){
//        if(top==-1) return true;
//        else return false;
        return top == -1;
    }

    public static void main(String[] args) {
StosTablica stosTablica = new StosTablica(5);

        stosTablica.push(5);
        stosTablica.pop();
        //stosTablica.pop();
//        stosTablica.pop();
//        stosTablica.pop();
//        stosTablica.pop();
        System.out.println(stosTablica.peek());
        System.out.println(stosTablica.top);

//        push(1);
//        push(99);
//        push(-7);
    }

}
