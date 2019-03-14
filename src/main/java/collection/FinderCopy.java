package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FinderCopy {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(4);
        list.add(5);
        list.add(-6);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        Map<Integer,Integer> map = new TreeMap();
      list.stream().forEach(i -> map.put(i,map.getOrDefault(i,0)+1));


        System.out.println(map.toString());
    }


}
