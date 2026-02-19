public class PalindromeTriangle {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
