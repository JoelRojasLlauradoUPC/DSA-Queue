public class QueueImpl<E> implements Queue<E> {
    private E[] data;
    private int p;

    public QueueImpl(int len) {
        // TO-DO
        this.data = (E[]) new Object[len];
    }

    public void push(E e) throws FullQueueException {
        // TO-DO
        if (isFull()) throw new FullQueueException();

        this.data[this.p++] = e;

    }


    public E pop() throws EmptyQueueException {
        // TO-DO
        if (isEmpty()) throw new EmptyQueueException();
        E refers = this.data[0];
        this.shift();
        return refers;
    }

    private void shift() {
        this.p--;

        int i = 1;
        while (i < this.p) {
            this.data[i--] = this.data[i];
            i++;
        }
    }

    private boolean isFull() {
        // TO-DO
        return this.p == this.data.length;
    }

    private boolean isEmpty() {
        // TO-DO
        return this.p < this.data.length;
    }

    public int size() {
        //TO-DO
        return this.p;
    }
}
