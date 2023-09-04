package Linked_list;

/**
 * 1. @ClassName LinkedList
 * 2. @Description
 * 3. @Author huo
 * 4. @Date 2023/9/4 21:17
 */

public class LinkedList<E> implements List<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;

    public LinkedList(){
    }

    void linkFirst(E e){
        final Node<E> f =first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;

        if (f == null){
//            如果链表本来是空的，将尾指针指向新节点
            last = newNode;
        }else {
//            将新节点插入到头节点之前
            f.pre = newNode;
        }

        size++;
    }
    void linkLast(E e){
        final Node<E> l =last;
        final Node<E> newNode = new Node<>(l,e,null);
        last = newNode;

        if (l == null){
            first = newNode;
        }else{
            l.next = newNode;
        }
        size++;
    }
    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public boolean addFirst(E e) {
        linkFirst(e);
        return true;
    }

    @Override
    public boolean addLast(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public boolean remove(E e) {
        if (e == null){
            for (Node<E> x = first; x != null; x = x.next){
                if (x.item == null){
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next){
                if (e.equals(x.item)){
                    unlink(x);
                    return true;
                }
            }
        }

        return false;
    }
    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.pre;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.pre = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.pre = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public E get(int index) {
        return node(index).item;
    }

    Node<E> node(int index) {
//     >>是位运算符，表示右移操作。(size >> 1)将size的二进制表示向右移动一位，相当于将size除以2并取整
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.pre;
            return x;
        }
    }

    @Override
    public void print() {
        if (this.size == 0) {
            System.out.println("链表为空");
        } else {
            Node<E> temp = first;
            System.out.print("目前的列表，头节点：" + first.item + " 尾节点：" + last.item + " 整体：");
            while (temp != null) {
                System.out.print(temp.item + "，");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    /**
     * ？表示不确定的 java 类型
     * T (type) 表示具体的一个java类型
     * K V (key value) 分别代表java键值中的Key Value
     * E (element) 代表Element
     */
    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> pre;

        public Node(Node<E> pre, E element, Node<E> next){
            this.item = element;
            this.next = next;
            this.pre = pre;
        }
    }
}
