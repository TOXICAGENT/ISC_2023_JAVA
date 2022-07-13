public class reverse {
    public static void main(String[] args) {
        reverse o = new reverse();
        System.out.println(o.palin("ABCD"));
    }
    // reverse the string
    String palin(String s) {
        if (s.length() > 0)
            return palin(s.substring(1))+s.charAt(0);
        else
            return s;
    }
}
