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

public class BookSearchAR {
	public static JLabel label2;
	public static JTextArea TA;

	public BookSearchAR() {
		JFrame frameSearchAR = new JFrame("‰ «∆Ã «·»ÕÀ");
		frameSearchAR.setBackground(new Color(173, 216, 230));
		frameSearchAR.getContentPane().setBackground(new Color(245, 222, 179));
		frameSearchAR.setResizable(false);
		frameSearchAR.setBounds(100, 100, 493, 463);
		frameSearchAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSearchAR.setLocationRelativeTo(null);
		frameSearchAR.getContentPane().setLayout(null);
		frameSearchAR.setVisible(true);

		frameSearchAR.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int choice = JOptionPane.showConfirmDialog(frameSearchAR, "Â· Õﬁ¯«  —Ìœ «·Œ—ÊÃø", " √ﬂÌœ «·Œ—ÊÃ",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
						new ImageIcon(BookSearchAR.class.getResource("Smiley.png")));
				if (choice == JOptionPane.YES_OPTION)
					frameSearchAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				else
					frameSearchAR.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});

		JButton button = new JButton();
		button.setToolTipText("—ÃÊ⁄");
		button.setIcon(new ImageIcon(BookSearchAR.class.getResource("back.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameSearchAR.setVisible(false);
				MainAR.frameAR.setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setBounds(61, 348, 89, 55);
		frameSearchAR.getContentPane().add(button);

		JLabel label1 = new JLabel("«·ﬂ » «· Ì ");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		label1.setBounds(411, 22, 66, 31);
		frameSearchAR.getContentPane().add(label1);

		label2 = new JLabel("");
		label2.setHorizontalAlignment(SwingConstants.RIGHT);
		label2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label2.setBounds(174, 22, 240, 31);
		frameSearchAR.getContentPane().add(label2);

		TA = new JTextArea("");
		TA.setWrapStyleWord(true);
		TA.setLineWrap(true);
		TA.setEditable(false);
		TA.setBackground(new Color(245, 222, 179));
		TA.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		TA.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		TA.setBounds(221, 53, 256, 350);
		frameSearchAR.getContentPane().add(TA);

		JLabel labelImage = new JLabel("");
		labelImage.setIcon(new ImageIcon(BookSearchAR.class.getResource("image2.png")));
		labelImage.setBounds(31, 84, 180, 185);
		frameSearchAR.getContentPane().add(labelImage);
	}
}
