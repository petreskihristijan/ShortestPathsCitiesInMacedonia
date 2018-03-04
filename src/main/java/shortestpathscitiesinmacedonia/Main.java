package shortestpathscitiesinmacedonia;

import java.awt.*;
import javax.swing.*;

/**
 * A GUI Swing application used to find the shortest path between the cities
 * in Macedonia
 * @version 1.0 03-03-2018
 * @author Hristijan
 *
 */
public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new ShortestPathFrame();
			frame.setTitle("Routes");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class ShortestPathFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 250;
	private static final int DEFAULT_HEIGHT = 100;
	private JLabel fromLabel;
	private JLabel toLabel;
	private JComboBox fromCombo;
	private JComboBox toCombo;
	private JButton searchButton;
	private JLabel routeLabel;
	private JLabel distanceLabel;
	private JPanel mainPanel;
	private JPanel secPanel;
	
	public ShortestPathFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		
		fromLabel = new JLabel("From:");
		toLabel = new JLabel("To:");
		fromCombo = new JComboBox();
		toCombo = new JComboBox();
		routeLabel = new JLabel("The shortest route is: ");
		distanceLabel = new JLabel("The distance is: ");
		
		JPanel optionPanel = new JPanel(new GridLayout(2,1));
		optionPanel.add(routeLabel);
		optionPanel.add(distanceLabel);
		searchButton = new JButton("Search");
		searchButton.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, optionPanel);
		});
		
		mainPanel = new JPanel(new GridLayout(3,1));
		secPanel = new JPanel(new GridLayout(1,2));
		
		secPanel.add(fromLabel);
		secPanel.add(fromCombo);
		mainPanel.add(secPanel);
		
		secPanel = new JPanel(new GridLayout(1,2));
		secPanel.add(toLabel);
		secPanel.add(toCombo);
		mainPanel.add(secPanel);
		
		mainPanel.add(searchButton);
		add(mainPanel);
	}
}
