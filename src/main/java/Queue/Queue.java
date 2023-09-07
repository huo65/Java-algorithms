package Queue;

/**
 * 1. @ClassName Queue
 * 2. @Description 队列接口
 * 3. @Author huo
 * 4. @Date 2023/9/7 20:00
 */
public interface Queue<E> {

    boolean add(E e);

    boolean offer(E e);

    E poll();

    E peek();

}