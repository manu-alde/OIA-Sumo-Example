package entities;

import java.util.List;

public class Competition {
	public static void setSurpass(List<Sumo> sumos) {
		for (int i = 0; i < sumos.size(); i++) {
			for (int j = i+1; j < sumos.size(); j++) {
				int compare = Sumo.compare(sumos.get(i),sumos.get(j));
				if(compare > 0) {
					sumos.get(i).increaseWins();
				}
				else if(compare < 0) {
					sumos.get(j).increaseWins();
				}
			}
		}
	}

}
