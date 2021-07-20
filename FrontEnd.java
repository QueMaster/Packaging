import za.ac.tut.cashier.Cashier;
import za.ac.tut.client.Client;
import java.util.ArrayList;
import javax.swing.JOptionPane; 
public class FrontEnd
{
	public static void main(String[]args)
	{
		Cashier cashier = new Cashier();
		ArrayList<Client> clients = new ArrayList<Client>();
        //Prompt Cashier details

        String strName, strSurname, strID;
		//Accept cashier details
		strName = JOptionPane.showInputDialog(null, "Please enter your name:");
		strSurname = JOptionPane.showInputDialog(null, "Please enter your surname:");
		strID = JOptionPane.showInputDialog(null, "Please enter your ID:");
		
        //Set values
		cashier.setName(strName);
		cashier.setSurname(strSurname);
		cashier.setId(Integer.parseInt(strID));
		//Declare 
		String strAge;
		for(int i=0; i < 3;++i)
		{
		     //Prompt client details
			strName = JOptionPane.showInputDialog(null, "Please enter client name:");
			strSurname = JOptionPane.showInputDialog(null, "Please enter client surname:");
			strAge = JOptionPane.showInputDialog(null, "Please enter  client age:");
			//Store values on the arraylist
			Client client = new Client();
			client.setName(strName);
			client.setSurname(strSurname);
			client.setAge(Integer.parseInt(strAge));
            //store each client to list
			clients.add(client);			
			
		}
		
		//Use advanced loop to print all client above 30
		
		for(Client client:clients) 
		{
			if (client.getAge() >= 30)
			{
				System.out.println(client.getName() + " " +client.getSurname();
			}
		}	
	
	}
}