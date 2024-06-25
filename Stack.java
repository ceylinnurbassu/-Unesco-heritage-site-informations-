package dataStructuresProject2;
public class Stack {
    private int size;
    private int top;
    private UM_Alani []umAlaniArray;

    public Stack(int s){
        size=s;
        top=-1;
        umAlaniArray= new UM_Alani[s];
    }
    public void push(UM_Alani newobj){
        umAlaniArray[++top]=newobj;
    }
    public UM_Alani pop(){
        return umAlaniArray[top--];
    }
    public UM_Alani peek(){
        return umAlaniArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top== size-1);
    }
}
