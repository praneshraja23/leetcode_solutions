class MyQueue {
     Stack<Integer> first;
     Stack<Integer> second;
    public  MyQueue() {
         first=new Stack<>();
         second=new Stack<>();
    }
    
    public void push(int x) {
        
          while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        second.push(x);
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
       
    }
    
    public int pop() {
      return first.pop();
    }
    
    public int peek() {
       
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */