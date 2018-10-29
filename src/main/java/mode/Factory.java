package mode;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description 工厂模式
 */
public class Factory {

    // 简单工厂
    public class Simple {
        public abstract class A {
            public abstract void action();
        }

        public class A1 extends A {
            @Override
            public void action(){};
        }

        public class A2 extends A {
            @Override
            public void action(){};
        }

        public A getA(int type) {
            switch (type) {
                case 1: return new A1();
                case 2: return new A2();
                default: return null;
            }
        }
    }

    // 工厂模式  -- 抽象 外加一层 接口
    public class Common {
        public abstract class A {
            public abstract void action();
        }

        public class A1 extends A {
            @Override
            public void action(){};
        }

        public class A2 extends A {
            @Override
            public void action(){};
        }

        public class B1 implements B {
            public void run(){
                new A1();
            }
        }

        public class B2 implements B {
            public void run(){
                new A2();
            }
        }

        public B getA(int type) {
            switch (type) {
                case 1: return new B1();
                case 2: return new B2();
                default: return null;
            }
        }
    }

    interface B{
        void run();
    }
}
