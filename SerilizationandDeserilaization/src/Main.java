import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//serilization
		
		Employee e= new Employee();
		e.setId(1);
	    e.setName("Codeing");
		FileOutputStream fileoutputstream= new FileOutputStream("C:\\Stream\\CodeDecodeFile.ser");
	    ObjectOutputStream objectoutputstream= new ObjectOutputStream(fileoutputstream);
	    objectoutputstream.writeObject(e);
	    objectoutputstream.close();
	    fileoutputstream.close();
	    
	   
	    //Deserlization
	    
	    	
	
	    FileInputStream fileIn = new FileInputStream("C:\\Stream\\CodeDecodeFile.ser");
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	     e = (Employee) in.readObject();
	    in.close();
	    fileIn.close();
	}
	

}
