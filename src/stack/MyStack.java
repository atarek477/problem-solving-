package stack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class MyStack {
    Queue<Integer>queue;
    Queue<Integer>queue1;


public MyStack() {

    queue = new LinkedList<>();
    queue1 = new LinkedList<>();

}

public void push(int x) {
    queue.add(x);

        }

public int pop() {
    while (queue.size()-1>0){
 queue1.add(queue.remove());
    }
    int x=queue.remove();
    while (queue1.size()-1>=0){
        queue.add(queue1.remove());
    }

    return x;
}

public int top() {
    return  queue.stream().reduce((first, second) -> second).orElse(0);

        }

public boolean empty() {
    return queue.isEmpty();



        }
        }