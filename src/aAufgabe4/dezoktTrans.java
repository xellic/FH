package aAufgabe4;

import java.util.*;
/*
*     Aufgabenstellung Teil IV
    Schreiben Sie ein Programm, welches eine Dezimalzahl (Basis 10) einliest und in eine Hexadezimal-zahl (Basis 16)
    oder eine Oktalzahl (Basis 8) umwandelt und auf der Konsole ausgibt. Zunächst wird vom Benutzer eine Dezimalzahl verlangt.
    Dann in welches Zahlenformat die eingegebene Zahl transformiert werden soll. Das Programm soll solange nach Dezimalzahlen fragen,
    bis der Benutzer -1 eingibt. Die Transformation soll in zwei Methoden außerhalb der main-Methode erfolgen.
*/
 
public class dezoktTrans
{
    public static void main(String[] args)
    {
        //Deklaration Variablen
        int dezimalzahl = 0, auswahl = 0;
        
        //Deklaration Objekte
        Scanner myScanner = new Scanner(System.in);
        
        do
        {
            System.out.println("Bitte geben Sie eine Dezimalzahl ein: ");
            dezimalzahl = myScanner.nextInt();                                     //Lesen der dezimalzahl mit Scanner
            if (dezimalzahl !=-1)                                                //damit nicht der gesamte Text ausgeben wird wenn der Benutzer -1 zum Beenden eingibt
            {
            System.out.println("In welches Zahlenformat möchten Sie die Dezimalzahl "+dezimalzahl+" konvertieren?nBitte wählen Sie: n 1 für Hexadezimaln 2 für Octaln-1 zum beenden");
            auswahl = myScanner.nextInt();
                switch (auswahl)
                {
                    case 1:        System.out.println(convertToHex(dezimalzahl));    break;    
                    case 2:        System.out.println(convertToOct(dezimalzahl));    break;
                    default:    System.out.println("Fehler bei der Auswahl");     break;
                }
            }
        }
        while (dezimalzahl != -1);                                                //Abbruchbedingung
        
    }
 
    //Methode convertToHex
    //Integer.toHexString(dezimalzahl).toUpperCase()                            //Diese Methode macht das selbste von Haus aus
    private static String convertToHex(int zahl)
    {
        String hexaDezimalzahl = " ", rest = " ";
        
        while (zahl != 0)
        {
            rest = intToLetterConverter(zahl%16);                                //hexaDezimalzahl = Teilerrest(Dieses wird an die Methode zur Konvertierung übergeben) + "alte hexaDezimalzahl"    
            hexaDezimalzahl = rest + hexaDezimalzahl;
            zahl = zahl / 16;                                                    //Berechnung des Teilungserbnisses
        }
        return hexaDezimalzahl;
 
 
    }
    //Methode convertToOct
    //Integer.toOctalString(dezimalzahl).toUpperCase()                            //Diese Methode macht das selbste von Haus aus
    private static String convertToOct(int zahl)
    {
        String octalZahl = " ";
        int rest = 0;
        
        while (zahl != 0)                            
        {
            rest = zahl % 8;
            octalZahl = rest + octalZahl;                                        //octalZahl = Teilerrest + "alte OctalZahl"
            zahl = zahl / 8;                                                    //Berechnung des Teilungserbnisses
        }
        return octalZahl;
    }
    
    
    //Konvertermethode damit die Zahlen 10 - 15 in Buchstaben konvertiert werden
    private static String intToLetterConverter(int convert)
    {
        switch (convert)
        {
        case 10: return "A";                                                     //break nicht nötig, da hier nach dem return der Code sowieso nicht mehr erreichbar wäre    
        case 11: return "B";                
        case 12: return "C";                
        case 13: return "D";                
        case 14: return "E";                
        case 15: return "F";                
        default: return ""+convert;            
        
        }
    }
    
}
 