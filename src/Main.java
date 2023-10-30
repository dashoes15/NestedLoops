public class Main {
    public static void main(String[] args) {
        for (int i = 6; i>1; i--) {
            for (int j = i; j<6; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
        for (int i = 2; i<7; i++) {
            for (int j = i; j<6; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
        for (int i = 2; i<7; i++) {
            for (int j = 1; j<5; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}