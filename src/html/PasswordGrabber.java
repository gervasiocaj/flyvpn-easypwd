package html;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class PasswordGrabber {

	public static void main(String[] args) {
		try {
			grabPasswords();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String[] grabPasswords() throws IOException {
		String[] pass = {null, null};
		String source = "http://www.flyvpn.com/freetrial";
		
		Elements table = Jsoup.connect(source).get().select(".freetrial-account-table");
		
		System.out.println("sauce" + table.toString());
		
		
		return pass ;
	}

}
