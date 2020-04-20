package entities;

import java.io.IOException;
import java.util.List;

import utilities.Utilities;

public class Main {

	public static void main(String[] args) {
		try {
			List<Sumo> sumos = Utilities.getFromFile("sumo.in");
			Competition.setSurpass(sumos);
			Utilities.writeToFile("result.out", sumos);
		} catch (IOException e) {
			System.out.println();
			e.printStackTrace();
		}
	}

}
