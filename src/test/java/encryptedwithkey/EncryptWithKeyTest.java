package test.java.encryptedwithkey;

import main.java.encryptedwithkey.EncryptWithKey;
import org.junit.Assert;
import org.junit.Test;


public class EncryptWithKeyTest {

	@Test
	public void testEncryptWithKey_WithKeyInBounds() {
		Assert.assertEquals("bjqhtrj yt mdujwxpnqq", EncryptWithKey.encrypt("welcome to hyperskill", 5));
	}

	@Test
	public void testEncryptWithKey_WithKey1() {
		Assert.assertEquals("bcde", EncryptWithKey.encrypt("abcd", 1));
	}

	@Test
	public void testEncryptWithKey_WithKey25() {
		Assert.assertEquals("zabc", EncryptWithKey.encrypt("abcd", 25));
	}

	@Test
	public void testEncryptWithKey_WithKey26() {
		Assert.assertEquals("abcd", EncryptWithKey.encrypt("abcd", 26));
	}

	@Test
	public void testEncryptWithKey_WithKey27() {
		Assert.assertEquals("bcde", EncryptWithKey.encrypt("abcd", 27));
	}

	@Test
	public void testEncryptWithKey_WithKey52() {
		Assert.assertEquals("abcd", EncryptWithKey.encrypt("abcd", 52));
	}

	@Test
	public void testEncryptWithKey_WithKey53() {
		Assert.assertEquals("bcde", EncryptWithKey.encrypt("abcd", 53));
	}
}
