package keyword;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description
 */
public class StaticT {

    public static StaticT staticT = new StaticT();
    public static int a;
    static {
        System.out.println(a);
    }

    public StaticT() {
        System.out.println(a);
    }


}
