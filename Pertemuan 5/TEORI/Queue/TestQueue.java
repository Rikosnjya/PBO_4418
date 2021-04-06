package testqueue;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        metode test = new metode();
        test.output();
    }
}

class MainQueue {
    Queue<Integer> myQueue = new LinkedList<Integer>();

    public void ElementsQueue() {
        for (int i = 0; i < 15; i++)
            myQueue.add(i);
        System.out.println("Elements of queue " + myQueue);
    }
}

class metode extends MainQueue {

    void hapus() {
        int hapus = myQueue.remove();
        System.out.println("Element yang dihapus= " + hapus);
        System.out.println(myQueue);
    }

    void ganti() {
        int merubah = myQueue.poll();
        myQueue.offer(10);
        System.out.println("Head Elements of queue now: " + merubah);
    }

    void angkaDepan() {
        int depan = myQueue.peek();
        System.out.println("Elements of queue now " + myQueue);
        System.out.println("Head Elements of queue now = " + depan);
    }

    void rangeList() {
        int size = myQueue.size();
        System.out.println("Panjang element queue= " + size);
    }

    void output() {
        super.ElementsQueue();
        hapus();
        ganti();
        angkaDepan();
        rangeList();
    }
}
