package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.DangNhap_Controller;
import controller.QLTS_Controller;
import model.QLTS_MODEL;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

public class QLTS_VIEW extends JFrame {

	public JPanel contentPane;

	public QLTS_MODEL model;

	public JTextField textField_mathisinh_timkiem;

	public JTextField textField_ngaysinh;

	public JTextField textField_diemwriting;

	public JTextField textField_diemreading;

	public JTextField textField_diemspeaking;

	public JTextField textField_mathisinh;

	public JTextField textField_hoten;

	public JTextField textField_diemlistening;

	public JTable table;

	public JLabel jlabel_diemlistening;

	public JLabel jlabel_hoten;

	public JLabel jlabel_mathisinh;

	public JLabel jlabel_gioitinh;

	public JLabel jlabel_ngaysinh;

	public JLabel jlabel_diemspeaking;

	public JLabel jlabel_diemreading;

	public JLabel jlabel_diemwriting;

	public JRadioButton btn_nam;

	public JRadioButton btn_nu;

	public ButtonGroup btn_gioiTinh;

	public JLabel jlabel_quequan_timkiem;

	public JLabel jlabel_quequan;

	public JLabel jlabel_timkiem;

	public JLabel jlabel_mathisinh_1;

	public JButton btn_timkiem;

	public JButton btn_huytimkiem;

	public JComboBox comboBox_quequan;

