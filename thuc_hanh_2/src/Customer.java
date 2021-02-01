public class Customer {
    private String name;
    private int numberHouse;
    private long electricMeterCode;

    public Customer() {
    }

    public Customer(String name, int numberHouse, long electricMeterCode) {
        this.name = name;
        this.numberHouse = numberHouse;
        this.electricMeterCode = electricMeterCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public long getElectricMeterCode() {
        return electricMeterCode;
    }

    public void setElectricMeterCode(long electricMeterCode) {
        this.electricMeterCode = electricMeterCode;
    }
}
