public class EntryUser {
    private static String name;
    private static String address; //instance variables
    private static String phone_number;
    public static void main(String[] args) { //main
        Entry num1 = new Entry(name, address, phone_number); //constructor
        name = num1.getName(); //retrieves name
        num1.setName(name); //sets name
        address = num1.getAddress(); //retrieves address
        num1.setAddress(address); //sets address
        phone_number = num1.getPhone(); //retrieves phone
        num1.setPhone(phone_number); //sets phone
        num1 = new Entry(name, address, phone_number); //redefines constructor
        num1.wholeEntry(); //final display
    }
}