//fisal ikhmayes
//Module seven
//12/10/22

public class Monkey extends RescueAnimal{

public Monkey(String n,String aT,String g,String a,String w,String aDate,String aCountry,String status,boolean res,String serCountry) {
super(n,aT,g,a,w,aDate,aCountry,status,res,serCountry);
}

public String toString() {
return(String.format("Name : " + getName() +"\nAcquisitionCountry : " + getAcquisitionCountry() 
+ "\nTrainingstatus : " + getTrainingstatus() + "\nReserved : " + isReserved()));
}


}
