package application;

import static org.junit.Assert.*;
import org.junit.Test;


public class CryptoManagerTestStudent {

	    @Test
	    public void testIsStringInBounds() {
	        assertTrue(CryptoManager.isStringInBounds("FRIES"));
	        assertFalse(CryptoManager.isStringInBounds("hello"));
	    }
	    
	    @Test
	    public void testCaesarEncryption() {
	        assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3));
	        assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("saltwater", 100));
	    }
	    
	    @Test
	    public void testCaesarDecryption() {
	        assertEquals("HELLO", CryptoManager.caesarDecryption("KHOOR", 3));
	        assertEquals("TESTING ANOTHER STRING", CryptoManager.caesarDecryption(";,:;05.G(56;/,9G:;905.", 999));
	    }
	    
	    @Test
	    public void testBellasoDecryption() {
	        assertEquals("ABCDEFG", CryptoManager.bellasoDecryption("DOVGHSZ", "CMSC"));
	    }

}

