
    import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.BufferedWriter;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class createAccount {
	public static void main(String[] args) {
	   
//		First Name
//		Last Name
//		Title
//		Age
//		UserName
//		AddressCity
//		AddressCountry
//		ThankYouForJoining
		
		Random rand = new Random();
		int randomInt = rand.nextInt(200);
				
	    Scanner getData = new Scanner(System.in);  
	    System.out.println("Please enter your first name");
		String firstName = getData.nextLine();  
	    System.out.println("Please enter your last name");
		String lastName = getData.nextLine();  
	    System.out.println("Please enter your title");
		String title = getData.nextLine();  
	    System.out.println("Please enter your age");
		String age = getData.nextLine();  
		System.out.println("Please enter your address");
		String address = getData.nextLine();  
		System.out.println("Please enter your country");
		String country = getData.nextLine();  

		String username = lastName + firstName + randomInt;
		
		
		//Outputs result
		
		System.out.println(
				
				 "//////////////////////////////" + System.lineSeparator()
				+ "Your Full Name Is " + title + " " +firstName + " " + lastName 
				+ System.lineSeparator() + "Your age is " + age
				+ System.lineSeparator() + "Your home address is " + address
				+ System.lineSeparator() + "And you live in " + country
				+ System.lineSeparator() + "//////////////////////////////" + System.lineSeparator()
				+ System.lineSeparator() + "Thank you for signing up! Your username is "
				+ username
				+ System.lineSeparator());
		
		
		
		//Create an array to store the data then store each type
		ArrayList<String> outputData = new ArrayList<String>();
		outputData.add(title + System.lineSeparator() + firstName + System.lineSeparator() + lastName + System.lineSeparator() + age + System.lineSeparator() + address + System.lineSeparator() + country + System.lineSeparator() + username );
		
		
		//Outputs result to file and checks for duplicate entries
		//Java use map datatype
		  try {
		         File file = new File("useraccounts.txt");
				if(! file.exists()) {
					file.createNewFile();
				}
				FileWriter myWriter = new FileWriter("useraccounts.txt", true);	
		        BufferedWriter bw = new BufferedWriter(myWriter);
				bw.append(outputData.toString());				
				bw.close();//replace dosnt work

				System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}




	}

}
