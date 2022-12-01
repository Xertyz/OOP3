public class ResIncome extends ResConsumption {

    public ResIncome(int id, int value) {
        super(id, -value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return -value;
    }

    @Override
    public void printInfo() {
        System.out.println("Op " + this.id + " - Income: " + -this.value);
    }

}
