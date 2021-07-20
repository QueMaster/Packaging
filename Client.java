package za.ac.tut.client;

public class Client
{
  private String name;
  private String surname;
  private int age;
  
  //Default Constructor
  public Client(){
  }
  // overloaded constructor 
  public Client(String name,String surname,int age)
  {
    this.name = name;
	this.surname = surname;
	this.age = age;
  
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
   public void setAge(int age)
   {
    this.age = age;
   }
   
 // getters
   public String getName()
   {
    return name;
   }
   public String getSurname()
   {
    return surname;
   }
   public int getAge()
   {
    return age;
   }
 
}