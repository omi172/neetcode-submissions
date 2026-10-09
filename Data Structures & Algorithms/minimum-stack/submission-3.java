class MinStack {
 static class pair{
    int a,b;
    pair(int a,int b){
        this.a = a;
        this.b = b;
    }
 }
 static Stack<pair> stk;
    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
        if(stk.isEmpty() == false){
          stk.push(new pair(val,Math.min(stk.peek().b,val)));
        }else{
          stk.push(new pair(val,val));  
        }
    }
    
    public void pop() {
        stk.pop();
    }
    
    public int top() {
        if(stk.isEmpty()){
            return -1;
        }
        return stk.peek().a;
    }
    
    public int getMin() {
        return stk.peek().b;
    }
}
