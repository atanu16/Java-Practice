package level2;
import java.util.Arrays;
import java.util.*;


public class ArrayLlist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(22);
        list.add(556);
        list.add(678);

        list.set(0,99); //list.set(position,value)

        System.out.println(list.contains(67)); // check the value are present or not

        list.remove(2); //index no 2 will be removed
        System.out.println(list);


    }

}

