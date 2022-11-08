package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VariousRemoval {
    //What is wrong with this code?
    public static void removeAll(ArrayList<String> list, String target){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(target)){
                list.remove(i);
            }
        }
    }

    //Option 1 fix (fix the index after remove)
    public static void removeAll1(ArrayList<String> list, String target) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(target)){
                list.remove(i);
                i--;
            }
        }
    }

    //Option 2 fix (remove from the end!)
    public static void removeAll2(ArrayList<String> list, String target) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(target)) {
                list.remove(i);
            }
        }
    }

    //Option 3 fix - Use Iterator!(recommended)
    public static void removeAll3(ArrayList<String> list, String target) {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(target)) iter.remove();
        }
    }

    //Option 4 fix - Make it generic!
    public static void removeAll4(List<String> list, String target) {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(target)) iter.remove();
        }
    }

    //Option 5 fix - Super duper generic!
    public static void removeAll5(List list, Object target) {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(target)) iter.remove();
        }
    }
}