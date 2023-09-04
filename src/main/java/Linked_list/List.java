package Linked_list;

/**
 * 1. @ClassName List
 * 2. @Description List接口
 * 3. @Author huo
 * 4. @Date 2023/9/4 21:20
 */
public interface List<E> {

    boolean add(E e);
    boolean addFirst(E e);
    boolean addLast(E e);

    boolean remove(E e);

    E get(int index);

    void print();

}
