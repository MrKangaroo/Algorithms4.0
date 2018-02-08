package link;

/**
 * @author daisy
 * @desc 链表节点
 * @create 2018/2/8
 */
public class LinkNode<T> {
    private T data;
    private LinkNode next;

    public T getData() {
        return data;
    }

    public LinkNode setData(T data) {
        this.data = data;
        return this;
    }

    public LinkNode getNext() {
        return next;
    }

    public LinkNode setNext(LinkNode next) {
        this.next = next;
        return this;
    }

    public LinkNode(T data, LinkNode next) {
        this.data = data;
        this.next = next;
    }
}
