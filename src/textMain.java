import javax.swing.JFrame;

public class textMain {
	public static void main (String args []) {
		textArea tArea = new textArea();
		tArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tArea.setSize(500, 300);
		tArea.setVisible(true);
	}
}
