package tictactoe;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TTT_GUI {

	GridLayout layout;
	JPanel panel;
	static JFrame frame;
	static TictactoeButton button[] = new TictactoeButton[9];

	TTT_GUI() {

		// make the frame with the layout
		layout = new GridLayout(3, 3);
		frame = new JFrame();
		panel = new JPanel();

		frame.setContentPane(panel);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(600, 600);
		panel.setLayout(layout);

		// make the TictactoeButton.buttons and give every TictactoeButton.button a different
		// value and position
		// add them to the panel
		// add the actionlistener
		for (int i = 0; i <= 8; i++) {
			button[i] = new TictactoeButton();
			button[i].buttonPosition = i;
			button[i].buttonValue = i + 10;
			button[i].setText("  ");
			panel.add(button[i]);
			button[i].addActionListener(new Listener());


		}
		
		frame.setVisible(true);
	}
	
	static void winner_dialog(){
		JDialog dialog = new JDialog();
		JPanel pan = new JPanel();
		JLabel label = new JLabel();
		
		pan.setLayout(new FlowLayout());

		if ((GameLogic.t == 2) & (GameLogic.laufvariable % 2 == 0)) {
			label.setText("Spieler 2 hat gewonnen! =)");
		}
		if((GameLogic.t == 2) & (GameLogic.laufvariable % 2 == 1)) {
			label.setText("Spieler 1 hat gewonnen! =)");
		}
		if(GameLogic.t == 1)  {
			label.setText("Unentschieden! =)");
		}

		pan.add(label);
		dialog.add(pan);
		dialog.setModal(true);
		dialog.setSize(300,300);
		dialog.setLocationRelativeTo(frame);
		dialog.setVisible(true);

		
	}

}
