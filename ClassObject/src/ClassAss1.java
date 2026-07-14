class ElectricityBill {
    // Private variables
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public double getTotalBill() {
        double totalBill = unitsConsumed * pricePerUnit;

        if (unitsConsumed > 500) {
            totalBill = totalBill + (totalBill * 10 / 100); // 10% surcharge
        }

        return totalBill;
    }
}

public class ClassAss1 {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();

        eb.setCustomerName("Payal");
        eb.setUnitsConsumed(600);
        eb.setPricePerUnit(8);

        System.out.println("Customer Name: " + eb.getCustomerName());
        System.out.println("Total Bill: " + eb.getTotalBill());
    }
}
//public class ClassAss1 {

//}
