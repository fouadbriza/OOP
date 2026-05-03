package core;
import java.util.Collection;
import java.util.Iterator;

public abstract class SortedGroup<T> { 

    public abstract void insert(T element); 
    
    public void remove(T element) { 
        getContent().remove(element);
     };

    public int size() {
        return getContent().size();
    } ;

    public abstract T getElement(int index); 

    @Override
    public String toString() {
        Iterator<T> it = getContent().iterator();
        StringBuilder sb = new StringBuilder("{");
        System.out.println("{");

        while(it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    sb.append("}");
    return sb.toString();

    } 
    protected abstract Collection<T> getContent(); 
} 