package aop;

public class StudentImpl implements Student {

    @Override
    public void add(String name) {
        System.out.println("student " + name + " added.");
    }
}
