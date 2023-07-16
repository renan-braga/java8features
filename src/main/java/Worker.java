public class Worker implements Person{

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
