package tictactoe;

public class GameLogic {

	static int laufvariable;
	static int hilfvariablebutton = 0;
	static int t = 0;

	public static int game_over() {

		// winner => t = 2
		// field full without winner => t = 1
		// field not full and no winner => t = 0


		// check if there is three in a row
		if (TTT_GUI.button[0].buttonValue == TTT_GUI.button[1].buttonValue
				& TTT_GUI.button[1].buttonValue == TTT_GUI.button[2].buttonValue) {
			t = 2;
		} else if (TTT_GUI.button[3].buttonValue == TTT_GUI.button[4].buttonValue
				& TTT_GUI.button[4].buttonValue == TTT_GUI.button[5].buttonValue) {
			t = 2;
		} else if (TTT_GUI.button[6].buttonValue == TTT_GUI.button[7].buttonValue
				& TTT_GUI.button[7].buttonValue == TTT_GUI.button[8].buttonValue) {
			t = 2;
		} else if (TTT_GUI.button[0].buttonValue == TTT_GUI.button[3].buttonValue
				& TTT_GUI.button[3].buttonValue == TTT_GUI.button[6].buttonValue) {
			t = 2;
		} else if (TTT_GUI.button[1].buttonValue == TTT_GUI.button[4].buttonValue
				& TTT_GUI.button[4].buttonValue == TTT_GUI.button[7].buttonValue) {
			t = 2;
		} else if (TTT_GUI.button[2].buttonValue == TTT_GUI.button[5].buttonValue
				& TTT_GUI.button[5].buttonValue == TTT_GUI.button[8].buttonValue) {
			t = 2;
		} else if (TTT_GUI.button[0].buttonValue == TTT_GUI.button[4].buttonValue
				& TTT_GUI.button[4].buttonValue == TTT_GUI.button[8].buttonValue) {
			t = 2;
		} else if (TTT_GUI.button[2].buttonValue == TTT_GUI.button[4].buttonValue
				& TTT_GUI.button[4].buttonValue == TTT_GUI.button[6].buttonValue) {
			t = 2;
		}

		// check if the ttt-field is full
		else if ((TTT_GUI.button[0].buttonValue == 0 || TTT_GUI.button[0].buttonValue == 1)
				& (TTT_GUI.button[0].buttonValue == 0 || TTT_GUI.button[0].buttonValue == 1)
				& (TTT_GUI.button[1].buttonValue == 0 || TTT_GUI.button[1].buttonValue == 1)
				& (TTT_GUI.button[2].buttonValue == 0 || TTT_GUI.button[2].buttonValue == 1)
				& (TTT_GUI.button[3].buttonValue == 0 || TTT_GUI.button[3].buttonValue == 1)
				& (TTT_GUI.button[4].buttonValue == 0 || TTT_GUI.button[4].buttonValue == 1)
				& (TTT_GUI.button[5].buttonValue == 0 || TTT_GUI.button[5].buttonValue == 1)
				& (TTT_GUI.button[6].buttonValue == 0 || TTT_GUI.button[6].buttonValue == 1)
				& (TTT_GUI.button[7].buttonValue == 0 || TTT_GUI.button[7].buttonValue == 1)
				& (TTT_GUI.button[8].buttonValue == 0 || TTT_GUI.button[8].buttonValue == 1)) {
			t = 1;
		}

		//game continues
		else {
			t = 0;
		}

		return t;
	}

	public static int new_game() {

		laufvariable = 0;

		for (int i = 0; i <= 8; i++) {
			TTT_GUI.button[i].buttonPosition = i;
			TTT_GUI.button[i].buttonValue = i + 10;
			TTT_GUI.button[i].setText("  ");
		}

		return 0;

	}

}
