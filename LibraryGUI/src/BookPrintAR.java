import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class BookPrintAR {

	public JFrame framePrintAR;
	public DefaultTableModel model;

	public BookPrintAR() {
		framePrintAR = new JFrame("«·ﬂ » «·„÷«›…");
		framePrintAR.setResizable(false);
		framePrintAR.setBounds(100, 100, 532, 463);
		framePrintAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrintAR.setLocationRelativeTo(null);
		framePrintAR.getContentPane().setLayout(null);
		framePrintAR.setVisible(true);

		framePrintAR.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int choice = JOptionPane.showConfirmDialog(framePrintAR, "Â· Õﬁ¯«  —Ìœ «·Œ—ÊÃø", " √ﬂÌœ «·Œ—ÊÃ",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
						new ImageIcon(BookPrintAR.class.getResource("Smiley.png")));
				if (choice == JOptionPane.YES_OPTION)
					framePrintAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				else
					framePrintAR.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});

		JTable table = new JTable();
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);

		String columns[] = { "„ÊÃÊœ √„ ·«ø", "”‰… «·‰‘—", "«·≈’œ«—", "«”„ «·„ƒ·›", "«”„ «·ﬂ «»", "—ﬁ„ «·ﬂ «»" };
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);

		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Times New Roman", Font.BOLD, 16));
		table.setFont(new Font("Times New Roman", Font.BOLD, 14));

		table.setModel(model);
		table.setRowHeight(30);

		JScrollPane pane = new JScrollPane(table);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pane.setBounds(0, 0, 526, 355);

		table.setBounds(36, 21, 532, 400);
		framePrintAR.getContentPane().add(pane);

		JButton button = new JButton("");
		button.setToolTipText("—ÃÊ⁄");
		button.setIcon(new ImageIcon(BookPrintAR.class.getResource("back.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePrintAR.setVisible(false);
				MainAR.frameAR.setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setBounds(217, 366, 89, 57);
		framePrintAR.getContentPane().add(button);
	}
}
