package list;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> gg = List.of(1,1,1,1,4);
        MuttableList<Integer> lst = new MuttableList<>();
        lst.addInList(1);
        lst.addInList(1);
        lst.addInList(1);
        lst.addInList(1);
        System.out.println(lst);
        ImmutableList<Integer> lst1 = new ImmutableList<>(gg);
        System.out.println(lst1);
    }
}
