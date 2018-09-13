package mode;

import java.util.*;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description  生产者消费者模式
 */
public class ProToCon<E> {

    // 引申问题 -- 阻塞队列，

    Stack<E> stack = new Stack();

    public E take(){
        synchronized (this) {
            while (stack.size() == 0) {
                try {
                    wait();
                }catch (InterruptedException e){}
            }
        }
        return stack.pop();
    }

    public void add(E e) {
        stack.add(e);
        notifyAll();
    }
}
