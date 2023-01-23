package list;

import java.util.List;

public abstract class OldList<T> {
    public List<T> lst;

    public void getSize() {}

    public void getIndex(int index) {}

    @Override
    public String toString() {
        return "OldList lst=" + lst;
    }
    
}
