package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	String[] jokes = {"What's the best thing about Switzerland? \n \n I don't know, but the flag is a big plus",
			"I invented a new word! \n \n Plagiarism!",
			"Did you hear about the mathematician who's afraid of negative numbers? \n \n He'll stop at nothing to avoid them.",
			"Why do we tell actors to \"break a leg?\" \n \n Because every play has a cast.",
			"Helvetica and Times New Roman walk into a bar. \n \n \"Get out of here!\" shouts the bartender, \"We don't serve your type!\"",
			"Knock, knock! \n Who's there? \n Control freak. \n Con... \n Okay now you say, \"Control freak who?\"",
			"A woman in labor suddenly shouted, \"Shouldn't! Wouldn't! Couldn't! Didn't! Can't!\" \n \n \"Don't worry,\" said the doctor, \"those are just contractions.\"",
			"A bear walks into a bar and says, \"Give me a whiskey and...... cola.\" \n \"Why the big pause?\" asks the bartender. \n \n The bear shrugged. \"I'm not sure. I was born with them.\""};
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		addNumbers.addActionListener((e) -> {
			String thing = "";
			String otherThing = "";
			thing = JOptionPane.showInputDialog("put in a number: ");
			while (thing.equals("")) {}
			otherThing = JOptionPane.showInputDialog("put in another number: ");
			JOptionPane.showMessageDialog(null, "" + (Integer.parseInt(thing) + Integer.parseInt(otherThing)));
		});
		randNumber.addActionListener((e) -> {
			JOptionPane.showMessageDialog(null, "" + new Random().nextInt(10000));
		});
		tellAJoke.addActionListener((e) -> {
			JOptionPane.showMessageDialog(null, jokes[new Random().nextInt(jokes.length)]);
		});
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
