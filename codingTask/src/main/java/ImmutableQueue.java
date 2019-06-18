import java.util.Deque;
import java.util.LinkedList;

public final class ImmutableQueue<T> implements Queue<T> {

    private final List<T> queue;

    public ImmutableQueue() {
        this(new LinkedList<>());
    }

    private ImmutableQueue(Deque<T> queue) {
        this.queue = queue;
    }

    @Override
    public Queue<T> enQueue(T t) {
        Deque<T> newQueue = new LinkedList<>(this.queue);
        newQueue.addLast(t);
        return new ImmutableQueue<>(newQueue);
    }

    @Override
    public Queue<T> deQueue() {
        Deque<T> newQueue = new LinkedList<>(this.queue);
        newQueue.removeFirst();
        return new ImmutableQueue<>(newQueue);
    }

    @Override
    public T head() {
        return queue.peekFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
