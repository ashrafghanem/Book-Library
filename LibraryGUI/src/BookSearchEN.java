import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class BookSearchEN {
	public static JLabel label2;
	public static JTextArea TA;

	public BookSearchEN() {
		JFrame frameSearchEN = new JFrame("Searching Results");
		frameSearchEN.setBackground(new Color(173, 216, 230));
		frameSearchEN.getContentPane().setBackground(new Color(245, 222, 179));
		frameSearchEN.setResizable(false);
		frameSearchEN.setBounds(100, 100, 493, 463);
		frameSearchEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSearchEN.setLocationRelativeTo(null);
		frameSearchEN.getContentPane().setLayout(null);
		frameSearchEN.setVisible(true);

		frameSearchEN.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int choice = JOptionPane.showConfirmDialog(frameSearchEN, "Do you really want to exit?",
						"Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
						new ImageIcon(BookSearchEN.class.getResource("Smiley.png")));
				if (choice == JOptionPane.YES_OPTION)
					frameSearchEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				else
					frameSearchEN.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});

		JButton button = new JButton("");
		button.setToolTipText("Back");
		button.setIcon(new ImageIcon(BookSearchEN.class.getResource("back.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameSearchEN.setVisible(false);
				MainEN.frameEN.setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setBounds(330, 368, 89, 55);
		frameSearchEN.getContentPane().add(button);

		JLabel label1 = new JLabel("Books that ");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		label1.setBounds(19, 22, 90, 31);
		frameSearchEN.getContentPane().add(label1);

		label2 = new JLabel("");
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		label2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label2.setBounds(108, 22, 248, 31);
		frameSearchEN.getContentPane().add(label2);

		TA = new JTextArea("");
		TA.setWrapStyleWord(true);
		TA.setLineWrap(true);
		TA.setEditable(false);
		TA.setBackground(new Color(245, 222, 179));
		TA.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		TA.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		TA.setBounds(19, 64, 256, 339);
		frameSearchEN.getContentPane().add(TA);

		JLabel labelImage = new JLabel("");
		labelImage.setIcon(new ImageIcon(BookSearchEN.class.getResource("image2.png")));
		labelImage.setBounds(285, 99, 180, 185);
		frameSearchEN.getContentPane().add(labelImage);
	}
}
