package runtimeConstantPool;

import java.util.Objects;

public class YAThread extends Thread {
    private String ex;

    public YAThread(String ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        String x = "甲";
        System.out.println(Objects.equals(x.intern(), this.ex));
        super.run();
    }
}
