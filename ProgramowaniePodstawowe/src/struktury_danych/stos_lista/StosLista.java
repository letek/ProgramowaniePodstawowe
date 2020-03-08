package struktury_danych.stos_lista;

public class StosLista {

    private StosElem top;

    public StosLista() {
        this.top = null;
    }

    public void push(int value) {
        //StosElem elem = new StosElem(value,this.top);
        //this.top = elem;
        //inaczej
        this.top = new StosElem(value, this.top);
    }

    public int pop() {
        if (top == null) {
            throw new StosPustyException();
        }
        int value = top.getValue();
        this.top = top.getPrev();
        return value;

        //inaczej
//        int value = top.getValue();
//        StosElem prev = top.getPrev();
//        this.top = prev;
//        return value;
    }

    public int peek() {
        if (top == null) {
            throw new StosPustyException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void show() {
        StosElem tmp = top;
        while (tmp != null) {
            System.out.println(tmp.getValue() + " ");
            tmp = tmp.getPrev();
        }
    }

    public static void main(String[] args) {
        StosLista stos = new StosLista();
        stos.push(9);
        stos.push(100);
        stos.push(3);
        stos.show();
        //stos.push(9);
        //stos.push(9);

//        int a = 1;
//        while (a == 1) {
//            stos.push(7);
//            System.out.print(".");
//        }

        System.out.println("Pop " + stos.pop());
        System.out.println("Peek " + stos.peek());
        System.out.println("Pop " + stos.pop());
        System.out.println("Pop " + stos.pop());
        System.out.println("IsEmpty:  " + stos.isEmpty());
        try {
            //System.out.println("Pop " + stos.pop());
            stos.pop();
        } catch (StosPustyException wyjatek1111) {

            System.out.println(wyjatek1111.getMessage());
            //wyjatek1111.printStackTrace();
        } finally {
            System.out.println("Zawsze się wykonam!");
        }
        System.out.println("Colklwoek");
        //System.out.println(stos);

//        Integer a = 5;
//        Integer b = a;
//        System.out.println("A "+a);
//        System.out.println("B "+b);
//        a = 10;
//        System.out.println("A po zmianie A "+a);
//        System.out.println("B po zmianie A "+b);
    }

}
