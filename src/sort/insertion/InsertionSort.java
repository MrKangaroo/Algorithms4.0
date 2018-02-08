package sort.insertion;

import util.SortUtil;

/**
 * @author daisy
 * @desc 插入排序
 * @create 2018/2/7
 */
public class InsertionSort {

    public static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i=1; i < len ; i++){
            for(int j = i; j - 1>=0; j--){
                if(SortUtil.less(arr[j],arr[j-1])){
                    SortUtil.exch(arr, j, j-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = SortUtil.sourceArr;
        SortUtil.show(arr);
        insertionSort(arr);
        SortUtil.show(arr);
    }


}
