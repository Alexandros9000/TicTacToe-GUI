package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
	


		TictactoeButton clickedbutton = (TictactoeButton) e.getSource();

// spieler 0 ist an der reihe
		if ((GameLogic.laufvariable % 2) == 0) {

			if ((clickedbutton.buttonValue == 0) || (clickedbutton.buttonValue == 1)) {
				GameLogic.laufvariable += 2;
			} else {
				clickedbutton.buttonValue = 0;
				clickedbutton.setText("O");
				GameLogic.laufvariable += 1;
			}
		}

// spieler 1 ist an der reihe
		if ((GameLogic.laufvariable % 2) == 1) {

			if ((clickedbutton.buttonValue == 0) || (clickedbutton.buttonValue == 1)) {
				GameLogic.laufvariable += 2;
			} else {
				clickedbutton.buttonValue = 1;
				clickedbutton.setText("X");
				GameLogic.laufvariable += 1;
			}
		}
		
		int a = GameLogic.game_over();
		
		if((a==2) || (a==1)) {
			
			TTT_GUI.winner_dialog();
			GameLogic.new_game();
		}
		

	}

}
