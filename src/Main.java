public class Main {

    public static void main(String[] args) {
        String asterix = "*";
        String regex = "/*";
        System.out.println("A");
        for (int i = 0; i < 10; i++) {
            System.out.print("\n");
            for (int j = 0; j <= i; j++) {
                System.out.print(asterix);
            }
        }
        System.out.println("\n");
        System.out.println("B");
        for (int i = 0; i < 10; i++) {
            System.out.print("\n");
            for (int j = 9; j >= i; j--) {
                System.out.print(asterix);
            }
        }
        System.out.println("\n");
        System.out.println("C");
        for (int i = 0; i < 10; i++) {
            System.out.print("\n");
            for (int j = 9; j >= i; j--) {
                System.out.print(asterix);
            }
        }
    }
}