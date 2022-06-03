public class RomanToInteger {
    public static void main(String[] args) {
        int output = 0;
        String s = "MCMXCIV";
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int curr = integerValue(s.charAt(i));
            if (i + 1 < len){
                 int next = integerValue(s.charAt(i + 1));
                 if (next > curr) {
                     output = output + next - curr;
                     i = i + 1;
                 }
                 else {
                     output = output + curr;
                 }
            }
            else {
                output = output + curr;
            }
        }


        System.out.println(output);
    }


    public static int integerValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return -1;
    }
}
