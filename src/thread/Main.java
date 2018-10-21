package thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map map;
    static {
        Map aMap = new HashMap();
        aMap.put(1, "one");
        aMap.put(2, "two");
        map = Collections.unmodifiableMap(aMap);
        aMap.put("3", "three");

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        for (Object o : map.keySet()) {
            System.out.println(o);
        }






//        Boolean holder = true;
//
//        thread.IntThread intThread = new thread.IntThread(holder);
//        thread.CharThread charThread = new thread.CharThread(holder);
//
//
//        Thread thread1 = new Thread(intThread);
//        Thread thread2 = new Thread(charThread);
//
//        thread1.start();
//        Thread.sleep(10);
//        thread2.start();




//        thread.Student li = new thread.Student();
//        thread.Student zhang = new thread.Student();
//        li.name = "li";
//        zhang.name = "zhang";
//        swap(li, zhang);
//        System.out.println(li);
//        System.out.println(zhang);
    }



//    private static void changeName(thread.Student student) {
//        student.name = "zhang";
//    }
//
//    public static void swap(thread.Student x, thread.Student y) {
//        thread.Student temp = x;
//        x = y;
//        y = temp;
//    }

}
