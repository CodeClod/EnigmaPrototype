import java.util.Scanner;

public class Main {


    Scanner in = new Scanner(System.in);
    // TODO Method for char -> int (input char, output int)
    int encryption(char text) {
        int conversion;
        switch (text){
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


    public static void main(String[] args) {
        Main met = new Main();
        met.encryption(input);

    }
}
