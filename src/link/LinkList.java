package link;

import java.util.Iterator;

/**
 * @author daisy
 * @desc 单向链表
 * @create 2018/2/8
 */
public class LinkList<LinkNode> implements List<LinkNode>, Iterator {
    /**
     * 根结点/头节点
     */
    private LinkNode root;
    /**
     * 链表大小
     */
    private int size;

    /**
     * 添加节点
     */
    @Override
     public void add(LinkNode ele){

     }

    @Override
    public void remove(LinkNode ele) {

    }


    /**
     * 删除节点
     */
    @Override
    public void remove(int index) {
        LinkNode ele = search(index);
        remove(ele);
    }

    /**
     * 链表大小
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * 搜索
     * @param index
     * @return
     */
    @Override
    public LinkNode search(int index){
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
