package deep27;

import java.sql.SQLOutput;
import java.util.*;

public class InBuiltEx {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(78);
        stack.push(8);
        stack.push(28);
        stack.push(34);
        stack.push(56);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();

      Queue<Integer> queue=new LinkedList<>();
            //queue is an interface here thats why its method is implemented by linked list
        queue.add(56);
        queue.add(6);
        queue.add(51);
        queue.add(76);
        queue.add(21);
        queue.add(98);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println();
        Deque<Integer>deque=new ArrayDeque<>();
        deque.add(76);
        deque.addLast(87);
        deque.addFirst(98);
        deque.removeFirst();
        }
    }

