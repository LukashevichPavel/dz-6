package dz6.by.htp.entity;

public class Client {
private String firstname;
private String lastname;
private String passport;
private String adress;
private String telNumber;

public Client(){
	
}
public Client(String firstname, String lastname, String passport, String adress, String telNumber){
	this.firstname=firstname;
	this.lastname=lastname;
	this.passport=passport;
	this.adress=adress;
	this.telNumber=telNumber;
}



public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPassport() {
	return passport;
}
public void setPassport(String passport) {
	this.passport = passport;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getTelNumber() {
	return telNumber;
}
public void setTelNumber(String telNumber) {
	this.telNumber = telNumber;
}
@Override
public String toString() {
	return "Client [firstname=" + firstname + ", lastname=" + lastname + ", passport=" + passport + ", adress=" + adress
			+ ", telNumber=" + telNumber + "]";
}




}
