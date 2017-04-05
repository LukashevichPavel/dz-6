package dz6.by.htp.entity;

public class Acsessories extends Equipment {

public Acsessories(){
super();	
}


public Acsessories (String cat, String title, double rentPrice, double lostPrice, boolean avi){
	super.setCategory(cat);
	super.setTitle(title);
	super.setRentPrice(rentPrice);
	super.setLostPrice(lostPrice);
	super.setAvialible(avi); 
}



}





