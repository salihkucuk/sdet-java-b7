package day33;

import java.util.Arrays;

public class Team {
	public static void main(String[] args) {
		String[][] teams = {
				{"Alex", "Mark", "Akyl", "Daniel"},
				{"Ari", "Frank", "Nurik", "Anna"},
				{"Selvin", "Meerim", "GG"},
				{"Job", "Edil", "Evelyn", "Rocio"}
		};
		
		System.out.println(Arrays.deepToString(teams));
		
		// TODO print each name in new line from teams element in all upper cases
		
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				String name = teams[i][j];
				System.out.println(name.toUpperCase());
			}
		}
		System.out.println("---");
		
		for (String[] innerTeam : teams) {
			for (String name : innerTeam) {
				System.out.println(name.toUpperCase());
			}
		}
		
	}
}