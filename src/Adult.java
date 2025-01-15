public class Adult extends Person{
    private String netWorth;

    // Constructor
    public Adult(String firstName, String lastName, String phoneNumber, String netWorth){
        super(firstName, lastName, phoneNumber);
        this.netWorth = netWorth;
    }

    // Getters
    public String getNetWorth() {
        return netWorth;
    }

    // toString
    public String toString(){
        return super.toString() + " Net Worth: " + netWorth;
    }


}
