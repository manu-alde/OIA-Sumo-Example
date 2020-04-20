package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import entities.Competition;
import entities.Sumo;
import utilities.Utilities;

class SumoTest {

	@Test
	void testCase1() {
		try {
			List<Sumo> sumos = Utilities.getFromFile("sumo.in");
			Competition.setSurpass(sumos);
			Utilities.writeToFile("result.out", sumos);
			int[] expected = Utilities.getResultFromFile("resultSumo.out", sumos.size());
			int[] result = Utilities.getResultFromFile("result.out", sumos.size());
			assertArrayEquals(expected, result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testCase2() {
		try {
			List<Sumo> sumos = Utilities.getFromFile("sumo1.in");
			Competition.setSurpass(sumos);
			Utilities.writeToFile("result.out", sumos);
			int[] expected = Utilities.getResultFromFile("resultSumo1.out", sumos.size());
			int[] result = Utilities.getResultFromFile("result.out", sumos.size());
			assertArrayEquals(expected, result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testCase3() {
		try {
			List<Sumo> sumos = Utilities.getFromFile("sumo2.in");
			Competition.setSurpass(sumos);
			Utilities.writeToFile("result.out", sumos);
			int[] expected = Utilities.getResultFromFile("resultSumo2.out", sumos.size());
			int[] result = Utilities.getResultFromFile("result.out", sumos.size());
			assertArrayEquals(expected, result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testCase4() {
		try {
			List<Sumo> sumos = Utilities.getFromFile("sumo3.in");
			Competition.setSurpass(sumos);
			Utilities.writeToFile("result.out", sumos);
			int[] expected = Utilities.getResultFromFile("resultSumo3.out", sumos.size());
			int[] result = Utilities.getResultFromFile("result.out", sumos.size());
			assertArrayEquals(expected, result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
