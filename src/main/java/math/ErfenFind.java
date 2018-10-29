package math;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description  二分查找
 */
public class ErfenFind {

    public int find(int[] array, int des, int low, int high){
        if (low > high) return -1;
        int mid = (low + high) >> 1;
        if (array[mid] == des) return mid;
        else if (array[mid] > des) return find(array, des, low, mid-1);
        else if (array[mid] < des) return find(array, des, mid+1, high);
        return -1;
    }

    // 引申题 -- 查找数组中 >=des最小值的所在位置
    public int findCloser(int[] array, int des, int low, int high){
        // if (array[0] > des) return 0;
        // if (array[array.length-1] < des) return -1;
        if (low >= high-1) return high;
        int mid = (low + high) >> 1;
        if (array[mid] == des) return mid;
        if (array[mid] > des) return find(array, des, low, mid);
        if (array[mid] < des) return find(array, des, mid, high);
        return -1;
    }
}
