package dz6.by.htp.entity;

public class Category {
private String title;//�������� ���������
private String season;//� ������ ������ ���������
private String oldKategory; //����������� �� ��������

public Category(String title, String season, String old){
this.title=title;
this.season=season;
this.oldKategory=old;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getSeason() {
	return season;
}

public void setSeason(String season) {
	this.season = season;
}

public String getOldKategory() {
	return oldKategory;
}

public void setOldKategory(String oldKategory) {
	this.oldKategory = oldKategory;
}







}
