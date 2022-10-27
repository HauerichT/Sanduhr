public class Sanduhr {

    // Methode zum printen der Sanduhr, basierend auf einer Startbreite width
    private static void printSanduhr(int width) {
        // Startwerte für Breite und Leerzeichen
        int symbols = width;
        int spacer = 0;

        // Werte zur Berechnung/Darstellung der nächsten Zeile
        int symbolsOperand = -2;
        int spacerOperand = 1;

        // prüft, ob die Endbedingung ein Symbol oder zwei Symbole ist
        boolean withoutRemainder = width % 2 == 0;

        // legt die Endbedingung, basierend auf der Modulo-Berechnung, fest
        int end;
        if (withoutRemainder) {
            end = 2;
        } else {
            end = 1;
        }

        // prüft, ob die Erstellung einer Sanduhr möglich ist (Startbreite muss >= 3 sein)
        if (width <= 2) {
            System.out.println("Bitte einen größeren Wert als 2 übergeben um eine Sanduhr zu erzeugen!");
        }
        else {
            // berechnet und stellt die Sanduhr dar, solange die Symbole kleiner gleich der Startbreite sind
            do {

                // gibt die passende Anzahl der Leerzeichen aus
                for (int i = 0; i < spacer; i++) {
                    System.out.print(" ");
                }

                // gibt die passende Anzahl der Symbole aus
                for (int i = 0; i < symbols; i++) {
                    System.out.print("*");
                }

                // zieht von der Symbolanzahl für die nächste Zeile 2 ab
                symbols = symbols + symbolsOperand;
                // fügt der Leerzeichenanzahl für die nächste Zeile 1 hinzu
                spacer = spacer + spacerOperand;

                /*
                 * wenn die Endbedingung erreicht ist, werden die Operanden so angepasst,
                 * dass Leerzeichen abgezogen und Symbole hinzugefügt werden bis die Startbreite
                 * erreicht wird
                 */
                if (symbols <= end) {
                    symbolsOperand = 2;
                    spacerOperand = -1;
                }

                // sorgt für Zeilenumbruch nach jeder Zeile
                System.out.println();

                // wird so lange ausgeführt, bis die Anzahl der Symbole größer als die Startbreite ist
            } while (symbols <= width);
        }
    }


    public static void main(String[] args) {
        // ruft die Methode printSanduhr auf und übergibt die Startbreite
        // printSanduhr(3);
        // printSanduhr(4);
        printSanduhr(9);
    }
}