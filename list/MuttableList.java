package list;

import java.util.ArrayList;

public class MuttableList<T> extends OldList<T> {

    public MuttableList() {
        this.lst = new ArrayList<>();
    }

    @Override
    public void getIndex(int index) {
        super.getIndex(index);
    }

    @Override
    public void getSize() {
        super.getSize();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void addInList(T value){
        lst.add(value);
    }
       public void removeInList(T value){
        lst.remove(value);
    }


    
}

    