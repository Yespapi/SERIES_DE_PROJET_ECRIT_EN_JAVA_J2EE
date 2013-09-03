/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author simon
 */
public class TestIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        BufferedReader keyboard = 
                new BufferedReader(new InputStreamReader(System.in));
        ChatUI theUI = new ChatUI("Window Title", new OutputStreamWriter(System.out));
        String line;
        while ((line = keyboard.readLine()) != null) {
            theUI.appendText(line);
        }

    }
}
