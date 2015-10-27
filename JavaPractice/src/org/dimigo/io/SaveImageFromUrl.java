/**
 * 
 */
package org.dimigo.io;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;
/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.io
 *  |_ SaveImageFromUrl
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 10. 26.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String imageUrl = "http://upload2.inven.co.kr/upload/2015/07/05/bbs/i13172215603.png";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				FileOutputStream os = new FileOutputStream("Files/haljjak.png")) {
				
				
				int result;
				byte[] buf = new byte[100];
				
				while((result = is.read(buf))!= -1) {
					os.write(buf,0,result);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
}
