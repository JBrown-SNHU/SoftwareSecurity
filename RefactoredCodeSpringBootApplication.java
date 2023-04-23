package Proj2Refactorcom.refactored_code_springboot;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RefactoredCodeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefactoredCodeSpringBootApplication.class, args);
	}

}

@RestController
class ServerController{  
    
	@RequestMapping(method = RequestMethod.GET, path = "hash")
    
    public String myHash() { 
    	String data = "Joshua Leonard Brown";
    	
    	String checksum = createChecksum(data);
       
        return "<p>data: "+ data + "<p>Hash Algorithm Used: SHA-256" 
        + "<p>Checksum Value: " + checksum;   
    }

private static String createChecksum(String data) {
	try { 
    	//Creating the MessageDigest object  
    
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
	

    	//Passing data to the created MessageDigest Object
    	md.update(data.getBytes());
    
    	//Compute the message digest
    	byte[] digest = md.digest(data.getBytes(StandardCharsets.UTF_8)); 
    	return bytesToHex(digest);
    }
    catch (NoSuchAlgorithmException e) {
    	e.printStackTrace();
    	return null;
    }
	
}

private static String bytesToHex(byte[] bytes) {
	StringBuilder result = new StringBuilder();
		for (byte b : bytes) {
			result.append(String.format("%02x", b));
		}
	return result.toString();
	}
}