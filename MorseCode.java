
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your message in english or Morse:");
        while (true) {
            String Message = input.nextLine().toLowerCase();
            //String[] MessageMorse = new String[Message.length()];
            try {
                String[] MessageMorse = Message.split("");
                String morsefinal = "";
                ArrayList morse = new ArrayList();
                for (int i = 0; i < MessageMorse.length; i++) {
                    switch (MessageMorse[i]) {
                        case "a":
                            morse.add("* ---   ");
                            break;
                        case "b":
                            morse.add("--- * * *   ");
                            break;
                        case "c":
                            morse.add("--- * --- *   ");
                            break;
                        case "d":
                            morse.add("--- * *   ");
                            break;
                        case "e":
                            morse.add("*   ");
                            break;
                        case "f":
                            morse.add("* * --- *   ");
                            break;
                        case "g":
                            morse.add("--- --- *   ");
                            break;
                        case "h":
                            morse.add("* * * *   ");
                            break;
                        case "i":
                            morse.add("* *   ");
                            break;
                        case "j":
                            morse.add("* --- --- ---   ");
                            break;
                        case "k":
                            morse.add("--- * ---   ");
                            break;
                        case "l":
                            morse.add("* --- * *   ");
                            break;
                        case "m":
                            morse.add("--- ---   ");
                            break;
                        case "n":
                            morse.add("--- *   ");
                            break;
                        case "o":
                            morse.add("--- --- ---   ");
                            break;
                        case "p":
                            morse.add("* --- --- *   ");
                            break;
                        case "q":
                            morse.add("--- --- * ---   ");
                            break;
                        case "r":
                            morse.add("* --- *   ");
                            break;
                        case "s":
                            morse.add("* * *   ");
                            break;
                        case "t":
                            morse.add("---   ");
                            break;
                        case "u":
                            morse.add("* * ---   ");
                            break;
                        case "v":
                            morse.add("* * * ---   ");
                            break;
                        case "w":
                            morse.add("* --- ---   ");
                            break;
                        case "x":
                            morse.add("--- * * ---   ");
                            break;
                        case "y":
                            morse.add("--- * --- ---   ");
                            break;
                        case "z":
                            morse.add("--- --- * *   ");
                            break;
                        case "1":
                            morse.add("* --- --- --- ---   ");
                            break;
                        case "2":
                            morse.add("* * --- --- ---   ");
                            break;
                        case "3":
                            morse.add("* * * --- ---   ");
                            break;
                        case "4":
                            morse.add("* * * * ---   ");
                            break;
                        case "5":
                            morse.add("* * * * *   ");
                            break;
                        case "6":
                            morse.add("--- * * * *   ");
                            break;
                        case "7":
                            morse.add("--- --- * * *   ");
                            break;
                        case "8":
                            morse.add("--- --- --- * *   ");
                            break;
                        case "9":
                            morse.add("--- --- --- --- *   ");
                            break;
                        case "0":
                            morse.add("--- --- --- --- ---   ");
                            break;
                        case ".":
                            morse.add("* --- * --- * ---   ");
                            break;
                        case ",":
                            morse.add("--- --- * * --- ---   ");
                            break;
                        case ":":
                            morse.add("--- --- --- * * *   ");
                            break;
                        case "?":
                            morse.add("* * --- --- * *   ");
                            break;
                        case "'":
                            morse.add("* --- --- --- --- *   ");
                            break;
                        case "-":
                            morse.add("--- * * * * ---   ");
                            break;
                        case "/":
                            morse.add("--- * * --- *   ");
                            break;
                        case "(":
                            morse.add("--- * --- --- *   ");
                            break;
                        case ")":
                            morse.add("--- * --- --- * ---   ");
                            break;
                        case "\"":
                            morse.add("* --- * * --- *   ");
                            break;
                        case "=":
                            morse.add("--- * * * ---   ");
                            break;
                        case "+":
                            morse.add("* --- * --- *   ");
                            break;
                        case "@":
                            morse.add("* --- --- * --- *   ");
                            break;
                        case " ":
                            morse.add("    ");
                            break;
                    }
                    morsefinal += morse.get(i);
                }
                System.out.println(morsefinal);
            } catch (Exception IndexOutOfBoundsException) {
                String[] MessageMorse = Message.split("   ");
                String morsefinal = "";
                ArrayList morse = new ArrayList();
                for (int i = 0; i < MessageMorse.length; i++) {
                    switch (MessageMorse[i].strip()) {
                        case "* ---":
                            morse.add("a");
                            break;
                        case "--- * * *":
                            morse.add("b");
                            break;
                        case "--- * --- *":
                            morse.add("c");
                            break;
                        case "--- * *":
                            morse.add("d");
                            break;
                        case "*":
                            morse.add("e");
                            break;
                        case "* * --- *":
                            morse.add("f");
                            break;
                        case "--- --- *":
                            morse.add("g");
                            break;
                        case "* * * *":
                            morse.add("h");
                            break;
                        case "* *":
                            morse.add("i");
                            break;
                        case "* --- --- ---":
                            morse.add("j");
                            break;
                        case "--- * ---":
                            morse.add("k");
                            break;
                        case "* --- * *":
                            morse.add("l");
                            break;
                        case "--- ---":
                            morse.add("m");
                            break;
                        case "--- *":
                            morse.add("n");
                            break;
                        case "--- --- ---":
                            morse.add("o");
                            break;
                        case "* --- --- *":
                            morse.add("p");
                            break;
                        case "--- --- * ---":
                            morse.add("q");
                            break;
                        case "* --- *":
                            morse.add("r");
                            break;
                        case "* * *":
                            morse.add("s");
                            break;
                        case "---":
                            morse.add("t");
                            break;
                        case "* * ---":
                            morse.add("u");
                            break;
                        case "* * * ---":
                            morse.add("v");
                            break;
                        case "* --- ---":
                            morse.add("w");
                            break;
                        case "--- * * ---":
                            morse.add("x");
                            break;
                        case "--- * --- ---":
                            morse.add("y");
                            break;
                        case "--- --- * *":
                            morse.add("z");
                            break;
                        case "* --- --- --- ---":
                            morse.add("1");
                            break;
                        case "* * --- --- ---":
                            morse.add("2");
                            break;
                        case "* * * --- ---":
                            morse.add("3");
                            break;
                        case "* * * * ---":
                            morse.add("4");
                            break;
                        case "* * * * *":
                            morse.add("5");
                            break;
                        case "--- * * * *":
                            morse.add("6");
                            break;
                        case "--- --- * * *":
                            morse.add("7");
                            break;
                        case "--- --- --- * *":
                            morse.add("8");
                            break;
                        case "--- --- --- --- *":
                            morse.add("9");
                            break;
                        case "--- --- --- --- ---":
                            morse.add("0");
                            break;
                        case "":
                            morse.add(" ");
                            break;
                        case "* --- * --- * ---":
                            morse.add(".");
                            break;
                        case "--- --- * * --- ---":
                            morse.add(",");
                            break;
                        case "--- --- --- * * *":
                            morse.add(":");
                            break;
                        case "* * --- --- * *":
                            morse.add("?");
                            break;
                        case "* --- --- --- --- *":
                            morse.add("'");
                            break;
                        case "--- * * * * ---":
                            morse.add("-");
                            break;
                        case "--- * * --- *":
                            morse.add("/");
                            break;
                        case "--- * --- --- *":
                            morse.add("(");
                            break;
                        case "--- * --- --- * ---":
                            morse.add(")");
                            break;
                        case "* --- * * --- *":
                            morse.add("\"");
                            break;
                        case "--- * * * ---":
                            morse.add("=");
                            break;
                        case "* --- * --- *":
                            morse.add("+");
                            break;
                        case "* --- --- * --- *":
                            morse.add("@");
                            break;

                    }
                    morsefinal += morse.get(i);
                }
                System.out.println(morsefinal);


            }
        }
    }
        }





