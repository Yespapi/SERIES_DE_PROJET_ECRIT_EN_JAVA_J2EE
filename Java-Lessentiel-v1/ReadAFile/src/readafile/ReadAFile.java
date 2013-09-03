/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readafile;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author simon
 */
public class ReadAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        
        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("Read: " + line);
        }

    }
}
