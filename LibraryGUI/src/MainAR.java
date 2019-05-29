import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class MainAR {

	public static JFrame frameAR;
	private static JTextField TF1;
	private static JTextField TF2;
	private static JTextField TF3;
	private static JTextField TF4;
	private static JTextField TF5;
	private static JTextField TF6;
	private static JTextField TF7;
	private static JTextField TF8;
	private static JTextField TF9;
	private static String strISBNEdit;
	private static int imagesToggle = 0;
	public static ArrayList<Book> Books = new ArrayList<Book>();

	public static void main(String[] args) {

		frameAR = new JFrame("ﬂÊﬂ» «·„⁄—›…");
		frameAR.setResizable(false);
		frameAR.setBounds(100, 100, 493, 463);
		frameAR.setLocationRelativeTo(null);
		frameAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAR.getContentPane().setLayout(null);

		MainEN mainEN = new MainEN();

		frameAR.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JLabel L = new JLabel("Â· Õﬁ¯«  —Ìœ «·Œ—ÊÃø");
				L.setFont(new Font("Times New Roman", Font.BOLD, 16));
				int choice = JOptionPane.showConfirmDialog(frameAR, L, " √ﬂÌœ «·Œ—ÊÃ", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, new ImageIcon(MainAR.class.getResource("Smiley.png")));
				if (choice == JOptionPane.YES_OPTION)
					frameAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				else
					frameAR.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		JLabel image;

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.getColor("TabbedPane.background"));
		tabbedPane.setBounds(55, 82, 381, 312);
		tabbedPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		frameAR.getContentPane().add(tabbedPane);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("«·’›Õ… «·—∆Ì”Ì…", null, panel_4, "„⁄·Ê„«  ⁄‰ «· ÿ»Ìﬁ");
		tabbedPane.setForegroundAt(0, new Color(160, 82, 45));
		panel_4.setLayout(null);
		JLabel Label1 = new JLabel("√Â·« Ê”Â·« »ﬂ„ ›Ì „ﬂ »… ﬂÊﬂ» «·„⁄—›…");
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setVerticalAlignment(SwingConstants.TOP);
		Label1.setBounds(10, 11, 356, 33);
		panel_4.add(Label1);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textArea.setText(
				"Ì„ﬂ‰ﬂ ›Ì Â–« «· ÿ»Ìﬁ ≈÷«›… «·ﬂ » Ê⁄—÷Â« Ê«⁄«— Â« Ê«” —Ã«⁄Â« ÊÕ–› „«  ‘«¡ „‰Â« Ê»≈„ﬂ«‰ﬂ √Ì÷« «·»ÕÀ ⁄‰ «Ì ﬂ «»  „  ≈÷«› Â „”»ﬁ«.");
		textArea.setBackground(Color.getColor("Label.background"));
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(20, 42, 346, 61);
		panel_4.add(textArea);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setText(
				"                                ’„Ì„: √‘—› €«‰„ \n          «·»—Ìœ «·«·ﬂ —Ê‰Ì: ans_g1998@hotmail.com");
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textArea_1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textArea_1.setBackground((Color) null);
		textArea_1.setBounds(10, 105, 346, 52);
		panel_4.add(textArea_1);

		JLabel Label2 = new JLabel("");
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setBounds(20, 155, 346, 118);
		panel_4.add(Label2);
		Label2.setIcon(new ImageIcon(MainAR.class.getResource("image1.png")));

		JButton button_10 = new JButton("");
		button_10.setToolTipText("Õ›Ÿ «· ⁄œÌ·");
		button_10.setIcon(new ImageIcon(MainAR.class.getResource("saveEdit.png")));
		button_10.setContentAreaFilled(false);
		button_10.setBorderPainted(false);
		button_10.setFocusPainted(false);
		button_10.setCursor(new Cursor(Cursor.HAND_CURSOR));

		JButton button = new JButton("");
		button.setToolTipText("≈÷«›… ﬂ «»");
		button.setIcon(new ImageIcon(MainAR.class.getResource("add.png")));
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));

		JLabel labelAdd = new JLabel("");
		labelAdd.setForeground(Color.RED);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		tabbedPane.addTab("≈÷«›… ﬂ «»", null, panel_1, "≈Œ — ·≈÷«›… ﬂ «»");
		tabbedPane.setForegroundAt(1, new Color(160, 82, 45));
		panel_1.setLayout(null);
		// To empty the label " „  ≈÷«›… «·ﬂ «»" automatically once the mouse is
		// moved over the panel.
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				labelAdd.setText("");
			}
		});
		TF1 = new JTextField();
		TF1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				if (a.getKeyChar() < '0' || a.getKeyChar() > '9') {
					a.consume();
					Toolkit.getDefaultToolkit().beep();
				}
			}
		});
		TF1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF1.setHorizontalAlignment(SwingConstants.CENTER);
		TF1.setBounds(205, 35, 140, 25);
		panel_1.add(TF1);
		TF1.setColumns(10);

		TF2 = new JTextField();
		TF2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF2.setHorizontalAlignment(SwingConstants.RIGHT);
		TF2.setBounds(23, 35, 140, 25);
		panel_1.add(TF2);
		TF2.setColumns(10);

		TF3 = new JTextField();
		TF3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF3.setHorizontalAlignment(SwingConstants.RIGHT);
		TF3.setBounds(205, 99, 140, 25);
		panel_1.add(TF3);
		TF3.setColumns(10);

		TF4 = new JTextField();
		TF4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				if (a.getKeyChar() < '0' || a.getKeyChar() > '9') {
					a.consume();
					Toolkit.getDefaultToolkit().beep();
				}
			}
		});
		TF4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF4.setHorizontalAlignment(SwingConstants.RIGHT);
		TF4.setBounds(23, 99, 140, 25);
		panel_1.add(TF4);
		TF4.setColumns(10);

		TF5 = new JTextField();
		TF5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				if (a.getKeyChar() < '0' || a.getKeyChar() > '9') {
					a.consume();
					Toolkit.getDefaultToolkit().beep();
				}
			}
		});
		TF5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF5.setHorizontalAlignment(SwingConstants.RIGHT);
		TF5.setBounds(205, 161, 140, 25);
		panel_1.add(TF5);
		TF5.setColumns(10);

		JLabel label_1 = new JLabel("—ﬁ„ «·ﬂ «»");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(281, 11, 64, 20);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("«”„ «·ﬂ «»");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(99, 13, 64, 17);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("«”„ «·„ƒ·›");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(274, 75, 71, 20);
		panel_1.add(label_3);

		JLabel label_4 = new JLabel("«·≈’œ«—");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(118, 77, 45, 17);
		panel_1.add(label_4);

		JLabel label_5 = new JLabel("”‰… «·‰‘—");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(281, 135, 65, 20);
		panel_1.add(label_5);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				int i;
				for (i = 0; i < Books.size(); i++) {
					if (Books.get(i).getISBN().equals(TF1.getText())) {
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» „÷«› „”»ﬁ«", " ﬂ—«— ﬂ «»",
								JOptionPane.WARNING_MESSAGE, null);
						break;
					}
				}
				if (i == Books.size() || Books.isEmpty()) {
					if (TF1.getText().trim().equals(""))
						JOptionPane.showMessageDialog(frameAR, "ÌÃ» √‰  œŒ· —ﬁ„ «·ﬂ «»", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
					else {
						Books.add(new Book(TF1.getText(), TF2.getText(), TF3.getText(), TF4.getText(), TF5.getText()));
						TF1.setText("");
						TF2.setText("");
						TF3.setText("");
						TF4.setText("");
						TF5.setText("");
						labelAdd.setText(" „  ≈÷«›… «·ﬂ «»");
					}
				}
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setBounds(290, 215, 55, 55);
		panel_1.add(button);

		JButton button_1 = new JButton("");
		button_1.setToolTipText("„”Õ «·»Ì«‰« ");
		button_1.setIcon(new ImageIcon(MainAR.class.getResource("Erase.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setFocusPainted(false);
		button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				TF1.setText("");
				TF2.setText("");
				TF3.setText("");
				TF4.setText("");
				TF5.setText("");
				labelAdd.setText("");
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_1.setBounds(23, 215, 55, 55);
		panel_1.add(button_1);

		labelAdd.setFont(new Font("Arial", Font.BOLD, 16));
		labelAdd.setHorizontalAlignment(SwingConstants.CENTER);
		labelAdd.setBounds(23, 161, 140, 25);
		panel_1.add(labelAdd);

		button_10.setEnabled(false);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String strISBN = TF1.getText();
				if (strISBN.equals(strISBNEdit)) {
					for (int i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(strISBN)) {
							Books.get(i).setTitle(TF2.getText());
							Books.get(i).setAuthor(TF3.getText());
							Books.get(i).setEdition(TF4.getText());
							Books.get(i).setPublishedYear(TF5.getText());
							TF1.setText("");
							TF2.setText("");
							TF3.setText("");
							TF4.setText("");
							TF5.setText("");
							labelAdd.setText(" „  ⁄œÌ· „⁄·Ê„«  «·ﬂ «»");
							button_10.setEnabled(false);
							button.setEnabled(true);
							break;
						}
					}
				} else {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(strISBN)) {
							JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» „÷«› „”»ﬁ«", " ﬂ—«— ﬂ «»",
									JOptionPane.WARNING_MESSAGE, null);
							break;
						}
					}
					if (i == Books.size()) {
						for (i = 0; i < Books.size(); i++) {
							if (Books.get(i).getISBN().equals(strISBNEdit)) {
								Books.get(i).setISBN(TF1.getText());
								Books.get(i).setTitle(TF2.getText());
								Books.get(i).setAuthor(TF3.getText());
								Books.get(i).setEdition(TF4.getText());
								Books.get(i).setPublishedYear(TF5.getText());
								TF1.setText("");
								TF2.setText("");
								TF3.setText("");
								TF4.setText("");
								TF5.setText("");
								labelAdd.setText(" „  ⁄œÌ· „⁄·Ê„«  «·ﬂ «»");
								button_10.setEnabled(false);
								break;
							}
						}
					}
				}
			}
		});
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_10.setBounds(205, 215, 55, 55);
		panel_1.add(button_10);

		JPanel panel = new JPanel();
		tabbedPane.addTab("⁄—÷", null, panel, "⁄—÷ „⁄·Ê„«  ⁄‰ ﬂ «»");
		tabbedPane.setForegroundAt(2, new Color(160, 82, 45));
		panel.setLayout(null);

		JLabel label_6 = new JLabel("—ﬁ„ «·ﬂ «»");
		label_6.setBounds(274, 14, 57, 16);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(label_6);

		TF6 = new JTextField();
		TF6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				if (a.getKeyChar() < '0' || a.getKeyChar() > '9') {
					a.consume();
					Toolkit.getDefaultToolkit().beep();
				}
			}
		});
		TF6.setBounds(181, 36, 150, 30);
		TF6.setHorizontalAlignment(SwingConstants.CENTER);
		TF6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF6.setColumns(10);
		panel.add(TF6);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		comboBox.setModel(new DefaultComboBoxModel<String>(
				new String[] { "«”„ «·ﬂ «»", "«”„ «·„ƒ·›", "«·≈’œ«—", "”‰… «·‰‘—", "Â· «·ﬂ «» „ Ê›— √„ ·«ø" }));
		comboBox.setBounds(21, 36, 150, 30);
		panel.add(comboBox);

		TF7 = new JTextField();
		TF7.setBackground(Color.WHITE);
		TF7.setEditable(false);
		TF7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		TF7.setHorizontalAlignment(SwingConstants.CENTER);
		TF7.setBounds(47, 174, 286, 30);
		panel.add(TF7);
		TF7.setColumns(10);

		JButton button_2 = new JButton("«⁄—÷");
		button_2.setFocusPainted(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF6.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameAR, "ÌÃ» √‰  œŒ· —ﬁ„ «·ﬂ «»", "Œÿ√", JOptionPane.WARNING_MESSAGE,
							null);
				else if (comboBox.getSelectedIndex() == 0) {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF6.getText())) {
							TF7.setText(Books.get(i).getTitle());
							break;
						}
					}
					if (i == Books.size() || Books.isEmpty())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				} else if (comboBox.getSelectedIndex() == 1) {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF6.getText())) {
							TF7.setText(Books.get(i).getAuthor());
							break;
						}
					}
					if (i == Books.size() || Books.isEmpty())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				} else if (comboBox.getSelectedIndex() == 2) {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF6.getText())) {
							TF7.setText(Books.get(i).getEdition());
							break;
						}
					}
					if (i == Books.size() || Books.isEmpty())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				} else if (comboBox.getSelectedIndex() == 3) {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF6.getText())) {
							TF7.setText(Books.get(i).getPublishedYear());
							break;
						}
					}
					if (i == Books.size() || Books.isEmpty())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				} else if (comboBox.getSelectedIndex() == 4) {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF6.getText())) {
							if (Books.get(i).isBorrowed())
								TF7.setText("€Ì— „ Ê›—");
							else
								TF7.setText("„ Ê›—");
							break;
						}
					}
					if (i == Books.size() || Books.isEmpty())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_2.setBounds(253, 133, 80, 35);
		panel.add(button_2);

		JButton button_7 = new JButton("");
		button_7.setToolTipText("ÿ»«⁄… Ã„Ì⁄ «·ﬂ »");
		button_7.setIcon(new ImageIcon(MainAR.class.getResource("print.png")));
		button_7.setContentAreaFilled(false);
		button_7.setBorderPainted(false);
		button_7.setFocusPainted(false);
		button_7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Books.isEmpty())
					JOptionPane.showMessageDialog(frameAR, "·« ÌÊÃœ ﬂ »", "Œÿ√", JOptionPane.WARNING_MESSAGE, null);
				else {
					BookPrintAR bookPrint = new BookPrintAR();
					int i;
					String[] row = new String[6];
					/*
					 * Sorting the array list in ascending order according to
					 * the ISBN of books.
					 */
					Collections.sort(Books, new Comparator<Book>() {
						@Override
						public int compare(Book b1, Book b2) {
							return b1.getISBN().compareTo(b2.getISBN());
						}
					});
					for (i = 0; i < Books.size(); i++) {
						row[0] = Books.get(i).isBorrowed() ? "€Ì— „ Ê›—" : "„ Ê›—";
						row[1] = Books.get(i).getPublishedYear();
						row[2] = Books.get(i).getEdition();
						row[3] = Books.get(i).getAuthor();
						row[4] = Books.get(i).getTitle();
						row[5] = Books.get(i).getISBN();

						bookPrint.model.addRow(row);
					}
					bookPrint.framePrintAR.setVisible(true);
					frameAR.setVisible(false);
				}
			}
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_7.setBounds(21, 215, 55, 55);
		panel.add(button_7);

		JButton button_8 = new JButton("");
		button_8.setToolTipText("Õ–› ﬂ «»");
		button_8.setIcon(new ImageIcon(MainAR.class.getResource("delete.png")));
		button_8.setContentAreaFilled(false);
		button_8.setBorderPainted(false);
		button_8.setFocusPainted(false);
		button_8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TF6.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameAR, "ÌÃ» √‰  œŒ· —ﬁ„ «·ﬂ «»", "Œÿ√", JOptionPane.WARNING_MESSAGE,
							null);
				else if (Books.isEmpty())
					JOptionPane.showMessageDialog(frameAR, "«·„ﬂ »… ›«—€…!", "Œÿ√", JOptionPane.ERROR_MESSAGE, null);
				else {
					int i, originSize = Books.size();
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF6.getText())) {
							Books.remove(i);
							JOptionPane.showMessageDialog(frameAR, " „ Õ–› «·ﬂ «»", "Õ–› ﬂ «»",
									JOptionPane.INFORMATION_MESSAGE, null);
							TF6.setText("");
							TF7.setText("");
							break;
						}
					}
					if (i == originSize)
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_8.setBounds(276, 215, 55, 55);
		panel.add(button_8);

		JButton button_9 = new JButton("");
		button_9.setToolTipText(" ⁄œÌ· „⁄·Ê„«  «·ﬂ «»");
		button_9.setIcon(new ImageIcon(MainAR.class.getResource("edit.png")));
		button_9.setContentAreaFilled(false);
		button_9.setBorderPainted(false);
		button_9.setFocusPainted(false);
		button_9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF6.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameAR, "ÌÃ» √‰  œŒ· —ﬁ„ «·ﬂ «»", "Œÿ√", JOptionPane.WARNING_MESSAGE,
							null);
				else if (Books.isEmpty())
					JOptionPane.showMessageDialog(frameAR, "«·„ﬂ »… ›«—€…!", "Œÿ√", JOptionPane.ERROR_MESSAGE, null);
				else {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF6.getText())) {
							tabbedPane.setSelectedIndex(1);
							button_10.setEnabled(true);
							button.setEnabled(false);
							strISBNEdit = TF6.getText();
							TF1.setText(Books.get(i).getISBN());
							TF2.setText(Books.get(i).getTitle());
							TF3.setText(Books.get(i).getAuthor());
							TF4.setText(Books.get(i).getEdition());
							TF5.setText(Books.get(i).getPublishedYear());
							TF6.setText("");
							TF7.setText("");
							break;
						}
					}
					if (i == Books.size())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_9.setBounds(181, 215, 55, 55);
		panel.add(button_9);
		JRadioButton RB1 = new JRadioButton("‰⁄„");
		JRadioButton RB2 = new JRadioButton("·«");
		JButton button_4 = new JButton("");
		button_4.setToolTipText("≈⁄«—…");
		button_4.setEnabled(false);
		button_4.setIcon(new ImageIcon(MainAR.class.getResource("borrow.png")));
		button_4.setFocusPainted(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setCursor(new Cursor(Cursor.HAND_CURSOR));

		JButton button_5 = new JButton("");
		button_5.setToolTipText("«” —Ã«⁄");
		button_5.setEnabled(false);
		button_5.setIcon(new ImageIcon(MainAR.class.getResource("retrieve.png")));
		button_5.setFocusPainted(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setCursor(new Cursor(Cursor.HAND_CURSOR));

		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF8.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameAR, "ÌÃ» √‰  œŒ· —ﬁ„ «·ﬂ «»", "Œÿ√", JOptionPane.WARNING_MESSAGE,
							null);
				else {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF8.getText())) {
							Books.get(i).setBorrowed(true);
							RB1.setSelected(false);
							TF8.setText("");
							button_4.setEnabled(false);
							break;
						}
					}
					if (i == Books.size() || Books.isEmpty())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF8.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameAR, "ÌÃ» √‰  œŒ· —ﬁ„ «·ﬂ «»", "Œÿ√", JOptionPane.WARNING_MESSAGE,
							null);
				else {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF8.getText())) {
							Books.get(i).setBorrowed(false);
							RB2.setSelected(false);
							TF8.setText("");
							button_5.setEnabled(false);
							break;
						}
					}
					if (i == Books.size() || Books.isEmpty())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("≈⁄«—… «Ê «” —Ã«⁄", null, panel_2, "≈⁄«—… √Ê «” —Ã«⁄ ﬂ «»");
		tabbedPane.setForegroundAt(3, new Color(160, 82, 45));
		panel_2.setLayout(null);

		JLabel label_7 = new JLabel("—ﬁ„ «·ﬂ «»");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(274, 14, 57, 16);
		panel_2.add(label_7);

		TF8 = new JTextField();
		TF8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				if (a.getKeyChar() < '0' || a.getKeyChar() > '9') {
					a.consume();
					Toolkit.getDefaultToolkit().beep();
				}
			}
		});
		TF8.setHorizontalAlignment(SwingConstants.CENTER);
		TF8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF8.setColumns(10);
		TF8.setBounds(181, 35, 150, 30);
		panel_2.add(TF8);

		JButton button_3 = new JButton("Â· ÂÊ „ Ê›— √„ ·«ø");
		button_3.setFocusPainted(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF8.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameAR, "ÌÃ» √‰  œŒ· —ﬁ„ «·ﬂ «»", "Œÿ√", JOptionPane.WARNING_MESSAGE,
							null);
				else {
					int i;
					for (i = 0; i < Books.size(); i++) {
						if (Books.get(i).getISBN().equals(TF8.getText())) {
							if (Books.get(i).isBorrowed()) {
								RB2.setSelected(true);
								button_4.setEnabled(false);
								button_5.setEnabled(true);
							} else {
								RB1.setSelected(true);
								button_5.setEnabled(false);
								button_4.setEnabled(true);
							}
							break;
						}
					}
					if (i == Books.size() || Books.isEmpty())
						JOptionPane.showMessageDialog(frameAR, "Â–« «·ﬂ «» €Ì— „ÊÃÊœ", "Œÿ√",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		button_3.setBounds(188, 110, 135, 32);
		panel_2.add(button_3);

		button_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_4.setBounds(212, 215, 55, 55);
		panel_2.add(button_4);

		button_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_5.setBounds(87, 215, 55, 55);
		panel_2.add(button_5);

		RB1.setEnabled(false);
		RB1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		RB1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		RB1.setHorizontalAlignment(SwingConstants.CENTER);
		RB1.setBounds(112, 115, 57, 23);
		panel_2.add(RB1);

		RB2.setEnabled(false);
		RB2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		RB2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		RB2.setHorizontalAlignment(SwingConstants.CENTER);
		RB2.setBounds(38, 115, 57, 23);
		panel_2.add(RB2);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("«·»ÕÀ ⁄‰ ﬂ «»", null, panel_3, "«»ÕÀ ⁄‰ ﬂ «» „⁄Ì¯‰");
		tabbedPane.setForegroundAt(4, new Color(160, 82, 45));
		panel_3.setLayout(null);

		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(
				new DefaultComboBoxModel<String>(new String[] { "«”„ «·ﬂ «»", "«”„ «·„ƒ·›", "«·≈’œ«—", "”‰… «·‰‘—" }));
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		comboBox_1.setBounds(245, 35, 98, 30);
		panel_3.add(comboBox_1);

		TF9 = new JTextField();
		TF9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				if (comboBox_1.getSelectedIndex() == 2 || comboBox_1.getSelectedIndex() == 3) {
					if (a.getKeyChar() < '0' || a.getKeyChar() > '9') {
						a.consume();
						Toolkit.getDefaultToolkit().beep();
					}
				}

			}
		});
		TF9.setHorizontalAlignment(SwingConstants.CENTER);
		TF9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		TF9.setColumns(10);
		TF9.setBounds(21, 35, 214, 30);
		panel_3.add(TF9);

		JLabel label_8 = new JLabel("«·»ÕÀ Õ”»:");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(258, 14, 87, 16);
		panel_3.add(label_8);

		JButton button_6 = new JButton("");
		button_6.setToolTipText("«·»ÕÀ ⁄‰ ﬂ «»");
		button_6.setIcon(new ImageIcon(MainAR.class.getResource("search.png")));
		button_6.setContentAreaFilled(false);
		button_6.setBorderPainted(false);
		button_6.setFocusPainted(false);
		button_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TF9.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameAR, "ÌÃ» √‰  „·√ «·Õﬁ·", "Œÿ√", JOptionPane.ERROR_MESSAGE, null);
				else {
					// To trim the text by removing the unnecessary spaces.
					TF9.setText(TF9.getText().trim());
					int i;
					String books = "";
					boolean found = false;
					if (comboBox_1.getSelectedIndex() == 0) {
						for (i = 0; i < Books.size(); i++) {
							if ((Books.get(i).getTitle().toLowerCase()).contains(TF9.getText().toLowerCase())) {
								books += ("* " + Books.get(i).getTitle() + "\n");
								found = true;
							}
						}
						if (found == false)
							JOptionPane.showMessageDialog(frameAR, "·« ÌÊÃœ ﬂ «» »Â–« «·«”„", "Œÿ√",
									JOptionPane.WARNING_MESSAGE, null);
						else {
							frameAR.setVisible(false);
							new BookSearchAR();
							BookSearchAR.label2.setText("ÌÕ ÊÌ «”„Â« ⁄·Ï " + TF9.getText());
							BookSearchAR.TA.setText(books);
						}
					} else if (comboBox_1.getSelectedIndex() == 1) {
						for (i = 0; i < Books.size(); i++) {
							if ((Books.get(i).getAuthor().toLowerCase()).contains(TF9.getText().toLowerCase())) {
								books += ("* " + Books.get(i).getTitle() + "\n");
								found = true;
							}
						}
						if (found == false)
							JOptionPane.showMessageDialog(frameAR, "·« ÌÊÃœ ﬂ » ·Â–« «·„ƒ·›", "Œÿ√",
									JOptionPane.WARNING_MESSAGE, null);
						else {
							frameAR.setVisible(false);
							new BookSearchAR();
							BookSearchAR.label2.setText("ÌÕ ÊÌ «”„ „ƒ·›Â« ⁄·Ï " + TF9.getText());
							BookSearchAR.TA.setText(books);
						}
					}
					if (comboBox_1.getSelectedIndex() == 2) {
						for (i = 0; i < Books.size(); i++) {
							if (Books.get(i).getEdition().equals(TF9.getText())) {
								books += ("* " + Books.get(i).getTitle() + "\n");
								found = true;
							}
						}
						if (found == false)
							JOptionPane.showMessageDialog(frameAR, "·« ÌÊÃœ ﬂ «» »Â–« «·≈’œ«—", "Œÿ√",
									JOptionPane.WARNING_MESSAGE, null);
						else {
							frameAR.setVisible(false);
							new BookSearchAR();
							BookSearchAR.label2.setText("ÿ»⁄ Â« " + TF9.getText());
							BookSearchAR.TA.setText(books);
						}
					}
					if (comboBox_1.getSelectedIndex() == 3) {
						for (i = 0; i < Books.size(); i++) {
							if (Books.get(i).getPublishedYear().equals(TF9.getText())) {
								books += ("* " + Books.get(i).getTitle() + "\n");
								found = true;
							}
						}
						if (found == false)
							JOptionPane.showMessageDialog(frameAR, "·« ÌÊÃœ ﬂ » ‰‘—  »Â–Â «·”‰…", "Œÿ√",
									JOptionPane.WARNING_MESSAGE, null);
						else {
							frameAR.setVisible(false);
							new BookSearchAR();
							BookSearchAR.label2.setText("‰‘—  ”‰… " + TF9.getText());
							BookSearchAR.TA.setText(books);
						}
					}
				}
			}
		});
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_6.setBounds(160, 215, 55, 55);
		panel_3.add(button_6);

		JLabel imagesShow = new JLabel();
		imagesShow.setBounds(21, 76, 132, 132);
		panel_3.add(imagesShow);

		JLabel imagesShow1 = new JLabel();
		imagesShow1.setBounds(211, 76, 132, 132);
		panel_3.add(imagesShow1);

		Timer timer = new Timer(1500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (imagesToggle == 0) {
					imagesShow1.setIcon(new ImageIcon(MainAR.class.getResource("imagesShow.png")));
					imagesToggle = 1;
				} else if (imagesToggle == 1) {
					imagesShow.setIcon(new ImageIcon(MainAR.class.getResource("imagesShow1.png")));
					imagesToggle = 2;
				} else if (imagesToggle == 2) {
					imagesShow1.setIcon(new ImageIcon(MainAR.class.getResource("imagesShow2.png")));
					imagesToggle = 3;
				} else if (imagesToggle == 3) {
					imagesShow.setIcon(new ImageIcon(MainAR.class.getResource("imagesShow3.png")));
					imagesToggle = 0;
				}
			}
		});
		timer.start();

		image = new JLabel(new ImageIcon(MainAR.class.getResource("image4.png")));
		image.setBounds(0, 0, 487, 413);
		frameAR.getContentPane().add(image);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		frameAR.setJMenuBar(menuBar);

		JMenu menu = new JMenu("«··€…");
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		menuBar.add(menu);

		JMenuItem menuItem = new JMenuItem("«··€… «·«‰Ã·Ì“Ì…",
				new ImageIcon(MainAR.class.getResource("LanguageIcon.png")));
		menuItem.setHorizontalTextPosition(SwingConstants.LEFT);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				frameAR.setVisible(false);
				mainEN.frameEN.setVisible(true);
			}
		});
		menuItem.setHorizontalAlignment(SwingConstants.CENTER);
		menuItem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menu.add(menuItem);
		frameAR.setVisible(true);
	}
}
