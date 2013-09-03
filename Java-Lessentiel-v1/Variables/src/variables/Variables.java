/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author simon
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // numeric values, all signed
        // Notice naming convention for variables
        byte   aByte      = 127;    // behaves like 8 bits
        short  aShort     = 037654; // behaves like 16 bits
        int    anInteger  = 123456; // behaves like 32 bits
        long   aLong      = 0xCAFE; // behaves like 64 bits.

                // floating point numbers
        float  aFloat     = 99.9F;
        double aDouble    = 98.0E+99;

        // unsigned number, represents a character
        // coded using Unicode
        char   aCharacter = 'A';    // behaves like 16 bits
	aCharacter = '\u0041';      // hexadecimal literal
	aCharacter = '\n';          // newline

        // logical value; true or false
        boolean aBoolean = true;    // behaves like one bit
        


        
    }
}
