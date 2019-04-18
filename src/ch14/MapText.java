package ch14;

import java.util.*;

public class MapText {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Emp emp = new Emp("001","张三");
        Emp emp2 = new Emp("002","李四");
        Emp emp3 = new Emp("003","王一");
        map.put(emp.getE_id(),emp.getE_name());
        map.put(emp2.getE_id(),emp2.getE_name());
        map.put(emp3.getE_id(),emp3.getE_name());
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("HashMap类实现的Map集合，无序");
        while (it.hasNext()){
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str +" " + name);
        }
        TreeMap<String,String> treemap = new TreeMap<>();
        treemap.putAll(map);
        Iterator<String> iter = treemap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，键对象升序：");
        while (iter.hasNext()){
            String str = (String)iter.next();
            String name = (String)treemap.get(str);
            System.out.println(str + " " + name);
        }
    }
}
