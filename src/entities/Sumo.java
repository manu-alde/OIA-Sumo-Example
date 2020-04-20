package entities;

public class Sumo {
	private int idSumo;
	private int height;
	private int weight;
	private int wins;

	public Sumo(int idSumo, int height, int weight) {
		this.idSumo = idSumo;
		this.height = height;
		this.weight = weight;
	}

	public int getIdSumo() {
		return idSumo;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sumo other = (Sumo) obj;
		if (height != other.height)
			return false;
		if (idSumo != other.idSumo)
			return false;
		if (weight != other.weight)
			return false;
		if (wins != other.wins)
			return false;
		return true;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public void increaseWins() {
		this.wins++;
	}

	public static int compare(Sumo s1, Sumo s2) {
		if (s1.weight > s2.getWeight() && s1.getHeight() > s2.getHeight()
				|| s1.getWeight() == s2.getWeight() && s1.getHeight() > s2.getHeight()
				|| s1.getHeight() == s2.getHeight() && s1.getWeight() > s2.getWeight())
			return 1;
		if (s1.getWeight() == s2.getWeight() && s1.getHeight() == s2.getHeight()) {
			return 0;
		}
		if (s1.weight < s2.getWeight() && s1.getHeight() < s2.getHeight()
				|| s1.getWeight() == s2.getWeight() && s1.getHeight() < s2.getHeight()
				|| s1.getHeight() == s2.getHeight() && s1.getWeight() < s2.getWeight())
			return -1;
		return 0;
	}

}
