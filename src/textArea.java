import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class textArea extends JFrame {
	private JTextField field;
	private JButton button;
	private JTextArea area;
	
	public textArea() {
		super("JTextArea Demo");
		setLayout(new FlowLayout());
		
		field = new JTextField(30);
		add(field);
		
		button = new JButton("Add Field text to Area");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						String fieldText = field.getText();
						
						area.setText(fieldText);
					}
				}
				);
		add(button);
		
		area = new JTextArea(10, 40);
		add(area);
	}
}
