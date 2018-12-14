package com.naveen.datastructures;

class TwoStackEx
{
  private int maxSize; 
  private String[] stackArray;
  private int top; 

public int getTop() {
	return top;
}

public TwoStackEx(int s) 
  {
   maxSize = s; 
   stackArray = new String[maxSize]; 
   top = -1; 
   }

public void push(String j) 
  {
  stackArray[++top] = j; 
  }


public String pop() 
  {
  return stackArray[top--]; 
  }

public String peek() 
  {
return stackArray[top];
  }

public boolean isEmpty() 
 {
 return (top == -1);
 }

public boolean isFull() 
 {
 return (top == maxSize-1);
 }

} 
public class QueueWithTwoStacks {
	TwoStackEx inStack = new TwoStackEx(10);
	TwoStackEx outStack = new TwoStackEx(10);
    public static void main(String[] args) {
    	QueueWithTwoStacks queue = new QueueWithTwoStacks();
    	queue.enqueue(new String("first"));
        queue.enqueue(new String("second"));
        queue.enqueue(new String("third"));
        queue.enqueue(new String("fourth"));
        queue.enqueue(new String("fifth"));
        System.out.println("1. " + queue.dequeue());
        System.out.println("2. " + queue.dequeue());
        System.out.println("3. " + queue.dequeue());
        System.out.println("4. " + queue.dequeue());
        System.out.println("5. " + queue.dequeue());
        
        
    }
	private String dequeue() {
		if(outStack.isEmpty())
        {
                while( ! inStack.isEmpty())
                {
                        outStack.push(inStack.pop());
                }
        }
        return outStack.pop();
	}
	private void enqueue(String value) {
		 inStack.push(value);
		
	}
}