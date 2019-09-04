public class intstack {
    private int stack[];
    private int top;
    private int size;
    public intstack(){
        top=-1;
        size=50;
        stack=new int [size];

    }
    public intstack(int size){
        top=-1;
        this.size=size;
        stack=new int [this.size];
    }
    public boolean push(int item){
        if(!full()){
            top++;
            stack[top]=item;
            return true;
        }
        else
            return false;
    }
    public boolean full(){
        return (top==stack.length-1);
    }
    public int pop(){
        //if (!empty()){
            return stack[top--];
       // }
        //else
          //  return -1;
    }
    public boolean empty(){
        return top==-1;
    }

}
