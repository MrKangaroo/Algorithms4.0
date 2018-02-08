package link;

/**
 * @author daisy
 * @desc 链表接口
 * @create 2018/2/8
 */
public interface List<T> {
    /**
     * 添加节点
     */
    void add(T ele);

    /**
     * 删除节点
     */
    void remove(T ele);

    /**
     * 删除节点
     */
    void remove(int index);

    /**
     * 链表大小
     */
     int size();

    /**
     * 搜索
     * @param index
     * @return
     */
     T search(int index);
}
