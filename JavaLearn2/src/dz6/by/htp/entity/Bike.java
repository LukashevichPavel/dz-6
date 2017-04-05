package dz6.by.htp.entity;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Bike extends Equipment{
	private final String []catListBike = {"Stels","Fuji","Stark","LTD","Aist"};	
	private final String []acsListBike = {"Velo Helmet","Spidometr","Light 2.0","Light 5.0"};
	
public Bike(){
	
}
	
	public Bike(String cat,String title,Acsessories[]acs,boolean isAvl,double rentPrice, double lostPrice){
	
	super.setCategory(cat);
	super.setTitle(title);
	super.setAcsessories(acs);
	super.setAvialible(isAvl);
	super.setRentPrice(rentPrice);
	super.setLostPrice(lostPrice);
	}
	
	public Bike random(){
		String tempName = catListBike[(int)(Math.random()*catListBike.length)]; //Random name Equipment
		Acsessories tempAcs[] = new Acsessories[(int)Math.random()*10];
		for (int i=0;i<tempAcs.length; i++){
			tempAcs[i]=new Acsessories("Bike", tempName, Math.random()*10, 10+Math.random()*25, true); 
				}
		double tempRentPrice = new BigDecimal(15+Math.random()*25).setScale(2, RoundingMode.UP).doubleValue();
		double tempLostPrice=new BigDecimal(50+Math.random()*100).setScale(2, RoundingMode.UP).doubleValue();
		Bike tempEquipment = new Bike("Bike",tempName,tempAcs,true,tempRentPrice , tempLostPrice);
		return tempEquipment;
	}
	
	
	
}
