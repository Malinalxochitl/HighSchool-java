public class LimeRick { //prints a limerick
    private String one;
    private String two;
    private String three; //storage for rhyme words
    private String four;
    private String five;
    public LimeRick(String a, String b, String c, String d, String e){ //constructor
        one = a;
        two = b;
        three = c;
        four = d;
        five = e;
    }
    public void Rhymes(){ //displays limerick
        System.out.println("There once was a " + one); //line one
        System.out.println("Who got " + two); //line 2
        System.out.println("And he was like pls " + three);//line 3
        System.out.println("That was really " + four);//line 4
        System.out.println("As he fell down he said, I'm feeling kind of " + five);//line 5
    }
}