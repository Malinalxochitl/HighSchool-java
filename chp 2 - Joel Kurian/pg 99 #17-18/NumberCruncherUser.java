public class NumberCruncherUser { //uses methods in NumberCruncher
    public static void main(String[] args) {
        NumberCruncher hurp = new NumberCruncher(20); //calls methods from NumberCruncher
        System.out.print("The number is ");
        System.out.println(hurp.single()); //displays original
        System.out.print("The number doubled is ");
        System.out.println(hurp.duble()); //displays double
        System.out.print("The number tripled is ");
        System.out.println(hurp.triple()); //displays triple
        System.out.print("The number squared is ");
        System.out.println(hurp.square()); //displays squared
        System.out.print("The number cubed is ");
        System.out.println(hurp.cube()); //displays cubed
    }
}
