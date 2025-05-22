import java.sql.SQLOutput;
import java.util.ArrayList;

public class theList {
    ArrayList<String> list = new ArrayList<>();

    public void addToList(String A,String B,String C,String D,String E){
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        list.add(E);
        System.out.println(list);
    }
    public void getitem(int c){
        if (list.size() > c) {
            String TheValue = list.get(c);
            System.out.println(TheValue);
        }else {
            System.out.println("out of bounds!");
        }
    }
    public void removeItem(int c){
        if (list.size() > c) {
            String TheValue = list.get(c);
            System.out.println(TheValue);
        }else {
            System.out.println("out of bounds!");
        }
    }






}
