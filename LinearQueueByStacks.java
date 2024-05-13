package package3;

import package2.stack;

public class LinearQueueByStacks {
	        stack stack1; 
            stack stack2; 
    public LinearQueueByStacks() {
        stack1 = new stack();
        stack2 = new stack();
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public int size() {
        return stack1.size() + stack2.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
