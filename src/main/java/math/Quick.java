package math;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description 快速排序
 */
public class Quick {

    /**
     *   核心思想：1、把第0位作为中轴，从后往前比取第一个小值，从前往后比取第一个大值，互换
     *            2、第0位与最小值互换，拆分为两部分大数组和小数组
     *            3、重复步骤
     *   时间复杂度：O(nlogn)
     *
     */
    public int[] quickSort(int[] array, int low, int high) {
        if (low <= high) return array;
        int i=low;
        int j = high;
        int base = array[low];

        while (i<j) {
            while (i<j && array[j] > base) j--;
            while (i<j && array[i] <= base) i++;
            if (i<j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        int tmp = array[i];
        array[i] = array[low];
        array[low] = tmp;

        quickSort(array, low, i--);
        quickSort(array, i++, high);
        return array;
    }


}
