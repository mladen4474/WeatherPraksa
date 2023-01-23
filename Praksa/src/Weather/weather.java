package Weather;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.parser.JSONParser;

public class weather extends weathersett {

	public void API(String api, String grad, String idapi, String jedMerenja) {

		// -------------------------------------------------------------------------------------------
		try {
			URL url = new URL(api + grad + idapi + jedMerenja);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			// con.setReadTimeout(10000);
			con.connect();
			// -------------------------------------------------------------------------------------------
			int response = con.getResponseCode();
			if (response != 200) {
				System.err.println("konekcija nije uspela");
			} else {
				System.out.println("konekcija je uspela");
			}
			// ------------------------------------------------------------------
			/*
			 * String k = ""; StringBuffer createContent = new StringBuffer();
			 * BufferedReader inputStream = new BufferedReader(new
			 * InputStreamReader(con.getInputStream())); while ((k = inputStream.readLine())
			 * != null) { createContent.append(k); } inputStream.close();
			 * 
			 * System.out.println(createContent.append(k));
			 */

			// --------------------------------------------------------------------------------------------

			String JSONpodaci = "";
			Scanner upis = new Scanner(url.openStream());

			while (upis.hasNext()) {
				JSONpodaci += upis.nextLine();
			}
			upis.close();

			// ------------------------------------------------------------------------------------

			JSONParser parse = new JSONParser();
			org.json.simple.JSONObject data_obj = (org.json.simple.JSONObject) parse.parse(JSONpodaci);

			org.json.simple.JSONObject obj = (org.json.simple.JSONObject) data_obj.get("main");
			
			System.out.println("temperatura je:			" + obj.get("temp") + " °C");
			System.out.println("subjektivni osecaj je:		" + obj.get("feels_like") + " °C");
			System.out.println("maksimalna temperatura je:	" + obj.get("temp_max") + " °C");
			System.out.println("minimalna temperatura je:	" + obj.get("temp_min") + " °C");
		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

}
