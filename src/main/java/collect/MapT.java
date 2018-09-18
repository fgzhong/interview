package collect;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description  Map 所有实现类的区别
 */
public class MapT {

    Map hashMap = new HashMap();
    Map hashTable = new Hashtable();
    Map treeMap = new TreeMap();
    Map linkedHashMap = new LinkedHashMap();
    Map currentHashMap = new ConcurrentHashMap();

    /**
     *   Q1 -- HashMap
     *   A1: 结构：数组+单向链表；Java8 +红黑树
     *       存储过程：存/ key.hashCode() % 数组长度，找到在数组中的位置，
     *                   遍历链表比较key（key1.equals(key2)）,相等覆盖，不等往链表头插入数据
     *               取/ key.hashCode() 找到在数组中的位置;遍历链表比较key（key1.equals(key2)）
     *       线程不安全，a/同时put数据时，往同一位置的表头插入数据会覆盖
     *                 b/扩容时，同时扩容导致链表循环，查找时CPU 100%；
     *
     *   Q2：Hashtable
     *   A2：线程安全，synchronized
     *
     *   Q3：ConcurrentHashMap
     *   A3：结构：Segment数组+单向链表；Java8 CAS算法
     *       线程安全：Java7：分段锁 -- 单个Segment加锁
     *                Java8：CAS无锁机制
     *       扩容时，Segment个数不变，Segment大小改变
     *
     *   Q4：LinkedHashMap
     *   A4：有序的HashMap，每个节点上添加了指向下一个的指针
     *
     *   Q5: TreeMap
     *   A5: 结构：红黑树
     *
     */

}
