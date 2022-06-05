import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListClass<T> {    
    
    private List<T> list = new ArrayList<>();
    private HashMap<Integer, T> hashMapList = new HashMap<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeByIndex(int index){
        if(index < list.size()){
            list.remove(list.get(index));
        }else System.out.println("Não há um elemento neste index");
    }

    public void removeByElement(T element){        
        if(hasThisElement(element)){
            list.remove(element);
        }else System.out.println("Não há este elemento na lista");        
    }

    public boolean hasThisElement(T element){
        
        Iterator<T> iteratorlist = list.iterator();

        while(iteratorlist.hasNext()){
            if(iteratorlist.next() == element){
                return true;
            }
        }
        return false;
    }

    public T getElementById(int index){
        return list.get(index);
    }

    public void update(int index, T element){
        removeByIndex(index);
        list.add(index, element);
    }

    public int getSize(){
        return list.size();
    }    

    public String getStringOfAllElements(){
        Vector<T> vector = new Vector<>(list);
        return vector.toString();
    }

    public void sort(){
        Collections.sort(list, null);
    }
    public void createHashMapList(){
    
        for(int i = 0; i < list.size(); i++){
            hashMapList.put(i,list.get(i));
        }
    }
}
