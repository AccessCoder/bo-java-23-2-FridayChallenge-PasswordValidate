package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Schreibe eine Passwortvalidierung.
     *

     *         Überprüfe erst die Länge des Passworts und
     *         dann, ob Zahlen enthalten sind.
     *
     * Bonus:
     *
     *     Checke, ob kleine/große Buchstaben enthalten sind.
     *     Verbiete "schlechte" Passwörter wie "passwort" oder "123456".
     */
    public static String[] forbiddenList = {"aD12345678", "Passwort123", "DasIstBestimmt S1cher"};

    public static boolean validatePassword(String password) {
        return !isForbidden(password)
                && containsLowercase(password)
                && containsUppercase(password)
                && containsNumber(password)
                && checkLength(password);
    }
    public static boolean checkLength(String password){
        return password.length() >= 8;
    }

    public static boolean containsNumber(String password){
        char[] chars = password.toCharArray();
        for (int i = 0;i<chars.length;i++){
            if (Character.isDigit(chars[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUppercase(String password) {
        return !password.equals(password.toLowerCase()); // totalSicher85 == totalsicher85
    }

    public static boolean containsLowercase(String password) {
        return !password.equals(password.toUpperCase()); // totalSicher85 == TOTALSICHER85
    }

    public static boolean isForbidden(String password) {
        for (String s : forbiddenList) {
            if (s.equals(password)) {
                return true;
            }
        }
        return false;
    }
}