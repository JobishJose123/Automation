package baseClasses;

import org.apache.commons.codec.binary.Base64;

public class Base64Encoder {

	public String getBase64EncodedString(String user,String password) {
		String userpassword = user + ":" + password;
	    String encodedAuthorization = new Base64().encodeToString( userpassword.getBytes() );
	    System.out.println(encodedAuthorization);
	    return encodedAuthorization;
	}
}
