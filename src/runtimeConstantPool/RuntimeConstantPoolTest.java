package runtimeConstantPool;

import java.util.Objects;

public class RuntimeConstantPoolTest {
    static String a = "甲";

    public static void main(String[] args) {
        String b = "甲";

        // 输出为true，说明静态变量也属于常量池
        System.out.println(Objects.equals(b.intern(), a));

        // 输出为true，说明常量池中的变量是多线程共享的
        YAThread yaThread = new YAThread(b);
        yaThread.run();
    }
}
