package keyword;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description  synchronized 关键字 解析
 */
public class Sync {

    String str;

    //  synchronized 用法
    //  Java中每个对象都有一个内置锁；jvm自动实现；

    // 修饰方法
    // @1-1 修饰非静态方法；锁的是对象
    public synchronized void a1(){}
    // @1-2 修饰静态方法；锁的是类
    public synchronized static void a2(){}

    // 修饰代码块
    // @2-1 修饰类；锁的是类
    public void b1(){
        synchronized (Sync.class){}
    }
    // @2-2 修饰对象；锁的是对象
    public void b2(){
        synchronized (str){}
    }


    /**\
     *  Q1: 同时调用不同的两个非静态方法
     *  A1：锁的是对象，按顺序执行，不能同时执行
     *
     *  Q2：synchronized方法、synchronized (Sync.class)、synchronized (this) 区别
     *  A2:1-获得对象锁，2-类锁，3-对象锁
     *
     *  Q3：与lock的区别
     *  A3：synchronized基于jvm的内置锁,自动获得锁，释放锁；通信方式wait(),notify(),notifyAll();
     *      lock基于java类实现的显示锁，ReentrantLock,主动；通信方式Condition；
     *      Condition condition = lock.newCondition(); condition.await()  signal() signalAll（）
     *  Q4：synchronized (this)  this 是不可变变量 隐患
     *  A4：例如 this 是 Integer i； synchronized (i) {i++;} 起不到作用，因为会i的改变是生成新对象；
     *
     *  Q5：可重入锁
     *  A5：当该线程已拥有该对象的锁时，再去获取也可得到锁；
     *
     *  Q6：实现原理
     *  A6：
     */
}
