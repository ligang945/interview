package aop;

import java.lang.reflect.Proxy;

public class AopTest {
    public static void main(String[] args) {
        Student student = new StudentImpl();

        MyInvocationHandler handler = new MyInvocationHandler(student);

        Student studentProxy = (Student) Proxy.newProxyInstance(
                student.getClass().getClassLoader(),
                student.getClass().getInterfaces(),
                handler);

        studentProxy.add("mf");
    }
}

