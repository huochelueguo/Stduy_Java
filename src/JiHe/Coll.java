package JiHe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Coll {
    public static void main(String[] args) {
        Collection cl = new ArrayList();
        cl.add(411);
        cl.add("t11");
        System.out.println(cl);
        System.out.println("***************");

        Collection c2 = new ArrayList();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        c2.addAll(cl);
        System.out.println(c2);
        System.out.println("遍历集合C2");
        for (Object o :c2
             ) {
            System.out.println(o);
        }
        System.out.println("***************");
        System.out.println("遍历方法2");
        Iterator iterator = c2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
