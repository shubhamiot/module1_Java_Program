package MainUI;
import java.util.Scanner;
import beans.beans;
import service.Serviceclass;
public class Main {
	static Scanner sc = new Scanner(System.in);
	Serviceclass ser = new Serviceclass();
	private static Scanner sc2;
	
	public static void main(String[] args) {
		
		
		Main main = new Main();
		while(true)
		{
		System.out.println("********************Library DATABASE********************");
		System.out.println("1 . add Into Library");
		System.out.println("2. delete data");
		System.out.println("3. update data");
		sc2 = new Scanner(System.in);
		int choice = sc2.nextInt();
        switch(choice)
        {
        case 1:
        	main.addData();
        	break;
        case 2:
        	main.deleteData();
        	break;
        
        case 3:
        	main.display();
        	break;
        }
		}

}
void addData()
{
	System.out.println("ENTER EMPLOYEE ID:");
	int authorId = sc.nextInt();
	System.out.println("enter employee First NAME :");
	String firstName = sc.next();
	System.out.println("ENTER EMPLOYEE Middle Name : ");
	String middleName = sc.next();
	
	System.out.println("ENTER EMPLOYEE Last Name : ");
	String lastName = sc.next();
	System.out.println("ENTER EMPLOYEE Phone Number");
	int phoneNumber = sc.nextInt();
	ser.storeLibrary(new beans(authorId,firstName,middleName,lastName,phoneNumber));
}
void deleteData()
{
	System.out.print("enter Author Id to delete data");
	int authorId = sc.nextInt();
	ser.deleteData(authorId);
}
void display()
{
	ser.displayAccordingData();
}
}
