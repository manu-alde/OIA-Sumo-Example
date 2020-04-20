package utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Sumo;

public class Utilities {
	public static List<Sumo> getFromFile(String path) throws IOException {
		File myObj = new File(path);
		Scanner reader = new Scanner(myObj);
		List<Sumo> sumos = new ArrayList<>();
		int times = Integer.parseInt(reader.nextLine());
		for (int i = 0; i < times; i++) {
			String data = reader.nextLine();
			String[] splitted = data.split(" ", 2);
			int idSumo = i;
			int weight = Integer.parseInt(splitted[0]);
			int height = Integer.parseInt(splitted[1]);
			sumos.add(new Sumo(idSumo, weight, height));
		}
		reader.close();
		return sumos;
	}

	public static void writeToFile(String path, List<Sumo> sumos) throws IOException {
		File fout = new File(path);
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

		for (int i = 0; i < sumos.size(); i++) {
			bw.write(String.valueOf(sumos.get(i).getWins()));
			bw.newLine();
		}
		bw.close();
	}

	public static int[] getResultFromFile(String path, int count) throws IOException {
		File file = new File(path);
		Scanner reader = new Scanner(file);

		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = reader.nextInt();
		}
		reader.close();
		return result;
	}
}
