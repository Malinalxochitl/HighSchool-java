public class Program {
    private String sentence1;
    private String sentence2;
    private String sentence3 = ""; //return variable
    private String sentence4; //all the instance variables
    private String sentence5;
    private String sentence6 = ""; //return variable
    public Program(String sentence1a, String sentence2a, String sentence4a, String sentence5a) { //construstor
        sentence1 = sentence1a;
        sentence2 = sentence2a;
        sentence4 = sentence4a;
        sentence5 = sentence5a;
    }
    public String printOne () {
        sentence3 = sentence1 + sentence2; //concat
        sentence3 = sentence3 + sentence3.length(); //concats length
        return sentence3;
    }
    public String printTwo () {
        sentence6 = sentence4.concat(sentence5); //concat
        System.out.print("The comparison of the halves of the following sentence yields ");
        System.out.println(sentence4.equals(sentence5)); //display if equal or not
        return sentence6;
    }
}
