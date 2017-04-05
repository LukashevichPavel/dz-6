package dz6.by.htp.entity;

public abstract class Equipment {
	
	private String category;
	private String title;
	private Acsessories acsessories[];
	private double lenght;
	private boolean isAvialible;
	private double rentPrice;
	private double lostPrice;
	private String fio;
	private String passport;
	private int time;
	private final String []catList = {"Bike","Skis","SnowBoard"};
	public int ind=0;

public Equipment(){};

public Equipment(String cat,String title,Acsessories[]acsessories,boolean isAvlble, double rentPrice, double lostPrice){
	
	this.category = cat;
	this.title = title;
	this.acsessories = acsessories;
	this.isAvialible = isAvlble;
	this.rentPrice = rentPrice;
	this.lostPrice = lostPrice;
}

public void print(){//Vivodit 1 ed. equipment
	System.out.println(this.toString());	
}

public Equipment getRandom(){
	int random=(int)Math.random()*3;
	Equipment temp1= new Bike();
	if (random==1){Equipment temp = new Bike();}
	if (random==2){Equipment temp = new Skis();}
	if (random==3){Equipment temp = new SnowBoard();}
	return temp1;
}




public double getRentPrice() {return rentPrice;}
public void setRentPrice(double rentPrice) {this.rentPrice = rentPrice;}
public double getLostPrice() {return lostPrice;}
public void setLostPrice(double lostPrice) {this.lostPrice = lostPrice;}
public String getFio() {return fio;}
public void setFio(String fio) {this.fio = fio;}
public String getPassport() {return passport;}
public void setPassport(String passport) {this.passport = passport;}
public int getTime() {return time;}
public void setTime(int time) {this.time = time;}
public String getCategory() {return category;}
public void setCategory(String category) {this.category = category;}
public String getTitle() {return title;}
public void setTitle(String title) {this.title = title;}
public Acsessories[] getAcsessories() {return acsessories;}
public void setAcsessories(Acsessories[] acsessories) {this.acsessories = acsessories;}
public boolean isAvialible() {return isAvialible;}
public void setAvialible(boolean isAvialible) {this.isAvialible = isAvialible;}
public double getLenght() {return lenght;}
public void setLenght(double lenght) {this.lenght = lenght;}

@Override
public String toString() {
	String finalS;
	finalS ="[Equipment][cat]" + category + ", [name]" + title;
	if (category.equals("Skis")){
		finalS=finalS+" [length] "+lenght+", [na sklade]" + isAvialible + ", [rentPrice]" + rentPrice
				+ ", [lostPrice]" + lostPrice + "]";}
	
	else {finalS=finalS+", [na sklade]" + isAvialible + ", [rentPrice]" + rentPrice
			+ ", [lostPrice]" + lostPrice + "]";}
	return finalS;
}







}
