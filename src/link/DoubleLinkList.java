package link;

import java.util.Iterator;

/**
 * @author daisy
 * @desc 双向链表
 * @create 2018/2/8
 */
public class DoubleLinkList<DoubleLinkNode> implements List<DoubleLinkNode>, Iterator{
    /** 头节点 */
   private DoubleLinkNode header;
   /** 尾节点 */
   private DoubleLinkNode tail;
   /** 节点个数 */
   private int size;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void add(DoubleLinkNode ele) {

    }

    @Override
    public void remove(DoubleLinkNode ele) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public DoubleLinkNode search(int index) {
        return null;
    }
}
