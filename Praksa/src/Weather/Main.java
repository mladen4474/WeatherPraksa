package Weather;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner unosGrada = new Scanner(System.in);

		System.out.println("Unesite grad za prikaz temperature:\n");
		String grad = unosGrada.next();
		unosGrada.close();

		String api = "https://api.openweathermap.org/data/2.5/weather?q=";
		String idapi = "&appid=fe6b6dc75e369f44c6cfaa1983bb7242";
		String jedMerenja = "&units=metric";

		weather vreme = new weather() {
		};
		vreme.API(api, grad, idapi, jedMerenja);

	}
}
