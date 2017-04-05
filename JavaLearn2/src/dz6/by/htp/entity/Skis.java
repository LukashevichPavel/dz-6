package dz6.by.htp.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skis extends Equipment{
private final String []catListSkis = {"Fischer","Guru","RC4"};
private final String []acsListSkis = {"Skis Helmet","Skis Bag","Skis Mask", "Skis Skirt"};

public Skis(){
	
	}
	
public Skis(String cat,String title,double length, Acsessories[]acs,boolean isAvl,double rentPrice, double lostPrice){
	super.setCategory(cat);
	super.setTitle(title);
	super.setLenght(length);
	super.setAcsessories(acs);
	super.setAvialible(isAvl);
	super.setRentPrice(rentPrice);
	super.setLostPrice(lostPrice);
		}

	public Skis random(){
		String tempName = catListSkis[(int)(Math.random()*catListSkis.length)]; //Random name Equipment
		Acsessories tempAcs[] = new Acsessories[(int)Math.random()*10];
		for (int i=0;i<tempAcs.length; i++){
			tempAcs[i]=new Acsessories("Skis", tempName, Math.random()*10, 10+Math.random()*25, true); 
				}
		double tempRentPrice = new BigDecimal(15+Math.random()*25).setScale(2, RoundingMode.UP).doubleValue();
		double tempLostPrice=new BigDecimal(50+Math.random()*100).setScale(2, RoundingMode.UP).doubleValue();
		double tempLength= new BigDecimal(40+Math.random()*50).setScale(0, RoundingMode.UP).doubleValue();
		Skis tempEquipment = new Skis("Skis",tempName,tempLength,tempAcs,true,tempRentPrice , tempLostPrice);
		
		return tempEquipment;
	}
	
}
