package keyword;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description static关键字 -- 类加载过程
 */
public class StaticT {

    public static StaticT staticT = new StaticT();
    public static int a;
    public static int b = 0;
    public StaticT() {
        a++;
        b++;
    }

    public static StaticT getInstance(){
        return staticT;
    }

    /**
     *  Q1: 类加载流程
     *  A1： 1、加载
     *            1/通过类的全限定名获取类的二进制流
     *            2/静态存储结构转化为方法区运行时数据结构
     *            3/Java堆中生成代表这个类的class对象
     *       2、验证：确保Class文件的字节流信息安全；文件格式验证，元数据验证，字节码验证，符号引用验证
     *       3、准备：为类的静态变量分配内存并将其初始化为默认值，
     *       4、解析：将常量池中的符号引用替换为直接引用
     *       5、初始化：赋值和static{}
     *
     *   Q2：StaticT.getInstance()过程
     *   A2：调用类的静态方法，出发类的初始化；
     *       类加载准备过程为静态变量分配内存并初始化默认值staticT=null，a=0,b=0
     *       为静态变量赋值和执行static{}
     *       调用构造方法
     *       继续为a,b赋值
     *
     */


}
