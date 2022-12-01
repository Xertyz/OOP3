public class Worker extends Resource {

    String name = "John Doe";

    public Worker(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printInfo() {
        System.out.println("Worker " + this.name);
    }
}
