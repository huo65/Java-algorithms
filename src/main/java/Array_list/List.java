package Array_list;

/**
 * 1. @ClassName List
 * 2. @Description list接口
 * 3. @Author huo
 * 4. @Date 2023/9/5 23:19
 */
public interface List<E> {
    boolean add(E e);

    E remove(int index);

    E get(int index);

}
