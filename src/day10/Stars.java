package day10;

public class Stars {
    public static void main(String[] args) {
        System.out.println("\n================1");
        for (int a = 1; a <= 6; ++a) {
            for (int b = 1; b <= a; ++b) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n=================2");
        char last = 'E', alphabet = 'A';
        for (int i = 1; i <= (last - 'A' + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(alphabet + "");
            }
            ++alphabet;
            System.out.println();
        }
        System.out.println("\n===============3");
        for (int i = 5; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n=================4");
        for (int i = 5; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + "");
            }
            System.out.println();
        }

        System.out.println("\n==================5");
        int rows = 5, k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int s = 1; s <= rows - i; ++s) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
            }
        System.out.println("\n==================6");
        int r = 5;

        for(int i = r; i >= 1; --i) {
            for(int d = 1; d <= r - i; ++d) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }

        }
    }
