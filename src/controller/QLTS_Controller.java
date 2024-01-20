package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.Dang_nhap;
import view.QLTS_VIEW;

public class QLTS_Controller implements Action{
	public QLTS_VIEW view;
	
	
	public QLTS_Controller(QLTS_VIEW view) {
		this.view = view;
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		//JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+cm);
		if(cm.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		}else if(cm.equals("Lưu")) {
			try {
				this.view.thucHienThemThiSinh();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(cm.equals("Sửa")) {
			this.view.hienThiThongTinThiSinhDaChon();
			
		}else if(cm.equals("Xóa")) {
			this.view.thucHienXoa();
			
		}else if(cm.equals("Tìm kiếm")) {
			this.view.thucHienTimKiem();
			
		}else if(cm.equals("Hủy tìm ")) {
			this.view.thucHienTaiLaiDuLieu();
			
		}else if(cm.equals("Exit")) {
			this.view.thoatKhoiChuongTrinh();
			
		}else if(cm.equals("Save")) {
			this.view.thucHienSaveFile();
			
		}else if(cm.equals("Open")) {
			this.view.thucHienOpenFile();
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


	public void showQuanLy() {
		view.setVisible(true);
		
	}

}
