package com.example.entertiment.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;



/*
 * Pase InputSream to Str
 * 
 */
public class PaseInputStreamToString {

	public static String PaseXmlToString(InputStream in) {
		// ByteArrayOutputStream out = new ByteArrayOutputStream();
		// byte[] b = new byte[1024];
		// int len = 0;
		// try {
		// if (encode == null || encode.equals("")) {
		// // Ĭ����utf-8��ʽ
		// encode = "utf-8";
		// }
		// while ((len = in.read(b)) > 0) {
		// out.write(b, 0, len);
		// }
		// return out.toString();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// return "";
		
		
		
		
		StringBuffer out = new StringBuffer();
		try {
			byte[] b = new byte[1024];
			for (int n; (n = in.read(b)) != -1;) {
				out.append(new String(b, 0, n));
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out.toString();
	}

}
