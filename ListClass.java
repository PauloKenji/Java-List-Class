import java.util.ArrayList;
import java.util.List;

public class ListClass<T> {    
    
    private List<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeByIndex(int index){
        list.remove(list.get(index));
    }

    public void removeByElement(T element){
        list.remove(element);
    }

    public T getElementById(int index){
        return list.get(index);
    }

    public void update(int index, T element){
        removeByIndex(index);
        list.add(index, element);
    }

    public List getAll(){
        return list;
    }

    public int getSize(){
        return list.size();
    }
}
