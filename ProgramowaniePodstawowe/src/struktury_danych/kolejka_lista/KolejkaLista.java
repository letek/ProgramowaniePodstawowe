package struktury_danych.kolejka_lista;

public class KolejkaLista {

    private KolejkaElem first;
    private KolejkaElem last;

    KolejkaLista() {
        first = last = null;
    }

    public boolean isEmpty() {
        return (first == null);
        // bo nie może być tak, że first jest nulem a last nie

    }

    public void add(int values) {
        KolejkaElem elem = new KolejkaElem(values);
        if (isEmpty()) {
            first = last = elem;
        } else {
            last.setNext(elem);
            last = elem;
        }
    }

    public int peek() {
        return first.getValue();
    }

    public int poll(){
         if (isEmpty()) {
             //można wrzucić wyjatek
         }
        int value = first.getValue();
        first = first.getNext();
        if (first==null){last=null;}//jeżeli ostatni obiekt z kolejki
        return value;
    }

    public static void main(String[] args) {
        KolejkaLista kolejka = new KolejkaLista();
        kolejka.add(5);
        kolejka.add(10);
        kolejka.add(-100);
        System.out.println("Peek " +kolejka.peek()); //5
        System.out.println("Poll " +kolejka.poll()); //5
        System.out.println("Poll " +kolejka.poll());//10
        System.out.println("Poll " +kolejka.poll());//-100
    }

}
