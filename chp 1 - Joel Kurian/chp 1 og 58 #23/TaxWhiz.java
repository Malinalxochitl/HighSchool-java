public class TaxWhiz {
    private double meh;
    public TaxWhiz (double eh) {
        meh = eh; //retrieves tax rate
    }
    public double calcTax (double purchase) {
        return purchase + (purchase * meh); //returns total after tax
    }
}