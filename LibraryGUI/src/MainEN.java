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

public class MainEN {

	public static JFrame frameEN;
	private static JTextField TF1;
	private static JTextField TF2;
	private static JTextField TF3;
	private static JTextField TF4;
	private static JTextField TF5;
	private static JTextField TF6;
	private static JTextField TF7;
	private static JTextField TF8;
	private static JTextField TF9;
	private static int imagesToggle = 0;
	private static String strISBNEdit;

	public MainEN() {

		frameEN = new JFrame("Knowledge Planet");
		frameEN.setResizable(false);
		frameEN.setBounds(100, 100, 493, 463);
		frameEN.setLocationRelativeTo(null);
		frameEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameEN.getContentPane().setLayout(null);

		frameEN.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JLabel L = new JLabel("Do you really want to exit?");
				L.setFont(new Font("Times New Roman", Font.BOLD, 16));
				int choice = JOptionPane.showConfirmDialog(frameEN, L, "Exit Confirmation", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, new ImageIcon(MainEN.class.getResource("Smiley.png")));
				if (choice == JOptionPane.YES_OPTION)
					frameEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				else
					frameEN.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		JRadioButton RB1 = new JRadioButton("Yes");
		JRadioButton RB2 = new JRadioButton("No");
		JButton button_4 = new JButton("");
		button_4.setToolTipText("Borrow a Book");
		button_4.setEnabled(false);
		button_4.setIcon(new ImageIcon(MainEN.class.getResource("borrow.png")));
		button_4.setFocusPainted(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setCursor(new Cursor(Cursor.HAND_CURSOR));

		JButton button_5 = new JButton("");
		button_5.setToolTipText("Retrieve a Book");
		button_5.setEnabled(false);
		button_5.setIcon(new ImageIcon(MainEN.class.getResource("retrieve.png")));
		button_5.setFocusPainted(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setCursor(new Cursor(Cursor.HAND_CURSOR));

		JLabel image;
		JLabel labelAdd = new JLabel("");
		labelAdd.setForeground(Color.RED);

		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF8.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameEN, "You must insert book NO.", "Error",
							JOptionPane.WARNING_MESSAGE, null);
				else {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF8.getText())) {
							MainAR.Books.get(i).setBorrowed(true);
							RB1.setSelected(false);
							TF8.setText("");
							button_4.setEnabled(false);
							break;
						}
					}
					if (i == MainAR.Books.size() || MainAR.Books.isEmpty())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF8.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameEN, "You must insert book NO.", "Error",
							JOptionPane.WARNING_MESSAGE, null);
				else {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF8.getText())) {
							MainAR.Books.get(i).setBorrowed(false);
							RB2.setSelected(false);
							TF8.setText("");
							button_5.setEnabled(false);
							break;
						}
					}
					if (i == MainAR.Books.size() || MainAR.Books.isEmpty())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		JLabel label = new JLabel("Knowledge Planet");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 35));
		label.setBounds(75, 11, 336, 60);
		frameEN.getContentPane().add(label);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.getColor("TabbedPane.background"));
		tabbedPane.setBounds(47, 82, 398, 312);
		frameEN.getContentPane().add(tabbedPane);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Main Page", null, panel_4, "Info. about the app");
		panel_4.setLayout(null);
		JLabel Label1 = new JLabel("Welcome to Knowledge Planet Library");
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setVerticalAlignment(SwingConstants.TOP);
		Label1.setBounds(10, 11, 356, 33);
		panel_4.add(Label1);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textArea.setText("This application enables you to add books, view, borrow, retrieve and delete"
				+ " what you don't need. You can also search for any previously added books.");
		textArea.setBackground(Color.getColor("Label.background"));
		textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(20, 40, 346, 61);
		panel_4.add(textArea);

		JTextArea txtrDesignedByAshraf = new JTextArea();
		txtrDesignedByAshraf.setEditable(false);
		txtrDesignedByAshraf.setText(
				"                     Designed by: Ashraf Ghanem\r\n                 E-Mail: ans_g1998@hotmail.com");
		txtrDesignedByAshraf.setWrapStyleWord(true);
		txtrDesignedByAshraf.setLineWrap(true);
		txtrDesignedByAshraf.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrDesignedByAshraf.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtrDesignedByAshraf.setBackground((Color) null);
		txtrDesignedByAshraf.setBounds(10, 105, 346, 40);
		panel_4.add(txtrDesignedByAshraf);

		JLabel Label2 = new JLabel("");
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setBounds(20, 145, 346, 128);
		panel_4.add(Label2);
		Label2.setIcon(new ImageIcon(MainEN.class.getResource("image3.png")));
		tabbedPane.setForegroundAt(0, new Color(160, 82, 45));

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		tabbedPane.addTab("Add Book", null, panel_1, "Choose to add a book");
		tabbedPane.setForegroundAt(1, new Color(160, 82, 45));
		panel_1.setLayout(null);
		// To empty the label "Book Addition Succeeded" automatically once the
		// mouse is
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
		TF1.setBounds(23, 35, 140, 25);
		panel_1.add(TF1);
		TF1.setColumns(10);

		TF2 = new JTextField();
		TF2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF2.setHorizontalAlignment(SwingConstants.LEFT);
		TF2.setBounds(205, 35, 140, 25);
		panel_1.add(TF2);
		TF2.setColumns(10);

		TF3 = new JTextField();
		TF3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF3.setHorizontalAlignment(SwingConstants.LEFT);
		TF3.setBounds(23, 95, 140, 25);
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
		TF4.setHorizontalAlignment(SwingConstants.LEFT);
		TF4.setBounds(205, 95, 140, 25);
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
		TF5.setHorizontalAlignment(SwingConstants.LEFT);
		TF5.setBounds(23, 157, 140, 25);
		panel_1.add(TF5);
		TF5.setColumns(10);

		JLabel label_1 = new JLabel("ISBN:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(23, 14, 45, 20);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("Book Name:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setBounds(205, 14, 76, 17);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("Author Name:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(23, 74, 95, 20);
		panel_1.add(label_3);

		JLabel label_4 = new JLabel("Edition:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setBounds(205, 74, 45, 17);
		panel_1.add(label_4);

		JLabel label_5 = new JLabel("Published Year:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setBounds(23, 135, 96, 20);
		panel_1.add(label_5);

		JButton button = new JButton("");
		button.setToolTipText("Add a Book");
		button.setIcon(new ImageIcon(MainEN.class.getResource("add.png")));
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				int i;
				for (i = 0; i < MainAR.Books.size(); i++) {
					if (MainAR.Books.get(i).getISBN().equals(TF1.getText())) {
						JOptionPane.showMessageDialog(frameEN, "This book exists in the library!", "Book Repitition",
								JOptionPane.WARNING_MESSAGE, null);
						break;
					}
				}
				if (i == MainAR.Books.size() || MainAR.Books.isEmpty()) {
					if (TF1.getText().trim().equals(""))
						JOptionPane.showMessageDialog(frameEN, "You must insert book NO.", "Error",
								JOptionPane.WARNING_MESSAGE, null);
					else {
						MainAR.Books.add(
								new Book(TF1.getText(), TF2.getText(), TF3.getText(), TF4.getText(), TF5.getText()));
						TF1.setText("");
						TF2.setText("");
						TF3.setText("");
						TF4.setText("");
						TF5.setText("");
						labelAdd.setText("Addition Succeeded");
					}
				}
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setBounds(22, 215, 55, 55);
		panel_1.add(button);

		JButton button_1 = new JButton("");
		button_1.setToolTipText("Clear Fields");
		button_1.setIcon(new ImageIcon(MainEN.class.getResource("Erase.png")));
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
		button_1.setBounds(290, 215, 55, 55);
		panel_1.add(button_1);

		labelAdd.setFont(new Font("Times New Roman", Font.BOLD, 16));
		labelAdd.setHorizontalAlignment(SwingConstants.LEFT);
		labelAdd.setBounds(205, 157, 140, 25);
		panel_1.add(labelAdd);

		JButton button_10 = new JButton("");
		button_10.setToolTipText("Save Edits");
		button_10.setEnabled(false);
		button_10.setIcon(new ImageIcon(MainEN.class.getResource("saveEdit.png")));
		button_10.setContentAreaFilled(false);
		button_10.setBorderPainted(false);
		button_10.setFocusPainted(false);
		button_10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String strISBN = TF1.getText();
				if (strISBN.equals(strISBNEdit)) {
					for (int i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(strISBN)) {
							MainAR.Books.get(i).setTitle(TF2.getText());
							MainAR.Books.get(i).setAuthor(TF3.getText());
							MainAR.Books.get(i).setEdition(TF4.getText());
							MainAR.Books.get(i).setPublishedYear(TF5.getText());
							TF1.setText("");
							TF2.setText("");
							TF3.setText("");
							TF4.setText("");
							TF5.setText("");
							labelAdd.setText("Editing Succeeded");
							button_10.setEnabled(false);
							button.setEnabled(true);
							break;
						}
					}
				} else {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(strISBN)) {
							JOptionPane.showMessageDialog(frameEN, "This book exists in the library!",
									"Book Repitition", JOptionPane.WARNING_MESSAGE, null);
							break;
						}
					}
					if (i == MainAR.Books.size()) {
						for (i = 0; i < MainAR.Books.size(); i++) {
							if (MainAR.Books.get(i).getISBN().equals(strISBNEdit)) {
								MainAR.Books.get(i).setISBN(TF1.getText());
								MainAR.Books.get(i).setTitle(TF2.getText());
								MainAR.Books.get(i).setAuthor(TF3.getText());
								MainAR.Books.get(i).setEdition(TF4.getText());
								MainAR.Books.get(i).setPublishedYear(TF5.getText());
								TF1.setText("");
								TF2.setText("");
								TF3.setText("");
								TF4.setText("");
								TF5.setText("");
								labelAdd.setText("Editing Succeeded");
								button_10.setEnabled(false);
								break;
							}
						}
					}
				}
			}
		});
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_10.setBounds(108, 215, 55, 55);
		panel_1.add(button_10);

		JPanel panel = new JPanel();
		tabbedPane.addTab("View", null, panel, "View Book Info.");
		tabbedPane.setForegroundAt(2, new Color(160, 82, 45));
		panel.setLayout(null);

		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setBounds(37, 14, 44, 16);
		lblIsbn.setHorizontalAlignment(SwingConstants.LEFT);
		lblIsbn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblIsbn);

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
		TF6.setBounds(37, 36, 150, 30);
		TF6.setHorizontalAlignment(SwingConstants.CENTER);
		TF6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TF6.setColumns(10);
		panel.add(TF6);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		comboBox.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Title", "Author", "Edition", "Published Year", "Available or Not?" }));
		comboBox.setBounds(199, 36, 150, 30);
		panel.add(comboBox);

		TF7 = new JTextField();
		TF7.setBackground(Color.WHITE);
		TF7.setEditable(false);
		TF7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		TF7.setHorizontalAlignment(SwingConstants.CENTER);
		TF7.setBounds(37, 174, 286, 30);
		panel.add(TF7);
		TF7.setColumns(10);

		JButton button_2 = new JButton("View");
		button_2.setFocusPainted(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF6.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameEN, "You must insert book NO.", "Error",
							JOptionPane.WARNING_MESSAGE, null);
				else if (comboBox.getSelectedIndex() == 0) {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF6.getText())) {
							TF7.setText(MainAR.Books.get(i).getTitle());
							break;
						}
					}
					if (i == MainAR.Books.size() || MainAR.Books.isEmpty())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				} else if (comboBox.getSelectedIndex() == 1) {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF6.getText())) {
							TF7.setText(MainAR.Books.get(i).getAuthor());
							break;
						}
					}
					if (i == MainAR.Books.size() || MainAR.Books.isEmpty())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				} else if (comboBox.getSelectedIndex() == 2) {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF6.getText())) {
							TF7.setText(MainAR.Books.get(i).getEdition());
							break;
						}
					}
					if (i == MainAR.Books.size() || MainAR.Books.isEmpty())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				} else if (comboBox.getSelectedIndex() == 3) {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF6.getText())) {
							TF7.setText(MainAR.Books.get(i).getPublishedYear());
							break;
						}
					}
					if (i == MainAR.Books.size() || MainAR.Books.isEmpty())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				} else if (comboBox.getSelectedIndex() == 4) {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF6.getText())) {
							if (MainAR.Books.get(i).isBorrowed())
								TF7.setText("Not Available");
							else
								TF7.setText("Available");
							break;
						}
					}
					if (i == MainAR.Books.size() || MainAR.Books.isEmpty())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_2.setBounds(37, 133, 80, 35);
		panel.add(button_2);

		JButton button_7 = new JButton("");
		button_7.setToolTipText("Print All Books");
		button_7.setIcon(new ImageIcon(MainEN.class.getResource("print.png")));
		button_7.setContentAreaFilled(false);
		button_7.setBorderPainted(false);
		button_7.setFocusPainted(false);
		button_7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MainAR.Books.isEmpty())
					JOptionPane.showMessageDialog(frameEN, "No Books found!", "Error", JOptionPane.WARNING_MESSAGE,
							null);
				else {
					BookPrintEN bookPrint = new BookPrintEN();
					int i;
					String[] row = new String[6];
					/*
					 * Sorting the array list in ascending order according to
					 * the ISBN of books.
					 */
					Collections.sort(MainAR.Books, new Comparator<Book>() {
						@Override
						public int compare(Book b1, Book b2) {
							return b1.getISBN().compareTo(b2.getISBN());
						}
					});
					for (i = 0; i < MainAR.Books.size(); i++) {
						row[0] = MainAR.Books.get(i).getISBN();
						row[1] = MainAR.Books.get(i).getTitle();
						row[2] = MainAR.Books.get(i).getAuthor();
						row[3] = MainAR.Books.get(i).getEdition();
						row[4] = MainAR.Books.get(i).getPublishedYear();
						row[5] = MainAR.Books.get(i).isBorrowed() ? "Not Available" : "Available";

						bookPrint.model.addRow(row);
					}
					bookPrint.framePrintEN.setVisible(true);
					frameEN.setVisible(false);
				}
			}
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_7.setBounds(294, 215, 55, 55);
		panel.add(button_7);

		JButton button_8 = new JButton("");
		button_8.setToolTipText("Delete a Book");
		button_8.setIcon(new ImageIcon(MainEN.class.getResource("delete.png")));
		button_8.setContentAreaFilled(false);
		button_8.setBorderPainted(false);
		button_8.setFocusPainted(false);
		button_8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TF6.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameEN, "You must insert book NO.", "Error",
							JOptionPane.WARNING_MESSAGE, null);
				else if (MainAR.Books.isEmpty())
					JOptionPane.showMessageDialog(frameEN, "Library is Empty!", "Error", JOptionPane.ERROR_MESSAGE,
							null);
				else {
					int i, originSize = MainAR.Books.size();
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF6.getText())) {
							MainAR.Books.remove(i);
							JOptionPane.showMessageDialog(frameEN, "Book Deletion Succeeded", "Book Deletion",
									JOptionPane.INFORMATION_MESSAGE, null);
							TF6.setText("");
							TF7.setText("");
							break;
						}
					}
					if (i == originSize)
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_8.setBounds(37, 215, 55, 55);
		panel.add(button_8);

		JButton button_9 = new JButton("");
		button_9.setToolTipText("Edit Book Info.");
		button_9.setIcon(new ImageIcon(MainEN.class.getResource("edit.png")));
		button_9.setContentAreaFilled(false);
		button_9.setBorderPainted(false);
		button_9.setFocusPainted(false);
		button_9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF6.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameEN, "You must insert book NO.", "Error",
							JOptionPane.WARNING_MESSAGE, null);
				else if (MainAR.Books.isEmpty())
					JOptionPane.showMessageDialog(frameEN, "Library is Empty!", "Error", JOptionPane.ERROR_MESSAGE,
							null);
				else {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF6.getText())) {
							tabbedPane.setSelectedIndex(1);
							button_10.setEnabled(true);
							button.setEnabled(false);
							strISBNEdit = TF6.getText();
							TF1.setText(MainAR.Books.get(i).getISBN());
							TF2.setText(MainAR.Books.get(i).getTitle());
							TF3.setText(MainAR.Books.get(i).getAuthor());
							TF4.setText(MainAR.Books.get(i).getEdition());
							TF5.setText(MainAR.Books.get(i).getPublishedYear());
							TF6.setText("");
							TF7.setText("");
							break;
						}
					}
					if (i == MainAR.Books.size())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_9.setBounds(132, 215, 55, 55);
		panel.add(button_9);
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Borrow/Retrieve", null, panel_2, "Borrow or Retrieve a Book");
		panel_2.setLayout(null);

		JLabel label_7 = new JLabel("ISBN:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(37, 14, 44, 16);
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
		TF8.setBounds(37, 36, 126, 30);
		panel_2.add(TF8);

		JButton button_3 = new JButton("Available or Not?");
		button_3.setFocusPainted(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (TF8.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameEN, "You must insert book NO.", "Error",
							JOptionPane.WARNING_MESSAGE, null);
				else {
					int i;
					for (i = 0; i < MainAR.Books.size(); i++) {
						if (MainAR.Books.get(i).getISBN().equals(TF8.getText())) {
							if (MainAR.Books.get(i).isBorrowed()) {
								RB2.setSelected(true);
								button_5.setEnabled(true);
								button_4.setEnabled(false);
							} else {
								RB1.setSelected(true);
								button_5.setEnabled(false);
								button_4.setEnabled(true);
							}
							break;
						}
					}
					if (i == MainAR.Books.size() || MainAR.Books.isEmpty())
						JOptionPane.showMessageDialog(frameEN, "This book does not exist!", "Error",
								JOptionPane.WARNING_MESSAGE, null);
				}
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		button_3.setBounds(37, 109, 162, 32);
		panel_2.add(button_3);

		button_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_4.setBounds(87, 215, 55, 55);
		panel_2.add(button_4);

		button_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button_5.setBounds(212, 215, 55, 55);
		panel_2.add(button_5);

		RB1.setEnabled(false);
		RB1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		RB1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		RB1.setHorizontalAlignment(SwingConstants.CENTER);
		RB1.setBounds(223, 114, 57, 23);
		panel_2.add(RB1);

		RB2.setEnabled(false);
		RB2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		RB2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		RB2.setHorizontalAlignment(SwingConstants.CENTER);
		RB2.setBounds(295, 114, 57, 23);
		panel_2.add(RB2);
		tabbedPane.setForegroundAt(3, new Color(160, 82, 45));

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Search", null, panel_3, "Search for a Book");
		panel_3.setLayout(null);

		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Title", "Author", "Edition", "Published Year" }));
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		comboBox_1.setBounds(21, 36, 118, 30);
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
		TF9.setBounds(149, 36, 206, 30);
		panel_3.add(TF9);

		JLabel label_8 = new JLabel("Search by:");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(21, 14, 73, 16);
		panel_3.add(label_8);

		JButton button_6 = new JButton("");
		button_6.setToolTipText("Search for a Book");
		button_6.setIcon(new ImageIcon(MainEN.class.getResource("search.png")));
		button_6.setContentAreaFilled(false);
		button_6.setBorderPainted(false);
		button_6.setFocusPainted(false);
		button_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TF9.getText().trim().equals(""))
					JOptionPane.showMessageDialog(frameEN, "You must fill in the field!", "Error",
							JOptionPane.ERROR_MESSAGE, null);
				else {
					// To trim the text by removing the unnecessary spaces.
					TF9.setText(TF9.getText().trim());
					int i;
					String books = "";
					boolean found = false;
					if (comboBox_1.getSelectedIndex() == 0) {
						for (i = 0; i < MainAR.Books.size(); i++) {
							if ((MainAR.Books.get(i).getTitle().toLowerCase()).contains(TF9.getText().toLowerCase())) {
								books += ("* " + MainAR.Books.get(i).getTitle() + "\n");
								found = true;
							}
						}
						if (found == false)
							JOptionPane.showMessageDialog(frameEN, "No books with this title!", "Error",
									JOptionPane.WARNING_MESSAGE, null);
						else {
							frameEN.setVisible(false);
							new BookSearchEN();
							BookSearchEN.label2.setText("their title contains " + TF9.getText());
							BookSearchEN.TA.setText(books);
						}
					} else if (comboBox_1.getSelectedIndex() == 1) {
						for (i = 0; i < MainAR.Books.size(); i++) {
							if ((MainAR.Books.get(i).getAuthor().toLowerCase()).contains(TF9.getText().toLowerCase())) {
								books += ("* " + MainAR.Books.get(i).getTitle() + "\n");
								found = true;
							}
						}
						if (found == false)
							JOptionPane.showMessageDialog(frameEN, "No books with this author!", "Error",
									JOptionPane.WARNING_MESSAGE, null);
						else {
							frameEN.setVisible(false);
							new BookSearchEN();
							BookSearchEN.label2.setText("their author contains " + TF9.getText());
							BookSearchEN.TA.setText(books);
						}
					}
					if (comboBox_1.getSelectedIndex() == 2) {
						for (i = 0; i < MainAR.Books.size(); i++) {
							if (MainAR.Books.get(i).getEdition().equals(TF9.getText())) {
								books += ("* " + MainAR.Books.get(i).getTitle() + "\n");
								found = true;
							}
						}
						if (found == false)
							JOptionPane.showMessageDialog(frameEN, "No books with this edition!", "Error",
									JOptionPane.WARNING_MESSAGE, null);
						else {
							frameEN.setVisible(false);
							new BookSearchEN();
							BookSearchEN.label2.setText("their edition is " + TF9.getText());
							BookSearchEN.TA.setText(books);
						}
					}
					if (comboBox_1.getSelectedIndex() == 3) {
						for (i = 0; i < MainAR.Books.size(); i++) {
							if (MainAR.Books.get(i).getPublishedYear().equals(TF9.getText())) {
								books += ("* " + MainAR.Books.get(i).getTitle() + "\n");
								found = true;
							}
						}
						if (found == false)
							JOptionPane.showMessageDialog(frameEN, "No books with this published year", "Error",
									JOptionPane.WARNING_MESSAGE, null);
						else {
							frameEN.setVisible(false);
							new BookSearchEN();
							BookSearchEN.label2.setText("were published in " + TF9.getText());
							BookSearchEN.TA.setText(books);
						}
					}
				}
			}
		});
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_6.setBounds(160, 215, 55, 55);
		panel_3.add(button_6);

		JLabel imagesShow = new JLabel();
		imagesShow.setBounds(21, 77, 132, 132);
		panel_3.add(imagesShow);

		JLabel imagesShow1 = new JLabel();
		imagesShow1.setBounds(221, 77, 132, 132);
		panel_3.add(imagesShow1);
		tabbedPane.setForegroundAt(4, new Color(160, 82, 45));

		Timer timer = new Timer(1500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (imagesToggle == 0) {
					imagesShow.setIcon(new ImageIcon(MainEN.class.getResource("imagesShow.png")));
					imagesToggle = 1;
				} else if (imagesToggle == 1) {
					imagesShow1.setIcon(new ImageIcon(MainEN.class.getResource("imagesShow1.png")));
					imagesToggle = 2;
				} else if (imagesToggle == 2) {
					imagesShow.setIcon(new ImageIcon(MainEN.class.getResource("imagesShow2.png")));
					imagesToggle = 3;
				} else if (imagesToggle == 3) {
					imagesShow1.setIcon(new ImageIcon(MainEN.class.getResource("imagesShow3.png")));
					imagesToggle = 0;
				}
			}
		});
		timer.start();

		image = new JLabel(new ImageIcon(MainEN.class.getResource("image.jpg")));
		image.setBounds(0, 0, 487, 434);
		frameEN.getContentPane().add(image);

		JMenuBar menuBar = new JMenuBar();
		frameEN.setJMenuBar(menuBar);

		JMenu mnLanguage = new JMenu("Language");
		mnLanguage.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnLanguage);

		JMenuItem mntmArabic = new JMenuItem("Arabic", new ImageIcon(MainEN.class.getResource("LanguageIcon.png")));
		mntmArabic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameEN.setVisible(false);
				MainAR.frameAR.setVisible(true);
			}
		});
		mnLanguage.add(mntmArabic);
	}
}
