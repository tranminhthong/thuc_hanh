public class Receipt {
    private int oldNumber;
    private int newNumber;
    Customer customer = new Customer();

    public Receipt(int oldNumber, int newNumber, Customer customer) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.customer = customer;
    }

    public Receipt() {
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }
}
