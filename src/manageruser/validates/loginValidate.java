/**
 *  Copy right (C) 2020 Luvina
 * loginValidate.java, Feb 24, 2020 DungPham
 */
package manageruser.validates;

import manageruser.utils.MessageErrorProperties;

/**
 * Validate login 
 * @author DungPham
 *
 */
public class loginValidate {
	public static String checkNullOrEmpty(String username, String password) {
		StringBuilder messError = new StringBuilder();
		if("".equals(username) || "".equals(password)) {
			// thêm message lỗi MSG006 trong file MessageError.Properties vào messError
			messError.append(MessageErrorProperties.getValueByKey("ER001"));
			messError.append("<p style='margin:0;'>" +MessageErrorProperties.getValueByKey("ER016") + "</p>");
		}
		// tra ve chuoi loi~
		return messError.toString();
	}
}
