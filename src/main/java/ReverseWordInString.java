import java.util.Arrays;

public class ReverseWordInString {
    //https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
    public static void main(String[] args) {

        String s = "i.like.this.program.very.much";
        String []a =s.split("\\.");
        System.out.println(a.length);
        String t= "";

        for (int i = a.length - 1; i >= 0 ; i--) {
            t += a[i];
            if(i != 0)
            t += ".";
        }
        System.out.println(t);
    }
}
