package dz6.by.htp.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class RentStation {
	private Equipment[] base; //
	private ClientBase clientBase;  
	private RentUnit inRentBase;

public void start() throws IOException{
	base = new Equipment[15]; //Init base Equipment
	clientBase = new ClientBase(); //Init clienBase
	inRentBase = new RentUnit();
	
	String firstname,lastname, passport, adress, telNumber;
	firstname = "Ivanov";
	lastname = "Ivan";
	passport = "MP111111";
	adress = "Burdeynogo 1-15";
	telNumber = "3109876";
	Client cl1 = new Client(firstname, lastname, passport, adress, telNumber);
	clientBase.addClient(cl1);
	
	firstname = "Petrov";
	lastname = "Petr";
	passport = "MP222222";
	adress = "Burdeynogo 7-25";
	telNumber = "5109876";
	Client cl2 = new Client(firstname, lastname, passport, adress, telNumber);
	clientBase.addClient(cl2);
	
	firstname = "Cidorov";
	lastname = "Cidor";
	passport = "MP333333";
	adress = "Burdeynogo 10-50";
	telNumber = "8109877";
	Client cl3 = new Client(firstname, lastname, passport, adress, telNumber);
	clientBase.addClient(cl3);
	clientBase.printClientBase();
	
	getRandomBaseEquipment(); //
	
	printAllEquipment();
	takeToRent();
	inRentBase.printInRentBase();
}

public void getRandomBaseEquipment(){// metod kotoriy sozdaet sluchaynoe kolv0 equipment i dobavl v bazu  
	Bike tempBike = new Bike();
	Skis tempSkis = new Skis();
	SnowBoard tempSnow = new SnowBoard();
	tempBike=tempBike.random();
	int random1=(int)(3+Math.random()*10); //Create random count equipment and add them to base 
	for (int i=0; i<random1;i++){
	if (i<4){base[i]=tempBike.random();}
	else {
		if (i>6){base[i]=tempSnow.random();}
		else{base[i]=tempSkis.random();}
		}
	}		
}

public void newClient() throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Vvesti novogo clienta? (yes->new Client, no->Vibrat' iz bazi)");
	String option = reader.readLine();
	if (option.equals("yes")){
		System.out.print("Vvedite family: ");
		String firstname = reader.readLine();
		System.out.print("Vvedite imya: ");
		String lastname =  reader.readLine();
		System.out.print("Vvedite passport");
		String passport =  reader.readLine();
		System.out.print("Vvedite adress: ");
		String adress =  reader.readLine();
		System.out.print("Vvedite telNumber: ");
		String telNumber = reader.readLine();
		Client newClient = new Client(firstname, lastname, passport, adress, telNumber);
		if (checkClientForExist(newClient)){System.out.println("Suschestvuet");}
		else {clientBase.addClient(newClient);System.out.println("Sucsess client insert");}
	}
	else{
		clientBase.printClientBase();
		
	}
}


public void takeToRent() throws IOException{ //metod kot. pomechaet equipment kak vzyatiy v arendu
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Vvedite nomer equipment kot xotite vzyat v arendu");
	int numEquipment = Integer.parseInt(reader.readLine());
	if (numEquipment>getSizeBase()||(numEquipment==0)){System.out.println("Vsego v base "+getSizeBase()+" elementov");}
	else {
		if (base[numEquipment-1].isAvialible()){
		newClient();	
			
			
			
			
			
			inRentBase.add(base[numEquipment-1]); //Dobavlyaem equipment v bazu arendovanogo
			base[numEquipment-1].setAvialible(false);
			System.out.println("Vvee gut");	
		}
		else {System.out.println("Equipment naxoditsa v arende");}
	}
} 
public void removeFromRent(){} //metod kot. ydalyaet equipment iz bazi arendovanogo equiipment	
 
public void printAllEquipment(){//metod kot. vivodit vse equipment
	for (int i=0; i<base.length;i++){if (base[i]!=null) {System.out.print("id["+(i+1)+"]: ");base[i].print();}}
}

public void printInRent(){} //metod kot. vivodyt all equipment kotoriy naxoditsa v arende 
public void printAll(){} 



public boolean checkClientForExist(Client client){//metod kot. proveryaet est li client v base klientov 
	boolean exist=false;
	for (int i=0; i<clientBase.getSizeBase();i++){if (clientBase.getClient(i).getPassport().equals(client.getPassport())) exist=true;}
	
	
	
	
	return exist;
}



public int checkClienForRent(){//metod kot. proveryaet kolvo vzyatogo Equipment-a 
	int countRentEquipment=0;
	return countRentEquipment;
}

public int getSizeBase(){
	int sizeBase=0;
	for (int i=0; i<base.length; i++){if (base[i]!=null) sizeBase++;}
	return sizeBase;
}
		
	
}//final

