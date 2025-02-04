import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        reverse(queue);

        // Print queue
        while(!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
