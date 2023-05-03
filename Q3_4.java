import java.util.Stack;

public class MyQueue<T> {
    private Stack<T> stack = new Stack<T>();
    private Stack<T> popper = new Stack<T>();

    public void enqueue(T item) {
        stack.push(item);
    }

    public T dequeue() {
        if (popper.isEmpty()) {
            while (!stack.isEmpty()) {
                popper.push(stack.pop());
            }
        }
        return popper.pop();
    }

    public T peek() {
        if (popper.isEmpty()) {
            while (!stack.isEmpty()) {
                popper.push(stack.pop());
            }
        }
        return popper.peek();
    }
}
