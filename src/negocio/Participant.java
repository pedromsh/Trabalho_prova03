package negocio;

import java.util.ArrayList;

public class Participant {

	    //Atributos
		private String name;
		private ArrayList<String> soccerTeams;
		private ArrayList<Integer> scoreBoards;
		
		//Metodo construtor
		public Participant() {
			this.soccerTeams = new ArrayList<String>();
			this.scoreBoards = new ArrayList<Integer>();
		}

		//Metodos getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<String> getSoccerTeams() {
			return soccerTeams;
		}

		public void setSoccerTeams(ArrayList<String> soccerTeams) {
			this.soccerTeams = soccerTeams;
		}

		public ArrayList<Integer> getScoreBoards() {
			return scoreBoards;
		}

		public void setScoreBoards(ArrayList<Integer> scoreBoards) {
			this.scoreBoards = scoreBoards;
		}
		
}
