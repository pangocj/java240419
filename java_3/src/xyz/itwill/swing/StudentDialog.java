package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class StudentDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField numTF;
	private JTextField nameTF;
	private JTextField phoneTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			StudentDialog dialog = new StudentDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public StudentDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] {100, 300};
		gbl_contentPanel.rowHeights = new int[] {50, 50, 50};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("학번");
			lblNewLabel.setFont(new Font("굴림체", Font.BOLD, 20));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			numTF = new JTextField();
			numTF.setFont(new Font("굴림체", Font.PLAIN, 20));
			GridBagConstraints gbc_numTF = new GridBagConstraints();
			gbc_numTF.fill = GridBagConstraints.BOTH;
			gbc_numTF.insets = new Insets(0, 0, 5, 0);
			gbc_numTF.gridx = 1;
			gbc_numTF.gridy = 0;
			contentPanel.add(numTF, gbc_numTF);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("이름");
			lblNewLabel_1.setFont(new Font("굴림체", Font.BOLD, 20));
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 0;
			gbc_lblNewLabel_1.gridy = 1;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			nameTF = new JTextField();
			nameTF.setFont(new Font("굴림체", Font.PLAIN, 20));
			GridBagConstraints gbc_nameTF = new GridBagConstraints();
			gbc_nameTF.fill = GridBagConstraints.BOTH;
			gbc_nameTF.insets = new Insets(0, 0, 5, 0);
			gbc_nameTF.gridx = 1;
			gbc_nameTF.gridy = 1;
			contentPanel.add(nameTF, gbc_nameTF);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("전화번호");
			lblNewLabel_2.setFont(new Font("굴림체", Font.BOLD, 20));
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_2.gridx = 0;
			gbc_lblNewLabel_2.gridy = 2;
			contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		}
		{
			phoneTF = new JTextField();
			phoneTF.setFont(new Font("굴림체", Font.PLAIN, 20));
			GridBagConstraints gbc_phoneTF = new GridBagConstraints();
			gbc_phoneTF.fill = GridBagConstraints.BOTH;
			gbc_phoneTF.gridx = 1;
			gbc_phoneTF.gridy = 2;
			contentPanel.add(phoneTF, gbc_phoneTF);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("추가");
				okButton.setFont(new Font("굴림체", Font.BOLD, 20));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.setFont(new Font("굴림체", Font.BOLD, 20));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
