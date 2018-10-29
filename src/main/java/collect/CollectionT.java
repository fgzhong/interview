package collect;

import java.util.*;
import java.util.concurrent.DelayQueue;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description
 */
public class CollectionT {

    /**
     *  Q1：数组 、 链表
     *  A1：数组：下标索引、data两部分组成；在内存中连续；初始大小；插入和删除效率低，查询快
     *      链表：data、下一数据指针；不连续，动态扩展，查询效率低
     *
     *  Q2：栈和队列
     *  A2：栈：栈顶出栈入栈；栈顶n, 栈底1 先进后出
     *      队列：队头出队，队尾入队；队头1，队尾n  先进先出
     */

    Stack stack = new Stack();   // 栈
    Queue queue = new DelayQueue();  // 队列
    {
        stack.peek(); stack.pop(); stack.add(null); stack.empty();
    }

    // List 有序、可重复                      底层  查询  增删  线程  效率
    List arrayList = new ArrayList(); //     数组   快    慢   不    高
    List vector = new Vector();      //      数组   快    慢   安全  低
    List linkedList = new LinkedList(); //   连表   慢    快   不    高

    // Set 无序、不可重复
    Set hashSet = new HashSet();   //  哈希表，  hashCode()、equals()
    Set linkedHashSet = new LinkedHashSet();  //  链表+哈希表
    Set treeSet = new TreeSet();   //  红黑树 Compareable()接口

    public class StackT<E> {
        private Object[] eles;
        private int count;

        public StackT(int maxSize) {
            eles = new Object[maxSize];
            count = 0;
        }

        public boolean isEmpty() { return count == 0; }

        public int length() { return count; }

        public E peek() {
            if (!isEmpty()) return (E) eles[0];
            else return null;
        }

        public E pop() {
            if (!isEmpty()) return (E) eles[--count];
            else return null;
        }

        public void push(E e) throws Exception{
            if (count == eles.length) throw new Exception("ss");
            else eles[count++] = e;
        }
    }

    public class QueueT<E>{
        private Object[] eles;
        private int count;

        public QueueT(int maxSize) {
            eles = new Object[maxSize];
            count = 0;
        }

        public boolean isEmpty() { return count == 0; }

        public int length() { return count; }

        public E peek() {
            if (!isEmpty()) return (E) eles[count-1];
            else return null;
        }

        public E pop() {
            if (!isEmpty()) {
                E e = (E) eles[0];
                int i=0;
                while (i<=count-2) eles[i] = eles[++i];
                return e;
            }
            else return null;
        }

        public void push(E e) throws Exception{
            if (count == eles.length) throw new Exception("ss");
            else eles[count++] = e;
        }
    }
}
