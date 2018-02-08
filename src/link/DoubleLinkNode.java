package link;

/**
 * @author daisy
 * @desc 双向链表节点
 * @create 2018/2/8
 */
public class DoubleLinkNode<T> {
    private T data;
    private DoubleLinkNode<T> pre;
    private DoubleLinkNode<T> next;

    public T getData() {
        return data;
    }

    public DoubleLinkNode<T> setData(T data) {
        this.data = data;
        return this;
    }

    public DoubleLinkNode<T> getPre() {
        return pre;
    }

    public DoubleLinkNode<T> setPre(DoubleLinkNode<T> pre) {
        this.pre = pre;
        return this;
    }

    public DoubleLinkNode<T> getNext() {
        return next;
    }

    public DoubleLinkNode<T> setNext(DoubleLinkNode<T> next) {
        this.next = next;
        return this;
    }
}
