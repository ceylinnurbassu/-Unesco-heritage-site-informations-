package dataStructuresProject2;
import java.awt.dnd.InvalidDnDOperationException;
import java.util.ArrayList;
import java.util.List;

public class OncellikliKuyruk {
    private List<UM_Alani> oncelikliQueue;
    private int size;
    private int nItems;
    public OncellikliKuyruk(int s){
        size=s;
        nItems=0;
        oncelikliQueue= new ArrayList<UM_Alani>(s);
    }
    public void insert(UM_Alani obj){
        oncelikliQueue.add(obj);
        nItems++;
    }
    public boolean isEmpty()
    {
        return (nItems==0);
    }
    public boolean isFull(){
        return (nItems==size);
    }
    public UM_Alani remove(){
        int temp=0;
        for (int i=1;i<oncelikliQueue.size();i++){
            int result =oncelikliQueue.get(temp).getAlan_Adi().compareToIgnoreCase(oncelikliQueue.get(i).getAlan_Adi());
            if (result>0){
                temp=i;
            }
        } UM_Alani removed=oncelikliQueue.get(temp);
        oncelikliQueue.remove(temp);
        nItems--;
        return removed;
    }

}
