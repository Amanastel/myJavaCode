package com.masai.SellerUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.masai.CSS.CSS;
import com.masai.CommanCode.Common;
import com.masai.Dao.BuyerDaoImpl;
import com.masai.Dao.SellerDao;
import com.masai.Dao.SellerDaoImpl;
import com.masai.Dto.*;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SellerUpdate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	static Seller seller;
	static SellerUpdate frame;
	SellerDao sellerDao = new SellerDaoImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new SellerUpdate();
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
	public SellerUpdate() {
		this.seller = SellerOperations.seller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 642);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Back");
		CSS.setMouseCursorBack(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				SellerOperations sellerOperations = new SellerOperations(sellerDao.loginSeller(
						SellerOperations.seller.getSellerUserName(), SellerOperations.seller.getPassword()));
				sellerOperations.main(null);

			}
		});
		btnNewButton.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		btnNewButton.setBounds(583, 543, 149, 47);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		textField.setBounds(212, 124, 303, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(seller.getFirstName());

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(212, 210, 303, 47);
		contentPane.add(textField_1);
		textField_1.setText(seller.getLastName());

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(212, 298, 303, 47);
		contentPane.add(textField_2);
		textField_2.setText(seller.getMobileNo());

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(212, 381, 303, 47);
		contentPane.add(textField_3);
		textField_3.setText(seller.getAddress());

		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel.setBounds(47, 125, 136, 47);
		contentPane.add(lblNewLabel);

		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblLastName.setBounds(47, 211, 136, 47);
		contentPane.add(lblLastName);

		JLabel lblMobileNumber = new JLabel("Mobile Number :");
		lblMobileNumber.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblMobileNumber.setBounds(47, 299, 167, 47);
		contentPane.add(lblMobileNumber);

		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblAddress.setBounds(47, 382, 136, 47);
		contentPane.add(lblAddress);

		JButton btnNewButton_1 = new JButton("Update");
		CSS.setMouseCursorLogin(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String fname = null;
				fname = textField.getText();
				System.out.println(fname);

				String lname = null;
				lname = textField_1.getText();

				String mobile = null;
				mobile = textField_2.getText();

				String address = null;
				address = textField_3.getText();

				if (fname.equals("") && lname.equals("") && mobile.equals("") && address.equals("")) {

					JOptionPane.showMessageDialog(null, "Not update any single field !");
					return;

				}

				fname = Common.nameFormat(fname);
				lname = Common.nameFormat(lname);

				if (!fname.equals("")) {
					seller.setFirstName(fname);
				}
				if (!lname.equals("")) {
					seller.setLastName(lname);
				}
				if (!mobile.equals("")) {
					seller.setMobileNo(mobile);
				}
				if (!address.equals("")) {
					seller.setAddress(address);
				}

				String ans = sellerDao.updateSellerDetails(seller);

				JOptionPane.showMessageDialog(null, ans);

				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);

				frame.setVisible(false);
				SellerOperations.main(null);

			}
		});
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		btnNewButton_1.setBounds(287, 480, 149, 57);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("Update Information");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 35));
		lblNewLabel_1.setBounds(234, 34, 340, 38);
		contentPane.add(lblNewLabel_1);
	}

}
