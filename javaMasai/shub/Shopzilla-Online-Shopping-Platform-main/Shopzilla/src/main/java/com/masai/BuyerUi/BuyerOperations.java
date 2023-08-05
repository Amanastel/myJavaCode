package com.masai.BuyerUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.masai.CSS.CSS;
import com.masai.CommanCode.Common;
import com.masai.Dao.BuyerDao;
import com.masai.Dao.BuyerDaoImpl;
import com.masai.Dto.*;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuyerOperations extends JFrame {

	private JPanel contentPane;
	static Buyer buyer;
	static BuyerOperations frame;
	static BuyerDao buyerDao = new BuyerDaoImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new BuyerOperations(buyer);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuyerOperations(Buyer buyer) {
		this.buyer = buyer;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 647);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("buyer");
		lblNewLabel.setText("Hello " + buyer.getFirstName() + " " + buyer.getLastName());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblNewLabel.setBounds(163, 10, 662, 59);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Update Details");
		CSS.setMouseCursorNormal2(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				BuyerUpdate.main(null);

			}
		});
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(30, 109, 255, 51);
		contentPane.add(btnNewButton);

		JButton btnViewProductsFor = new JButton("View Products");
		CSS.setMouseCursorNormal2(btnViewProductsFor);
		btnViewProductsFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				BuyerProducts.main(null);

			}
		});
		btnViewProductsFor.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnViewProductsFor.setBackground(Color.WHITE);
		btnViewProductsFor.setBounds(30, 294, 255, 51);
		contentPane.add(btnViewProductsFor);

		JButton btnViewTransactions = new JButton("View Transactions");
		CSS.setMouseCursorNormal2(btnViewTransactions);
		btnViewTransactions.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				BuyerTransactions.main(null);

			}
		});
		btnViewTransactions.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnViewTransactions.setBackground(Color.WHITE);
		btnViewTransactions.setBounds(30, 195, 255, 59);
		contentPane.add(btnViewTransactions);

		JButton btnNewButton_1 = new JButton("Logout");
		CSS.setMouseCursorLogout(btnNewButton_1);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				BuyerMain.main(null);

			}
		});
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnNewButton_1.setBounds(773, 528, 158, 54);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(295, 60, 672, 471);
		contentPane.add(lblNewLabel_1);

		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/BuyerMain/buyeroperations.png"));
		Image iPage1 = icon1.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH);
		icon1 = new ImageIcon(iPage1);
		lblNewLabel_1.setIcon(icon1);

		JLabel lblNewLabel_2 = new JLabel("Available Balance : ");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		lblNewLabel_2.setBounds(30, 541, 232, 59);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel();
		buyer.setBalance(Common.getUptoTwoDecimal(buyer.getBalance()));
		lblNewLabel_3.setText(buyer.getBalance() + "");
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(283, 552, 158, 37);
		contentPane.add(lblNewLabel_3);

		JButton btnAddBalance = new JButton("Add Balance");
		CSS.setMouseCursorNormal2(btnAddBalance);
		btnAddBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double balance = Double.parseDouble(lblNewLabel_3.getText());
				String username = buyer.getBuyerUserName();

				frame.setVisible(false);
				BuyerAddBalance.balance = balance;
				BuyerAddBalance.username = username;
				BuyerAddBalance.main(null);

			}
		});
		btnAddBalance.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnAddBalance.setBackground(Color.WHITE);
		btnAddBalance.setBounds(30, 468, 255, 51);
		contentPane.add(btnAddBalance);

		JButton btnDeleteAcount = new JButton("Delete Acount");
		CSS.setMouseCursorDelete(btnDeleteAcount);
		btnDeleteAcount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				BuyerDelete.name = buyer.getFirstName() + " " + buyer.getLastName();
				BuyerDelete.username = buyer.getBuyerUserName();
				BuyerDelete.password = buyer.getPassword();
				BuyerDelete.main(null);
			}
		});
		btnDeleteAcount.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnDeleteAcount.setBackground(Color.WHITE);
		btnDeleteAcount.setBounds(535, 528, 221, 51);
		contentPane.add(btnDeleteAcount);

		JButton btnNewButton_2 = new JButton("View Returns");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				BuyerReturnProductsTable.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(30, 383, 255, 51);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_3_1 = new JLabel();
		lblNewLabel_3_1.setText("₹");
		lblNewLabel_3_1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblNewLabel_3_1.setBounds(262, 552, 33, 37);
		contentPane.add(lblNewLabel_3_1);

	}
}
