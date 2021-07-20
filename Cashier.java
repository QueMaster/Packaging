package za.ac.tut.cashier;

public class Cashier
{
  private String name;
  private String surname;
  private int id;
// Default constructor 
public Cashier(){
}
//Overloaded constructor with different paarameter list
public Cashier(String name,String surname,int id)
{
  this.name = name;
  this.surname = surname;
  this.id = id;
}
 // setter and getter methods 
 public void setName(String name)
 {
  this.name = name;
 }
 public void setSurname(String surname)
 {
  this.surname = surname;
 }
 public void setId(int id)
 {
  this.id = id;
 }
  // getter methods
  public String getName()
  {
   return name;
  }
public String getSurname()
{
 return surname;
}
public int getId()
{
 return id;
}

}