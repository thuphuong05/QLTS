package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ThiSinh implements Serializable {
	private int maThiSinh;
	private String tenThiSinh;
	public Tinh queQuan;
	private Date ngaySinh;
	private boolean gioiTinh;
	private float diemListening,diemSpeaking,diemReading,diemWriting;
	
	
	public ThiSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diemListening,
			float diemSpeaking, float diemReading, float diemWriting) {
		this.maThiSinh = maThiSinh;
		this.tenThiSinh = tenThiSinh;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemListening = diemListening;
		this.diemSpeaking = diemSpeaking;
		this.diemReading = diemReading;
		this.diemWriting = diemWriting;
	}

	public ThiSinh() {
		
	}

	public int getMaThiSinh() {
		return maThiSinh;
	}


	public void setMaThiSinh(int maThiSinh) {
		this.maThiSinh = maThiSinh;
	}


	public String getTenThiSinh() {
		return tenThiSinh;
	}


	public void setTenThiSinh(String tenThiSinh) {
		this.tenThiSinh = tenThiSinh;
	}


	public Tinh getQueQuan() {
		return queQuan;
	}


	public void setQueQuan(Tinh queQuan) {
		this.queQuan = queQuan;
	}


	public Date getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public boolean isGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public float getDiemListening() {
		return diemListening;
	}


	public void setDiemListening(float diemListening) {
		this.diemListening = diemListening;
	}


	public float getDiemSpeaking() {
		return diemSpeaking;
	}


	public void setDiemSpeaking(float diemSpeaking) {
		this.diemSpeaking = diemSpeaking;
	}


	public float getDiemReading() {
		return diemReading;
	}


	public void setDiemReading(float diemReading) {
		this.diemReading = diemReading;
	}


	public float getDiemWriting() {
		return diemWriting;
	}


	public void setDiemWriting(float diemWriting) {
		this.diemWriting = diemWriting;
	}


	@Override
	public String toString() {
		return "ThiSing [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh="
				+ ngaySinh + ", gioiTinh=" + gioiTinh + ", diemListening=" + diemListening + ", diemSpeaking="
				+ diemSpeaking + ", diemReading=" + diemReading + ", diemWriting=" + diemWriting + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(diemListening, diemReading, diemSpeaking, diemWriting, gioiTinh, maThiSinh, ngaySinh,
				queQuan, tenThiSinh);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThiSinh other = (ThiSinh) obj;
		return Float.floatToIntBits(diemListening) == Float.floatToIntBits(other.diemListening)
				&& Float.floatToIntBits(diemReading) == Float.floatToIntBits(other.diemReading)
				&& Float.floatToIntBits(diemSpeaking) == Float.floatToIntBits(other.diemSpeaking)
				&& Float.floatToIntBits(diemWriting) == Float.floatToIntBits(other.diemWriting)
				&& gioiTinh == other.gioiTinh && maThiSinh == other.maThiSinh
				&& Objects.equals(ngaySinh, other.ngaySinh) && Objects.equals(queQuan, other.queQuan)
				&& Objects.equals(tenThiSinh, other.tenThiSinh);
	} 

	
	
}
