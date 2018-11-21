import java.util.*; //import
public class label_maker{ //class
    public void labels(String original) { //labels method
        System.out.println("----------------"); //top of label
        StringTokenizer st = new StringTokenizer(original, ":"); //delimiter tokenizer
        while (st.hasMoreTokens()) { //checks to see if there are more tokens
            System.out.println(st.nextToken()); //displays the next token
        }
        System.out.println("----------------"); //bottom of label
    }
    public static void main(String args[]) { //main
        label_maker x = new label_maker(); //constructor call
        String a = "John Johnson:32 street place:Dallas, WA 74925"; //delimited string
        x.labels(a); //method call
    }
}