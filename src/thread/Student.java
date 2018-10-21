package thread;

class Student {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("thread.Student{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

//    @Override
    public void finalize(){
        System.out.println("finalize...");
    }
}