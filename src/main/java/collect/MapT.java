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
     *   A1: 结构：数组+单链表；Java8 +红黑树
     *       存储过程：存/ key.hashCode() % 数组长度，找到在数组中的位置，
     *                   遍历链表比较key（key1.equals(key2)）,相等覆盖，不等往链表头插入数据
     *               取/ key.hashCode() 找到在数组中的位置;遍历链表比较key（key1.equals(key2)）
     *       线程不安全，a/同时put数据时，往同一位置的表头插入数据会覆盖
     *                 b/扩容时，同时扩容导致链表循环，查找时CPU 100%；
     *
     *
     *
     *
     *
     */

}
