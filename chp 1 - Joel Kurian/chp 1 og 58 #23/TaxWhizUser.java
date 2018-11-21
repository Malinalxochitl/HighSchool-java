public class TaxWhizUser {
    public static void main(String[] args) {
        TaxWhiz smeh = new TaxWhiz(0.04); //sends tax rate
        System.out.print("The total after a $100 purchase is $");
        System.out.println(smeh.calcTax(100)); //display
    }
}