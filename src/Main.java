import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    // TODO Method for char -> int (input char, output int)
    int encryption(char text) {
        int conversion;
        switch (text) {
            case ' ' -> conversion = 0;
            case 'A' -> conversion = 1;
            case 'B' -> conversion = 2;
            case 'C' -> conversion = 3;
            case 'D' -> conversion = 4;
            case 'E' -> conversion = 5;
            case 'F' -> conversion = 6;
            case 'G' -> conversion = 7;
            case 'H' -> conversion = 8;
            case 'I' -> conversion = 9;
            case 'J' -> conversion = 10;
            case 'K' -> conversion = 11;
            case 'L' -> conversion = 12;
            case 'M' -> conversion = 13;
            case 'N' -> conversion = 14;
            case 'O' -> conversion = 15;
            case 'P' -> conversion = 16;
            case 'Q' -> conversion = 17;
            case 'R' -> conversion = 18;
            case 'S' -> conversion = 19;
            case 'T' -> conversion = 20;
            case 'U' -> conversion = 21;
            case 'V' -> conversion = 22;
            case 'W' -> conversion = 23;
            case 'X' -> conversion = 24;
            case 'Y' -> conversion = 25;
            case 'Z' -> conversion = 26;
            case 'Æ' -> conversion = 27;
            case 'Ø' -> conversion = 28;
            case 'Å' -> conversion = 29;
        }

        return conversion;
    }

    // TODO Method for int -> char (input int, output char)
    char Decryption(int encryptedChar) {
        char conversion;
        switch (encryptedChar) {
            case 0 -> conversion = ' ';
            case 1 -> conversion = 'A';
            case 2 -> conversion = 'B';
            case 3 -> conversion = 'C';
            case 4 -> conversion = 'D';
            case 5 -> conversion = 'E';
            case 6 -> conversion = 'F';
            case 7 -> conversion = 'G';
            case 8 -> conversion = 'H';
            case 9 -> conversion = 'I';
            case 10 -> conversion = 'J';
            case 11 -> conversion = 'K';
            case 12 -> conversion = 'L';
            case 13 -> conversion = 'M';
            case 14 -> conversion = 'N';
            case 15 -> conversion = 'O';
            case 16 -> conversion = 'P';
            case 17 -> conversion = 'Q';
            case 18 -> conversion = 'R';
            case 19 -> conversion = 'S';
            case 20 -> conversion = 'T';
            case 21 -> conversion = 'U';
            case 22 -> conversion = 'V';
            case 23 -> conversion = 'W';
            case 24 -> conversion = 'Z';
            case 25 -> conversion = 'Y';
            case 26 -> conversion = 'Z';
            case 27 -> conversion = 'Æ';
            case 28 -> conversion = 'Ø';
            case 29 -> conversion = 'Å';
        }
        return conversion;
    }



    public static void main(String[] args) {
        Main met = new Main();
        met.encryption();

    }
}
