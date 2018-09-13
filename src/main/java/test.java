import keyword.Sync;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description
 */
public class test {
    public synchronized void a1(){
        System.out.println("111");
        try {
            Thread.sleep(2000);
        }catch (Exception e){}
    }
    public synchronized void a2(){
        System.out.println("222");
    }
    public static void main(String[] args) {
        final test tests = new test();
        for (int i = 0; i < 2; i++) {
            Thread f = new Thread(){
                @Override
                public void run(){
                    tests.a1();
                }
            };
            Thread g = new Thread(){
                @Override
                public void run(){
                    tests.a2();
                }
            };
            f.start();
            g.start();
        }
    }
}
