package view;

import java.awt.EventQueue;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.DangNhap_Controller;
import controller.QLTS_Controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

public class Dang_nhap extends JFrame {

	private static final long serialVersionUID = 1L;
	public QLTS_VIEW view;
	private JPanel contentPane;
	private JTextField textField_ten;
	private JPasswordField passwordField;
	private JPasswordField passwordField_nhaplai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dang_nhap frame = new Dang_nhap();
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
	public Dang_nhap() {
		setForeground(Color.BLACK);
		setFont(new Font("Tahoma", Font.BOLD, 16));
		setTitle("QUẢN LÝ ĐIỂM IELTS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 387);
		setLocationRelativeTo(null);
		
		URL url_icondangnhap = Dang_nhap.class.getResource("/icon_dangnhap.png");
		Image imgage = Toolkit.getDefaultToolkit().createImage(url_icondangnhap);
		this.setIconImage(imgage);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 194, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Action action = new DangNhap_Controller(this);

				
		JLabel JLabel_hinhnen = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/icon_school_256.png")).getImage();
		JLabel_hinhnen.setIcon(new ImageIcon(img));
		JLabel_hinhnen.setBounds(-13, 137, 240, 200);
		contentPane.add(JLabel_hinhnen);
		
		JLabel icon_student = new JLabel("");
		Image im = new ImageIcon(this.getClass().getResource("/icon_tudent_128.png")).getImage();
		icon_student.setIcon(new ImageIcon(im));
		icon_student.setBounds(48, 18, 149, 147);
		contentPane.add(icon_student);
		
		
		JLabel JLabel_quanly = new JLabel("Thông tin đăng nhập");
		JLabel_quanly.setForeground(Color.BLACK);
		JLabel_quanly.setFont(new Font("Tahoma", Font.BOLD, 20));
		JLabel_quanly.setBounds(264, 11, 210, 34);
		contentPane.add(JLabel_quanly);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(251, 43, 232, 2);
		contentPane.add(separator);
		
		JLabel JLabel_ten_dang_nhap = new JLabel("Tên đăng nhập");
		JLabel_ten_dang_nhap.setForeground(Color.BLACK);
		JLabel_ten_dang_nhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel_ten_dang_nhap.setBounds(237, 95, 97, 25);
		contentPane.add(JLabel_ten_dang_nhap);
		
		textField_ten = new JTextField();
		textField_ten.setBounds(347, 95, 130, 25);
		contentPane.add(textField_ten);
		textField_ten.setColumns(10);
		
		JLabel JLabel_mk = new JLabel("Mật khẩu");
		JLabel_mk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel_mk.setForeground(Color.BLACK);
		JLabel_mk.setBounds(237, 140, 103, 25);
		contentPane.add(JLabel_mk);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(347, 140, 130, 25);
		contentPane.add(passwordField);
		
		JCheckBox CheckBox_ghinho = new JCheckBox("Ghi nhớ");
		CheckBox_ghinho.setBackground(new Color(189, 115, 47));
		CheckBox_ghinho.setForeground(Color.BLACK);
		CheckBox_ghinho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CheckBox_ghinho.setBounds(247, 229, 97, 25);
		contentPane.add(CheckBox_ghinho);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(237, 272, 264, 2);
		contentPane.add(separator_1);
		
		JButton btn_dangnhap = new JButton("Đăng nhập");
		
		btn_dangnhap.addActionListener(action);
		btn_dangnhap.setBackground(new Color(189, 115, 47));
		btn_dangnhap.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_dangnhap.setForeground(Color.BLACK);
		btn_dangnhap.setBounds(247, 285, 116, 37);
		contentPane.add(btn_dangnhap);
		
		JButton btn_huybo = new JButton("Hủy bỏ");
		
		btn_huybo.addActionListener(action);
		btn_huybo.setForeground(Color.BLACK);
		btn_huybo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_huybo.setBackground(new Color(189, 115, 47));
		btn_huybo.setBounds(375, 285, 116, 37);
		contentPane.add(btn_huybo);
		
		JLabel JLabel_nhaplaimk = new JLabel("Nhập lại mật khẩu ");
		JLabel_nhaplaimk.setForeground(Color.BLACK);
		JLabel_nhaplaimk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel_nhaplaimk.setBounds(235, 185, 116, 25);
		contentPane.add(JLabel_nhaplaimk);
		
		passwordField_nhaplai = new JPasswordField();
		passwordField_nhaplai.setBounds(347, 185, 130, 25);
		contentPane.add(passwordField_nhaplai);
		
		JLabel icon_tendn = new JLabel("");
		icon_tendn.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Dang_nhap.class.getResource("/icon_tendangnhap.png"))));
		icon_tendn.setBounds(480, 95, 26, 25);
		contentPane.add(icon_tendn);
		
		JLabel icon_mk = new JLabel("");
		icon_mk.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Dang_nhap.class.getResource("/icon_mk.png"))));
		icon_mk.setBounds(480, 140, 21, 25);
		contentPane.add(icon_mk);
		
		JLabel icon_nhaplai_mk = new JLabel("");
		icon_nhaplai_mk.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Dang_nhap.class.getResource("/icon_mk.png"))));
		icon_nhaplai_mk.setBounds(480, 185, 21, 25);
		contentPane.add(icon_nhaplai_mk);
		
		
		this.setVisible(true);
	}
	
	public void thoatKhoiChuongTrinh() {
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương trình?","Exit",JOptionPane.YES_NO_OPTION);
		if(luaChon==JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		
	}

	public void dangNhapChuongTrinh() {
		StringBuilder sb = new StringBuilder();
		String mk = new String(passwordField.getPassword());
		String nhaplai = new String(passwordField_nhaplai.getPassword());
		
		if((textField_ten.getText().equals(""))&&(mk.equals(""))) {
			JOptionPane.showConfirmDialog(null, 
	                "Tên đăng nhập và mật khẩu không được để trống", "", JOptionPane.DEFAULT_OPTION);
		}else if(textField_ten.getText().equals("")) {
			JOptionPane.showConfirmDialog(null, 
	                "Tên đăng nhập không được để trống", "", JOptionPane.DEFAULT_OPTION);
		}else if(mk.equals("")) {
			JOptionPane.showConfirmDialog(null, 
	                "Mật khẩu không được để trống", "", JOptionPane.DEFAULT_OPTION);
		}else if(!passwordField.equals("") && !mk.equals(nhaplai)) {
			JOptionPane.showConfirmDialog(null, 
	                "Nhập lại mật khẩu không đúng", "", JOptionPane.DEFAULT_OPTION);
		}else if((textField_ten.getText().equals("tran thu phuong"))&&(mk.equals("12345"))) {
			JOptionPane.showConfirmDialog(null, 
	                "Đăng nhập thành công", "", JOptionPane.DEFAULT_OPTION);
			QLTS_VIEW frame = new QLTS_VIEW();
			frame.setVisible(true);
		}else if((!textField_ten.getText().equals("tran thu phuong"))||(!mk.equals("12345"))) {
			JOptionPane.showConfirmDialog(null, 
	                "Tên đăng nhập hoặc mật khẩu không đúng", "", JOptionPane.DEFAULT_OPTION);
		}
			
		if(sb.length()>0) {
			JOptionPane.showConfirmDialog(this,sb.toString());
			return;
		}
	}
}
