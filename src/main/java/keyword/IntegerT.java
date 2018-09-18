package keyword;

/**
 * @Author create by fgzhong
 * @Date 2018/9/18
 * @Description  基本数据类型和封箱拆箱
 */
public class IntegerT {

    int a = 10;
    int b = 10;
    Integer c = 10;  // 自动装箱，Integer.valueOf(10)， 10<128, 指向缓存中
    Integer c1 = 10;
    Integer d = new Integer(10); // new 是新创建对象，不是缓存中的数据
    Integer d1 = new Integer(10);
    int e1 = 129;
    Integer e2 = 129;  // 自动装箱，Integer.valueOf(129)， 129>128, 创建新对象
    Integer e3 = 129;
    Integer e4 = new Integer(129);
    Integer e5 = new Integer(129);



    public static void main(String[] args) {
        IntegerT t = new IntegerT();
        System.out.println(t.a == t.b);  // true  常量池中，指向一样
        System.out.println(t.a == t.c); // true   自动拆箱，Integer.intValue()
        System.out.println(t.a == t.d); // true   自动拆箱，Integer.intValue()
        System.out.println(t.c == t.c1); // true  都指向缓存中的10
        System.out.println(t.c == t.d); // false  缓存和对象不一样
        System.out.println(t.d == t.d1); // false  两个不同对象
        System.out.println(t.e1 == t.e2); // true  自动拆箱
        System.out.println(t.e2 == t.e3); // false
        System.out.println(t.e3 == t.e4); // false
        System.out.println(t.e4 == t.e5); // false

    }

    /**
     *   Q1: 自动拆箱和装箱的实现机制
     *   A1：装箱 -- Integer.valueOf() ；拆箱 -- Integer.intValue()
     *
     */

}
