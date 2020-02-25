/**
 *  Copy right (C) 2020 Luvina
 * Common.java, Feb 24, 2020 DungPham
 */
package manageruser.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * common static function
 * @author DungPham
 *
 */
public class Common {
	/**
	 * 
	 * @param str string has symbol need replace
	 * @return String was replaced
	 */
	public static String replaceSymbol(String str) {
		String[] symbol = {"&", "\"", "'", "/", "<", ">"};
		String[] replaceSymbol = {"&amp;", "&quot;", "&#x27;", "&#x2F;", "&lt;", "&gt;"};
		for (int i = 0; i < symbol.length; i++) {
			str.replaceAll(symbol[i], replaceSymbol[i]);
		}
		return str;
	}
	/**
	 * get salt 
	 * @param
	 * @return String random salt
	 */
	private static String getSalt() throws NoSuchAlgorithmException
	{
		SecureRandom sr1 = SecureRandom.getInstance("SHA1PRNG");
		byte[] salt = new byte[16];
		sr1.nextBytes(salt);
		return salt.toString();
	}
	/**
	 * hash code encypt pass + salt
	 * @Param  passwordToHash password need to encrypt
	 * @Param  salt salt need to encrypt
	 * @return String code encrypt 
	 */
	public static String get_SHA_1_SecurePassword(String passwordToHash, String salt)
	{
		String generatedPassword = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(salt.getBytes());
			byte[] bytes = md.digest(passwordToHash.getBytes());
			StringBuilder sb = new StringBuilder();
			for(int i=0; i< bytes.length ;i++)
			{
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			generatedPassword = sb.toString();
		} 
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		return generatedPassword;
	}
	public static boolean CompareString(String str1, String str2) {
		return str1.equals(str2);
	}
}
