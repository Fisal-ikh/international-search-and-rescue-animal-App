//fisal ikhmayes
//Module seven
//12/10/22

/** RescueAnimal class definition**/
public class RescueAnimal {
//instance variables
private String name;
private String animalType;
private String gender;
private String age;
private String weight;
private String acquisitionDate;
private String acquisitionCountry;
private String trainingstatus;
private boolean reserved;
private String inServiceCountry;
//constructor
	public RescueAnimal(String n,String aT,String g,String a,String w,String aDate,String aCountry,String status,boolean res,String serCountry) {
		name=n;
		animalType=aT;
		gender=g;
		age=a;
		weight=w;
		acquisitionDate=aDate;
		acquisitionCountry=aCountry;
		trainingstatus=status;
		reserved=res;
		inServiceCountry=serCountry;
		}
//getter and setter methods
public String getName() {
return name;
}

public String getAnimalType() {
return animalType;
}

public String getGender() {
return gender;
}

public String getAge() {
return age;
}

public String getWeight() {
return weight;
}

public String getAcquisitionDate() {
return acquisitionDate;
}

public String getAcquisitionCountry() {
return acquisitionCountry;
}

public String getTrainingstatus() {
return trainingstatus;
}

public boolean isReserved() {
return reserved;
}

public String getInServiceCountry() {
return inServiceCountry;
}

public void setName(String name) {
this.name = name;
}

public void setAnimalType(String animalType) {
this.animalType = animalType;
}

public void setGender(String gender) {
this.gender = gender;
}

public void setAge(String age) {
this.age = age;
}

public void setWeight(String weight) {
this.weight = weight;
}

public void setAcquisitionDate(String acquisitionDate) {
this.acquisitionDate = acquisitionDate;
}

public void setAcquisitionCountry(String acquisitionCountry) {
this.acquisitionCountry = acquisitionCountry;
}

public void setTrainingstatus(String trainingstatus) {
this.trainingstatus = trainingstatus;
}

public void setReserved(boolean reserved) {
this.reserved = reserved;
}

public void setInServiceCountry(String inServiceCountry) {
this.inServiceCountry = inServiceCountry;
}

}