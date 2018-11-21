public class ProgramUser {
   public static void main(String[] args) {
       Program sflarg = new Program("The length of", " This sentence is ", "This is a", " comparison test."); //string segments to be sent over
       System.out.println(sflarg.printOne());
       System.out.println(sflarg.printTwo()); //method calling
    }
}