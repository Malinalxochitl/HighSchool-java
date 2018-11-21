import java.util.Scanner; //import scanner class
public class Entry {
    private String name;
    private String address; //instance variables
    private String phone;
    public Entry (String a, String b, String c) {
        name = a;
        address = b; //constructor
        phone = c;
    }
    public String getName() { //gets name
        Scanner sc = new Scanner(System.in);
        sc = sc.useDelimiter("\n");
        System.out.println("Enter a name: ");
        return sc.next();
    }
    public void setName(String x) { //confirms name
        System.out.println("The name has been set to " + x);
    }
    public String getAddress() { //gets address
        Scanner sc = new Scanner(System.in);
        sc = sc.useDelimiter("\n");
        System.out.println("Enter an address: ");
        return sc.next();
    }
    public void setAddress(String x) { //confirms address
        System.out.println("The address has been set to " + x);
    }
    public String getPhone() { //gets phone number
        Scanner sc = new Scanner(System.in);
        sc = sc.useDelimiter("\n");
        System.out.println("Enter a phone number: ");
        return sc.next();
    }
    public void setPhone(String x) { //confirms phone number
        System.out.println("The phone number has been set to " + x);
    }
    public void wholeEntry() { //displays final results
        System.out.println("The name is " + name);
        System.out.println("The address is " + address);
        System.out.println("The phone number is " + phone);
    }
}