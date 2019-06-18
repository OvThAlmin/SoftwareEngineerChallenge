import java.util.NoSuchElementException;

public interface Queue<T> {

    /**
     * @param t added element at the end of deque
     */
    Queue<T> enQueue(T t);

    /**
     * @return head deque
     */
    Queue<T> deQueue();

    /**
     * @return first queue, or {@code null} when empty
     */
    T head();

    /**
     * @return {@code ture} when there are no elements
     */
    boolean isEmpty();
}