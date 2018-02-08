package sort;

import util.SortUtil;

/**
 * @author daisy
 * @desc 快速排序
 * @create 2018/2/7
 */
public class QuickSort {
    public static int partition(int[] arr, int from, int to) {
        int p = arr[from];
        int low = from + 1;
        int high = to;
        while (true) {
            while (SortUtil.less(arr[low], p)) {
                if (low == to) {
                    break;
                }
                low++;
            }
            while (SortUtil.less(p, arr[high])) {
                if (from == high) {
                    break;
                }
                high--;
            }
            if (low >= high) {
                break;
            }
            SortUtil.exch(arr, low, high);
        }
        SortUtil.exch(arr, from, high);
        return high;
    }

    /**
     * 手写
     * @param arr
     * @param from
     * @param to
     * @return
     */
    public static int partition2(int[] arr, int from, int to) {
        if(from == to) {
            return from;
        }
        int p = arr[from];
        int low = from + 1;
        int high = to;
        while(true){
            while(low <= to){
                if(SortUtil.less(arr[low], p)){
                    low++;
                }else{
                    break;
                }
//                if(low == to){
//                    return high;
//                }
            }
            while(from <= high){
                if(SortUtil.less(p, arr[high])){
                    high--;
                }else{
                    break;
                }
//                if(from == high){
//                    return low;
//                }
            }
            if(low != high){
                SortUtil.exch(arr, low ,high);
            }else{
                return low;
            }
        }

    }


    public static void sort(int[] arr, int fromIndex, int toIndex) {
        if (toIndex <= fromIndex) {
            return;
        }
        int p = partition2(arr, fromIndex, toIndex);
        sort(arr, fromIndex, p - 1);
        sort(arr, p + 1, toIndex);
    }

    public static void quickSort(int[] arr) {
        //TODO 快速排序前先对带排序的结合进行随机洗牌，让顺序更随机
        sort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        quickSort(SortUtil.sourceArr);
    }
}
