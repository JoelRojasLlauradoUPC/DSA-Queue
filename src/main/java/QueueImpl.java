public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;

    public QueueImpl(int len) {
        // TO-DO
        this.data = (E[])new Object[len];
    }

    public void push(E e) throws FullQueueException {
        // TO-DO
        if (isFull()) throw new FullQueueException();

        this.data[this.p++]=e;

    }


    public E pop() throws EmptyQueueException {
        // TO-DO
        if (isEmpty()) throw new EmptyQueueException();
        this.p--;
        int i = 1;
        while(i<this.p)
        {
            this.data[i--]=this.data[i];
            i++;
        }
        return this.data[0];
    }

    private boolean isFull() {
        // TO-DO
        boolean fullQueue = false;
        if(this.p==this.data.length) fullQueue = true;
        return fullQueue;
    }

    private boolean isEmpty() {
        // TO-DO
        boolean emptyQueue = false;
        if(this.p<this.data.length) emptyQueue = true;
        return emptyQueue;
    }

    public int size() {
        //TO-DO
        return this.p;
    }
}
