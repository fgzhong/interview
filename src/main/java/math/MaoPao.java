package math;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description  冒泡排序
 */
public class MaoPao {

    /**
     *  核心思想：1、从左到右相邻两项大小互换，
     *           2、一轮最大值换到末尾，再循环
     *
     *  时间复杂度和空间复杂度：O(n2)/
     *
     *  引申 -- 时间复杂度概念和计算
     *
     *  时间复杂度：一个算法花费时间与语句执行次数成正比
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {

        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;

    }

}
