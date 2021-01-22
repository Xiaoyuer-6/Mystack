/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 类加载器：加载类的时候 ，不同的类加载器加载对应得类。
 *       双亲委派模型。
 *       3个
 * User: GaoBo
 * Date: 2021-01-22
 * Time: 12:05
 */
public class MyStack {
    private int[] elem;
    private int top;//既可以代表下标：这个位置就是当前可以存放数据的下标
    // 也可以代表当前有多少个元素

    public MyStack() {
        this.elem = new int[10];
    }
    public boolean isFull() {
        return this.top == this.elem.length;
    }

    public int push(int item) {
        if(isFull()) {
            throw new RuntimeException("栈为满");
        }
        this.elem[this.top] = item;
        this.top++;
        return this.elem[this.top-1];
    }

    /**
     * 弹出栈顶元素 并且删除
     * @return
     */
    public int pop() {
        if(empty()) {
            //return -1;
            throw new RuntimeException("栈为空");
        }
        this.top--;
        return this.elem[this.top];
    }

    /**
     * 拿到栈顶元素不删除
     * @return
     */
    public int peek() {
        if(empty()) {
            //return -1;
            throw new RuntimeException("栈为空");
        }
        return this.elem[this.top-1];
    }

    public boolean empty() {
        return this.top == 0;
    }

    public int size() {
        return this.top;
    }
}
