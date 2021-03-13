/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readconsole;
import java.io.*;
/**
 *
 * @author Riko Sanjaya
 */
public class ReadConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        
        try{
            cin = new InputStreamReader(System.in);
            System.out.println("Masukkan huruf 'q' untuk berhenti");
            char c;
            do{
                c = (char) cin.read();
                System.out.print(c);
            } while (c != 'q');
        }finally {
            if (cin != null){
                cin.close();
            }
        }
    }   
}