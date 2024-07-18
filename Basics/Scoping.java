public class Scoping {
    // public static void show(int n1, int n2) {
    // n1 = 10;
    // n2 = 20;
    // System.out.println(n1 + " " + n2);
    // }
    static int x = 100;

    public static void main(String args[]) {
        // int a = 100;
        // int b = 200;

        // {
        // int c = 10;
        // System.out.println(c);
        // a = 300;
        // System.out.println(a);
        // }
        // System.out.println(a + " " + b);
        // System.out.println(c); Cannot be used outside the block
        System.out.println(x);
        int x;
        // System.out.println(x);Error
        x = 150;
        System.out.println(x);
        show();
    }

    public static void show() {
        System.out.println(x);
    }
}