	public JComboBox comboBox_quequan_timkiem;
	private JMenu menu_help;
	private JMenuItem menu_welcome;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLTS_VIEW frame = new QLTS_VIEW();
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
	public QLTS_VIEW() {
		setBackground(new Color(255, 255, 255));
		this.model = new QLTS_MODEL();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setTitle("QUẢN LÝ ĐIỂM THI IELTS");
		setBounds(100, 100, 1100, 660);
		
		//set icon
		URL url_iconquanly = QLTS_VIEW.class.getResource("icon_qunly_32.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_iconquanly);
		this.setIconImage(img);
		
		
		Action action = new QLTS_Controller(this);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(211, 153, 88));
		setJMenuBar(menuBar);
		
		JMenu menu_file = new JMenu("File");
		menu_file.setForeground(new Color(0, 0, 0));
		menu_file.addActionListener(action);
		menu_file.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(menu_file);
		
		JMenuItem menu_open = new JMenuItem("Open",KeyEvent.VK_O);
		menu_open.setForeground(new Color(0, 0, 0));
		menu_open.addActionListener(action);
		menu_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
		menu_open.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_open_24.png"))));
		menu_open.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menu_file.add(menu_open);
		
		JMenuItem menu_Save = new JMenuItem("Save",KeyEvent.VK_S);
		menu_Save.addActionListener(action);
		menu_Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
		menu_Save.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_save_24.png"))));
		menu_Save.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menu_file.add(menu_Save);
		
		JSeparator separator = new JSeparator();
		menu_file.add(separator);
		
		JMenuItem menu_exit = new JMenuItem("Exit",KeyEvent.VK_X);
		menu_exit.addActionListener(action);
		menu_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.ALT_DOWN_MASK));
		menu_exit.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_exit_24.png"))));
		menu_exit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menu_file.add(menu_exit);
		
		menu_help = new JMenu("Help");
		menu_help.setForeground(new Color(0, 0, 0));
		menu_help.addActionListener(action);
		menu_help.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(menu_help);
		
		menu_welcome = new JMenuItem("Welcome");
		menu_welcome.addActionListener(action);

		menu_welcome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menu_help.add(menu_welcome);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 194, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel jlabel_danhsachthisinh = new JLabel("Danh sách thí sinh");
		jlabel_danhsachthisinh.setForeground(Color.BLACK);
		jlabel_danhsachthisinh.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlabel_danhsachthisinh.setBounds(10, 0, 141, 24);
		contentPane.add(jlabel_danhsachthisinh);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 22, 1064, 2);
		contentPane.add(separator_1);
		
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setBackground(new Color(192, 192, 192));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Th\u00ED Sinh", "H\u1ECD T\u00EAn", "Qu\u00EA Qu\u00E1n", "Gi\u1EDBi T\u00EDnh", "Ng\u00E0y Sinh", "\u0110i\u1EC3m Listening", "\u0110i\u1EC3m Speaking", "\u0110i\u1EC3m Reading", "\u0110i\u1EC3m Writing"
			}
		));
		table.setRowHeight(18);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 30, 1064, 138);
		contentPane.add(scrollPane);
		
		JLabel jlabel_thongtinthisinh = new JLabel("Thông tin thí sinh");
		jlabel_thongtinthisinh.setForeground(Color.BLACK);
		jlabel_thongtinthisinh.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlabel_thongtinthisinh.setBounds(20, 190, 130, 30);
		contentPane.add(jlabel_thongtinthisinh);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.WHITE);
		separator_1_1.setBounds(10, 179, 1015, 2);
		contentPane.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBackground(Color.WHITE);
		separator_1_1_1.setBounds(10, 218, 1015, 2);
		contentPane.add(separator_1_1_1);
		
		jlabel_diemlistening = new JLabel("Điểm Listening");
		jlabel_diemlistening.setForeground(Color.BLACK);
		jlabel_diemlistening.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_diemlistening.setBounds(134, 432, 105, 30);
		contentPane.add(jlabel_diemlistening);
		
		jlabel_hoten = new JLabel("Họ tên");
		jlabel_hoten.setForeground(Color.BLACK);
		jlabel_hoten.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_hoten.setBounds(134, 270, 89, 30);
		contentPane.add(jlabel_hoten);
		
		jlabel_mathisinh = new JLabel("Mã thí sinh");
		jlabel_mathisinh.setForeground(Color.BLACK);
		jlabel_mathisinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_mathisinh.setBounds(134, 229, 89, 30);
		contentPane.add(jlabel_mathisinh);
		
		jlabel_gioitinh = new JLabel("Giới tính");
		jlabel_gioitinh.setForeground(Color.BLACK);
		jlabel_gioitinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_gioitinh.setBounds(134, 350, 89, 30);
		contentPane.add(jlabel_gioitinh);
		
		jlabel_ngaysinh = new JLabel("Ngày sinh");
		jlabel_ngaysinh.setForeground(Color.BLACK);
		jlabel_ngaysinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_ngaysinh.setBounds(134, 391, 89, 30);
		contentPane.add(jlabel_ngaysinh);
		
		textField_diemlistening = new JTextField();
		textField_diemlistening.setForeground(Color.RED);
		textField_diemlistening.setBackground(new Color(226, 226, 226));
		textField_diemlistening.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_diemlistening.setBounds(249, 433, 171, 30);
		contentPane.add(textField_diemlistening);
		textField_diemlistening.setColumns(10);
		
		textField_hoten = new JTextField();
		textField_hoten.setBackground(new Color(226, 226, 226));
		textField_hoten.setForeground(Color.RED);
		textField_hoten.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_hoten.setColumns(10);
		textField_hoten.setBounds(250, 270, 170, 30);
		contentPane.add(textField_hoten);
		
		textField_mathisinh = new JTextField();
		textField_mathisinh.setForeground(Color.RED);
		textField_mathisinh.setBackground(new Color(226, 226, 226));
		textField_mathisinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_mathisinh.setColumns(10);
		textField_mathisinh.setBounds(250, 229, 170, 30);
		contentPane.add(textField_mathisinh);
		
		textField_diemspeaking = new JTextField();
		textField_diemspeaking.setForeground(Color.RED);
		textField_diemspeaking.setBackground(new Color(226, 226, 226));
		textField_diemspeaking.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_diemspeaking.setColumns(10);
		textField_diemspeaking.setBounds(249, 472, 171, 30);
		contentPane.add(textField_diemspeaking);
		
		jlabel_diemspeaking = new JLabel("Điểm Speaking");
		jlabel_diemspeaking.setForeground(Color.BLACK);
		jlabel_diemspeaking.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_diemspeaking.setBounds(134, 471, 105, 30);
		contentPane.add(jlabel_diemspeaking);
		
		textField_diemreading = new JTextField();
		textField_diemreading.setForeground(Color.RED);
		textField_diemreading.setBackground(new Color(226, 226, 226));
		textField_diemreading.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_diemreading.setColumns(10);
		textField_diemreading.setBounds(249, 513, 170, 30);
		contentPane.add(textField_diemreading);
		
		jlabel_diemreading = new JLabel("Điểm Reading");
		jlabel_diemreading.setForeground(Color.BLACK);
		jlabel_diemreading.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_diemreading.setBounds(134, 512, 105, 30);
		contentPane.add(jlabel_diemreading);
		
		textField_diemwriting = new JTextField();
		textField_diemwriting.setForeground(Color.RED);
		textField_diemwriting.setBackground(new Color(226, 226, 226));
		textField_diemwriting.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_diemwriting.setColumns(10);
		textField_diemwriting.setBounds(250, 554, 170, 30);
		contentPane.add(textField_diemwriting);
		
		jlabel_diemwriting = new JLabel("Điểm Writing");
		jlabel_diemwriting.setForeground(Color.BLACK);
		jlabel_diemwriting.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_diemwriting.setBounds(134, 553, 99, 30);
		contentPane.add(jlabel_diemwriting);
		
		comboBox_quequan = new JComboBox();
		comboBox_quequan.setForeground(Color.RED);
		comboBox_quequan.setBackground(new Color(226, 226, 226));
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_quequan.addItem("");
		for(Tinh tinh : listTinh) {
			comboBox_quequan.addItem(tinh.getTenTinh());
		}
		comboBox_quequan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_quequan.setBounds(250, 310, 170, 30);
		contentPane.add(comboBox_quequan);
		
		jlabel_quequan = new JLabel("Quê quán");
		jlabel_quequan.setForeground(Color.BLACK);
		jlabel_quequan.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_quequan.setBounds(134, 311, 89, 30);
		contentPane.add(jlabel_quequan);
		
		btn_nam = new JRadioButton("Nam");
		btn_nam.setForeground(Color.RED);
		btn_nam.setBackground(new Color(226, 226, 226));
		btn_nam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_nam.setBounds(250, 352, 62, 23);
		contentPane.add(btn_nam);
		
		btn_nu = new JRadioButton("Nữ");
		btn_nu.setForeground(Color.RED);
		btn_nu.setBackground(new Color(226, 226, 226));
		btn_nu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_nu.setBounds(326, 354, 62, 23);
		contentPane.add(btn_nu);
		
		btn_gioiTinh = new ButtonGroup();
		btn_gioiTinh.add(btn_nam);
		btn_gioiTinh.add(btn_nu);
		
		
		textField_ngaysinh = new JTextField();
		textField_ngaysinh.setForeground(Color.RED);
		textField_ngaysinh.setBackground(new Color(226, 226, 226));
		textField_ngaysinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_ngaysinh.setColumns(10);
		textField_ngaysinh.setBounds(250, 391, 170, 30);
		contentPane.add(textField_ngaysinh);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(10, 426, 1015, 0);
		contentPane.add(separator_1_1_1_1);
		
		jlabel_quequan_timkiem = new JLabel("Quê quán");
		jlabel_quequan_timkiem.setForeground(Color.BLACK);
		jlabel_quequan_timkiem.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_quequan_timkiem.setBounds(532, 391, 89, 30);
		contentPane.add(jlabel_quequan_timkiem);
		
		comboBox_quequan_timkiem = new JComboBox();
		comboBox_quequan_timkiem.setForeground(new Color(118, 52, 50));
		comboBox_quequan_timkiem.setBackground(new Color(226, 226, 226));
		comboBox_quequan_timkiem.addItem("");
		for(Tinh tinh : listTinh) {
			comboBox_quequan_timkiem.addItem(tinh.getTenTinh());
		}
		comboBox_quequan_timkiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_quequan_timkiem.setBounds(632, 391, 170, 30);
		contentPane.add(comboBox_quequan_timkiem);
		
		jlabel_timkiem = new JLabel("Tìm kiếm");
		jlabel_timkiem.setForeground(Color.BLACK);
		jlabel_timkiem.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlabel_timkiem.setBounds(532, 251, 105, 30);
		contentPane.add(jlabel_timkiem);
		
		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.setBounds(531, 279, 62, 2);
		contentPane.add(separator_1_1_1_1_1);
		
		textField_mathisinh_timkiem = new JTextField();
		textField_mathisinh_timkiem.setForeground(new Color(118, 52, 50));
		textField_mathisinh_timkiem.setBackground(new Color(226, 226, 226));
		textField_mathisinh_timkiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_mathisinh_timkiem.setColumns(10);
		textField_mathisinh_timkiem.setBounds(632, 325, 170, 30);
		contentPane.add(textField_mathisinh_timkiem);
		
		jlabel_mathisinh_1 = new JLabel("Mã thí sinh");
		jlabel_mathisinh_1.setForeground(Color.BLACK);
		jlabel_mathisinh_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlabel_mathisinh_1.setBounds(532, 324, 89, 30);
		contentPane.add(jlabel_mathisinh_1);
		
		btn_timkiem = new JButton("Tìm kiếm");
		btn_timkiem.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_tim_24.png"))));

		btn_timkiem.setBackground(new Color(255, 255, 255));
		btn_timkiem.addActionListener(action);
		btn_timkiem.setForeground(Color.RED);
		btn_timkiem.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_timkiem.setBounds(532, 503, 125, 39);
		contentPane.add(btn_timkiem);
		
		btn_huytimkiem = new JButton("Hủy tìm ");
		btn_huytimkiem.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_huytim_24.png"))));

		btn_huytimkiem.setBackground(new Color(255, 255, 255));
		btn_huytimkiem.addActionListener(action);
		btn_huytimkiem.setForeground(Color.RED);
		btn_huytimkiem.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_huytimkiem.setBounds(695, 504, 121, 39);
		contentPane.add(btn_huytimkiem);
		
		JButton btn_them = new JButton("Thêm");
		btn_them.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_them_24.png"))));
		btn_them.addActionListener(action);
		btn_them.setForeground(Color.BLACK);
		btn_them.setBackground(new Color(189, 115, 47));
		btn_them.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_them.setBounds(915, 244, 105, 45);
		contentPane.add(btn_them);
		
		JButton btn_chinhsua = new JButton("Sửa");
		btn_chinhsua.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_sua_24.png"))));
		btn_chinhsua.setForeground(Color.BLACK);
		btn_chinhsua.addActionListener(action);
		btn_chinhsua.setBackground(new Color(189, 115, 47));
		btn_chinhsua.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_chinhsua.setBounds(915, 417, 110, 45);
		contentPane.add(btn_chinhsua);
		
		JButton btn_luu = new JButton("Lưu");
		btn_luu.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_luu_24.png"))));
		btn_luu.setForeground(Color.BLACK);
		btn_luu.addActionListener(action);
		btn_luu.setBackground(new Color(189, 115, 47));
		btn_luu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_luu.setBounds(915, 335, 105, 45);
		contentPane.add(btn_luu);
		
		JButton btn_xoa = new JButton("Xóa");
		btn_xoa.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QLTS_VIEW.class.getResource("icon_xoa_24.png"))));
		btn_xoa.setForeground(Color.BLACK);
		btn_xoa.addActionListener(action);
		btn_xoa.setBackground(new Color(189, 115, 47));
		btn_xoa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_xoa.setBounds(920, 505, 105, 45);
		contentPane.add(btn_xoa);
		
		setVisible(false);
		
	}

	public void xoaForm() {
		textField_mathisinh.setText("");
		textField_hoten.setText("");
		textField_mathisinh.setText("");
		textField_ngaysinh.setText("");
		textField_diemlistening.setText("");
		textField_diemspeaking.setText("");
		textField_diemreading.setText("");
		textField_diemwriting.setText("");
		comboBox_quequan.setSelectedIndex(-1);
		btn_gioiTinh.clearSelection();	
	}
	
	
	public void themThiSinhVaoTable (ThiSinh ts) {
		 DefaultTableModel model_table =(DefaultTableModel) table.getModel();
		 model_table.addRow(new Object[] { 
					ts.getMaThiSinh() + "", 
					ts.getTenThiSinh(),
					ts.getQueQuan().getTenTinh(),
					ts.getNgaySinh().getMonth() +1 + "/" + (ts.getNgaySinh().getDate()  + "/"+ (ts.getNgaySinh().getYear() + 1900)),
					(ts.isGioiTinh() ? "Nam" : "Nữ"),
					ts.getDiemListening() + "", 
					ts.getDiemSpeaking() + "",
					ts.getDiemReading() + "",
					ts.getDiemWriting() + "", });	
	}
	

	public void themHoacChinhSuaThiSinh(ThiSinh ts) {
	    DefaultTableModel model_table =(DefaultTableModel) table.getModel();
		if(!this.model.kiemTraTonTai(ts)) {
		    this.model.insert(ts);
		    this.themThiSinhVaoTable(ts);
		}else {
			this.model.update(ts);
			int soLuongDong = model_table.getRowCount();
			for(int i=0;i< soLuongDong;i++) {
				String id = model_table.getValueAt(i, 0)+"";
				if(id.equals(ts.getMaThiSinh()+"")) {
					model_table.setValueAt(ts.getMaThiSinh()+"", i,0);
					model_table.setValueAt(ts.getTenThiSinh()+"", i,1);
					model_table.setValueAt(ts.getQueQuan().getTenTinh()+"", i,2);
					model_table.setValueAt(ts.getNgaySinh().getMonth() +1 + "/" + (ts.getNgaySinh().getDate()  + "/"+ (ts.getNgaySinh().getYear() + 1900))+"", i,3);
					model_table.setValueAt((ts.isGioiTinh()? "Nam" : "Nữ"),i,4);
					model_table.setValueAt(ts.getDiemListening()+"", i,5);
					model_table.setValueAt(ts.getDiemSpeaking()+"", i,6);
					model_table.setValueAt(ts.getDiemReading()+"", i,7);
					model_table.setValueAt(ts.getDiemWriting()+"", i,8);
				}
			}
		}
	}
	
	
	public ThiSinh getThiSinhDangChon() {
		DefaultTableModel model_table =(DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		int maThiSinh =Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
		String tenThiSinh = model_table.getValueAt(i_row, 1)+"";
		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
		String s_ngaySinh = model_table.getValueAt(i_row, 3)+"";
		Date ngaySinh = new Date (s_ngaySinh);
		String textGioiTinh = model_table.getValueAt(i_row, 4)+"";
		boolean gioiTinh = textGioiTinh.equals("Nam");
		
		float diemListening = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		float diemSpeaking = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		float diemReading = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		float diemWriting = Float.valueOf(model_table.getValueAt(i_row, 8)+"");
		
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemListening, diemSpeaking, diemReading, diemWriting);
		return ts;
	}

	
	public void hienThiThongTinThiSinhDaChon() {
		ThiSinh ts = getThiSinhDangChon();
		
		this.textField_mathisinh.setText(ts.getMaThiSinh()+"");
		this.textField_hoten.setText(ts.getTenThiSinh()+"");
		this.comboBox_quequan.setSelectedItem(ts.getQueQuan().getTenTinh());
		String s_ngaySinh = ts.getNgaySinh().getMonth() +1 + "/" + (ts.getNgaySinh().getDate()  + "/"+ (ts.getNgaySinh().getYear() + 1900));
		this.textField_ngaysinh.setText(s_ngaySinh+"");
		if(ts.isGioiTinh()) {
			btn_nam.setSelected(true);
		}else {
			btn_nu.setSelected(true);
		}
		this.textField_diemlistening.setText(ts.getDiemListening()+"");
		this.textField_diemspeaking.setText(ts.getDiemSpeaking()+"");
		this.textField_diemreading.setText(ts.getDiemReading()+"");
		this.textField_diemwriting.setText(ts.getDiemWriting()+"");
		
	}

	
	public void thucHienXoa() {
		DefaultTableModel model_table =(DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?","",JOptionPane.YES_NO_OPTION);
		if(luaChon==JOptionPane.YES_OPTION) {
			ThiSinh ts = getThiSinhDangChon();
			this.model.delete(ts);
			model_table.removeRow(i_row);
		}
	}

	
	public void thucHienThemThiSinh() {
		// Get du lieu
		int maThiSinh =Integer.valueOf(this.textField_mathisinh.getText());
		String tenThiSinh = this.textField_hoten.getText();
		int queQuan = this.comboBox_quequan.getSelectedIndex()-1;
		Tinh tinh = Tinh.getTinhById(queQuan);
		Date ngaySinh = new Date (this.textField_ngaysinh.getText());
		boolean gioiTinh = true;
		if (this.btn_nam.isSelected()) {
			gioiTinh = true;
		} else if (this.btn_nu.isSelected()) {
			gioiTinh = false;
		}
		float diemListening = Float.valueOf(this.textField_diemlistening.getText());
		float diemSpeaking = Float.valueOf(this.textField_diemspeaking.getText());
		float diemReading = Float.valueOf(this.textField_diemreading.getText());
		float diemWriting = Float.valueOf(this.textField_diemwriting.getText());
		
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemListening, diemSpeaking, diemReading, diemWriting);
		this.themHoacChinhSuaThiSinh(ts);	
	}

	
	public void thucHienTimKiem() {
		this.thucHienTaiLaiDuLieu();
		
		int queQuan = this.comboBox_quequan_timkiem.getSelectedIndex()-1;
		String maThiSinhTimKiem = this.textField_mathisinh_timkiem.getText();
		DefaultTableModel model_table =(DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();
		
		Set<Integer> idCuaThiSinhCanXoa = new TreeSet<Integer>();
		if(queQuan >= 0) {
			Tinh tinhDaChon = Tinh.getTinhById(queQuan);
		    for(int i=0;i< soLuongDong;i++) {
			    String tenTinh = model_table.getValueAt(i, 2)+"";
			    String id = model_table.getValueAt(i, 0)+"";
			    if(!tenTinh.equals(tinhDaChon.getTenTinh())) {
			    	idCuaThiSinhCanXoa.add(Integer.valueOf(id));
			    }
		    }
		}
		if(maThiSinhTimKiem.length()>0) {
			for(int i=0;i< soLuongDong;i++) {
			    String id = model_table.getValueAt(i, 0)+"";
			    if(!id.equals(maThiSinhTimKiem)) {
			    	idCuaThiSinhCanXoa.add(Integer.valueOf(id));
			    }
			}
		}
		for(Integer idCanXoa : idCuaThiSinhCanXoa) {
			System.out.println(idCanXoa);
			soLuongDong = model_table.getRowCount();
			for(int i=0;i< soLuongDong;i++) {
			    String idTrongTable = model_table.getValueAt(i, 0)+"";
			    System.out.println(idTrongTable);
			    if(idTrongTable.equals(idCanXoa.toString())) {
			    	try {
			    		model_table.removeRow(i);
			    	}catch (Exception e) {
			    		e.printStackTrace();
			    	}
			    	break;
			    }
			}
		}	
	}

	
	public void thucHienTaiLaiDuLieu() {
		while(true) {
			DefaultTableModel model_table =(DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if(soLuongDong == 0)
				break;
			else
				try {
				   model_table.removeRow(0);
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
		for(ThiSinh ts: this.model.getDsThiSinh()) {
			this.themThiSinhVaoTable(ts);
		}	
	}

	
	public void thoatKhoiChuongTrinh() {
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương trình?","",JOptionPane.YES_NO_OPTION);
		if(luaChon==JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		
	}

	
	public void saveFile (String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(ThiSinh ts : this.model.getDsThiSinh()) {
				oos.writeObject(ts);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void thucHienSaveFile() {
		if(this.model.getTenFile().length()>0) {
			saveFile(this.model.getTenFile());
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
		
	}
	
	
	public void openFile (File file) {
		ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ThiSinh ts = null;
			while((ts = (ThiSinh) ois.readObject()) != null) {
				ds.add(ts);
		    }
			ois.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.model.setDsThiSinh(ds);
	}

	
	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file);
			thucHienTaiLaiDuLieu();
		}	       
	}	
}

