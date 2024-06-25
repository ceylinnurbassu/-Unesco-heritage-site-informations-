package dataStructuresProject2;
public class Queue {
    private int size;
    private UM_Alani [] umAlaniQueue;
    private int rear;
    private int front;
    private int nItems;
    public Queue(int s){
        size=s;
        umAlaniQueue= new UM_Alani[size];
        front=0;
        rear=-1;
        nItems=0;
    }
    public void insert(UM_Alani obj){
        if(rear==size-1){
            rear=-1;
        }
        umAlaniQueue[++rear]=obj;
        nItems++;
    }
    public UM_Alani remove(){
        UM_Alani temp= umAlaniQueue[front];
        front++;
        if (front==size){
            front=0;
        }nItems--;
        return temp;
    }
    public boolean isEmpty(){
        return(nItems==0);
    }
    public boolean isFull(){
        return (nItems==size);
    }


}
