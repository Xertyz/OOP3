public class ResConsumption extends Resource {
    public ResConsumption(int id, int value) {
        super(id, value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void printInfo() {
        System.out.println("Op " + this.id + " - Consum: " + this.value);
    }
}
