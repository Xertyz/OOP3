public class Resource implements Entities {
    int id;
    int value;

    public Resource() {
    }

    public Resource(int id, int value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public void printInfo() {
        System.out.println("ID " + this.id + ", value " + this.value);
    }

}
