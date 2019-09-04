public class personstack {
    private person stack[];
    private int top;
    private int size;
    public personstack(){
        top=-1;
        size=50;
        stack=new person [size];

    }
    public personstack(int size){
        top=-1;
        this.size=size;
        stack=new person [this.size];
    }
    public boolean push(person item){
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
    public person pop(){
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
