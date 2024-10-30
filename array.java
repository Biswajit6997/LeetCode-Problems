public class array {
    static void sum(int num){
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i < s.length() - 1) {
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        int num=1234;
        sum(num);
        // System.out.println(sum(num));

    }
}
