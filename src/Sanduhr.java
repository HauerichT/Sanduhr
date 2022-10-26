public class Sanduhr {

    private static void printSanduhr(int width) {

        int symbols = width;
        int spacer = 0;

        int starsOperand = -2;
        int spacerOperand = 1;

        boolean withoutRemainder = width % 2 == 0;

        int end;
        if (withoutRemainder) {
            end = 2;
        } else {
            end = 1;
        }

        do {
            for (int i = 0; i < spacer; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < symbols; i++) {
                System.out.print("*");
            }

            symbols = symbols + starsOperand;
            spacer = spacer + spacerOperand;

            if (symbols <= end) {
                starsOperand = 2;
                spacerOperand = -1;
            }

            System.out.println();

        } while (symbols <= width);
        
    }

    public static void main(String[] args) {
        // printSanduhr(3);
        // printSanduhr(4);
        printSanduhr(9);
    }
}