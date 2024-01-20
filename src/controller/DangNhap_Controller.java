package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import view.Dang_nhap;

public class DangNhap_Controller implements Action{

	public Dang_nhap dangnhap;
	
	
	public DangNhap_Controller(Dang_nhap dangnhap) {
		this.dangnhap = dangnhap;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		
		if(cm.equals("Hủy bỏ")) {
			this.dangnhap.thoatKhoiChuongTrinh();			
		}else if(cm.equals("Đăng nhập")) {
			this.dangnhap.dangNhapChuongTrinh();
		}
		
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}


	public void showDangNhap() {
		dangnhap.setVisible(true);
		
	}
	

}
