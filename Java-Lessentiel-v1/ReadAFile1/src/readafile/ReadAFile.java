/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readafile;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon
 */
public class ReadAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader keyboard =
                new BufferedReader(new InputStreamReader(System.in));

        boolean success = false;

        FileReader fr = null;
        BufferedReader br = null;
        while (!success) {
            System.out.print("Enter filename: ");
            String filename = null;
            try {
                filename = keyboard.readLine();
                fr = new FileReader(filename);
                br = new BufferedReader(fr);
                success = true;
            } catch (FileNotFoundException ex) {
                System.err.println("File " + filename + " was not found, try again...");
            } catch (IOException ex) {
                System.err.println("Failed to read the keyboard!");
            }
        }


        String line;
        try {
            while ((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
