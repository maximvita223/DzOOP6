package list;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList<T> extends OldList<T>{

    public ImmutableList(List<T> otherLst) {
        this.lst = new ArrayList<>();
        lst.addAll(otherLst);
    }

    @Override
    public void getIndex(int index) {
        // TODO Auto-generated method stub
        super.getIndex(index);
    }

    @Override
    public void getSize() {
        // TODO Auto-generated method stub
        super.getSize();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    


    
}
