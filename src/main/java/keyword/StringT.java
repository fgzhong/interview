package keyword;

/**
 * @Author create by fgzhong
 * @Date 2018/9/18
 * @Description  字符串
 */
public class StringT {

    String a = "abc";  // 编译期知道其值，编译器优化，
    String a1 = "abc";
    String a2 = new String("abc");
    String a3 = a + a1; //  运行期才能知道其值，相当于new
    String a5 = "abcabc";

    public static void main(String[] args) {
        StringT t = new StringT();
        String a4 = t.a + t.a1;
        System.out.println(t.a == t.a1);  // true 指向常量池中同一位置
        System.out.println(t.a == t.a2);  // false 对象
        System.out.println(t.a3 == a4);   // false 运行期才知道具体值，new
        System.out.println(t.a3 == t.a5); // false 运行期才知道具体值，new
    }

    public final class Immutable {
        private final String name;
        private final int value;

        public Immutable(String name,int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     *  Q1: String 特点 -- 引申 final immutable对象的实现
     *  A2：final类、不可被继承、不可改变
     *     final 修饰基本数据和String 值不可变；
     *           修饰对象，对象地址不可变，内容可变
     *           修饰方法，不可重写
     *           修饰类，类不可被继承，方法默认添加final
     *
     *  Q2：String、StringBuffer、StringBuilder
     *  A2：1、String -- 字符串常量，不可变
     *      2、StringBuffer -- 字符串变量，可变，线程安全（synchronized）
     *      3、StringBuilder -- 字符串变量，可变，线程不安全
     *
     *  Q3：引申 -- equals() 与 == 区别
     *  A3：== 比较两对象的引用；
     *      equals() 不重写也是调用 == ； 重写比较两个内容
     *
     */
}
