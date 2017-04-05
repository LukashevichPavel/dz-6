package dz6.by.htp.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SnowBoard extends Equipment{
	private final String []catListSnowBoard = {"Flow","Capita","Alaska"};
	private final String []acsListSnowBoard = {"SnowBoard Helmet","SnowBoard Bag", "SnowBoard skirt"};
	
	public SnowBoard(){

	}
	
	public SnowBoard(String cat,String title,int length){
		super.setCategory(cat);
		super.setTitle(title);
		super.setLenght(length);
		}
	
	public SnowBoard random(){
		String tempName = catListSnowBoard[(int)(Math.random()*catListSnowBoard.length)]; //Random name Equipment
		Acsessories tempAcs[] = new Acsessories[(int)Math.random()*10];
		for (int i=0;i<tempAcs.length; i++){
			tempAcs[i]=new Acsessories("SnowBoard", tempName, Math.random()*10, 10+Math.random()*25, true); 
				}
		double tempRentPrice = new BigDecimal(15+Math.random()*25).setScale(2, RoundingMode.UP).doubleValue();
		double tempLostPrice=new BigDecimal(50+Math.random()*100).setScale(2, RoundingMode.UP).doubleValue();
		int tempLength=40+(int)Math.random()*75;
		SnowBoard tempEquipment = new SnowBoard("SnowBoard",tempName,tempLength);
		super.ind++;
		return tempEquipment;
	}
	
	
	
	
}
