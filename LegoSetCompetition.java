package test;

import java.util.Scanner;

class CompetitionLog {
	private int playerNumber;// 2
	private String completeSets;// lego sets name complete
	private String incompleteSets;// lego sets name complete
	private int piecesBuilt;// whatever

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public void setIncompleteSets(String incompleteSets) {
		this.incompleteSets = incompleteSets;
	}

	CompetitionLog(int playerNumber, String completeSets, String incompleteSets, int piecesBuilt) {
		this.playerNumber = playerNumber;
		this.completeSets = completeSets;
		this.incompleteSets = incompleteSets;
		this.piecesBuilt = piecesBuilt;
	}

	public String getCompleteSets() {
		return completeSets;
	}

	public void setCompleteSets(String completeSets) {
		this.completeSets = completeSets;
	}

	public int getPiecesBuilt() {
		return piecesBuilt;
	}

	public void setPiecesBuilt(int piecesBuilt) {
		this.piecesBuilt = piecesBuilt;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public String getIncompleteSets() {
		return incompleteSets;
	}

	public void setIncompletesets(String incompleteSets) {
	}

	public String toString() {
		return "Player " + playerNumber + " completed the following sets: " + completeSets + "\n" + "Player "
				+ playerNumber + " did not complete the following sets: " + incompleteSets + "\n" + "Player "
				+ playerNumber + " built a total of " + piecesBuilt + " pieces\n";
	}
}
	public class LegoSetCompetition {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] setNames = new String[3];
			int[] setPieces = new int[3];
			for (int i = 0; i < 3; i++) {
				System.out.print("Enter the name of LEGO set " + (i + 1) + ": ");
				setNames[i] = sc.nextLine();
				System.out.print("Enter the number of pieces in LEGO set " + (i + 1) + ": ");
				setPieces[i] = Integer.parseInt(sc.nextLine());
			}
		}

	}

