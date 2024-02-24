package _1_ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator<T> implements Iterable<T> {
    private List<T> elements;
    private int internalIndex;
    private Iterator<T> listyIterator;

    public ListyIterator(T...elements){
        this.elements = List.of(elements);
        this.internalIndex = 0;
        this.listyIterator = iterator();
    }

    public boolean move(){
        if(listyIterator.hasNext()){
            this.internalIndex++;
            listyIterator.next();
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNext(){
        return this.internalIndex < this.elements.size()-1;
    }

    public void print(){
        if(this.elements.isEmpty()){
            throw  new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.elements.get(internalIndex));

    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return this.index< elements.size()-1;
            }

            @Override
            public T next() {
                return elements.get(index++);
            }
        };
    }
}
