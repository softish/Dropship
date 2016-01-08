package start;

import javax.swing.JFrame;

/**
 * Initiating the whole thing
 * @author softish
 *
 */
public class Main {

	public static void main(String[] args) {
		// invoke via event dispatch thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				generateGUI();
			}
		});

	}
	
	private static void generateGUI() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 720);
		frame.setVisible(true);
	}

}
