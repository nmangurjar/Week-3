package stacksandqueues.queueusingstacks;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> enqueueStack =  new Stack<>() ;
    Stack<Integer> dequeueStack = new Stack<>()  ;

    //Enqueue operation
    public void enqueue(int item){
        enqueueStack.push(item);
    }

    //Dequeue operation
    public int dequeue(){
      if(dequeueStack.isEmpty()){
          while(!enqueueStack.isEmpty()) {
              dequeueStack.push(enqueueStack.pop());
          }

      }
        return dequeueStack.pop();
    }

    //Peek operation
    public int peek(){
        if(dequeueStack.isEmpty()){
            while(!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }

        }
        return dequeueStack.peek();
    }

    //check if queue is empty
    public boolean isEmpty(){
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    //Get the size of queue
    public int size(){
        return enqueueStack.size() + dequeueStack.size();
    }







}
