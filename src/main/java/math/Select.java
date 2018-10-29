package math;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description  选择排序
 */
public class Select {

    public int[] sort(int[] array) {

        /**
         *  核心思想：循环遍历取最小值放在第一位
         *  时间复杂度：O(n2)
         *
         */
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int k = i;
            for (int j = i+1; j < length; j++) {
                if (array[k] > array[j]) k=j;
                if (k>i) {
                    int tmp = array[i];
                    array[i] = array[k];
                    array[k] = tmp;
                }
            }
        }
        return array;

    }
}
