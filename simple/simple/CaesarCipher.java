package simple;

public class CaesarCipher {
	
	//to encrypt data
	public  static void dataEncryption(byte input[],int caesarShiftNumber, int offset) {
		
		
		byte[] temp = new byte[input.length];
		
		
		//Caesar's encryption
		for (int i = offset; i < input.length; i++) {
			
			//if an upper case character
			if (input[i] >= (int)'A' && input[i] <= (int)'Z') {
				int fromZero = input[i] - (int)'A';
				int shift = (fromZero + caesarShiftNumber) % 26;
				temp[i]= (byte) (shift + (int)'A');
			}
			
			//if a lower case character
			else if (input[i] >= (int)'a' && input[i] <= (int)'z') {
				int fromZero = input[i] - (int)'a';
				int shift = (fromZero + caesarShiftNumber) % 26;
				temp[i]= (byte) (shift + (int)'a');
			}
			
			//if a number
			else if (input[i] >= (int)'0' && input[i] <= (int)'9') {
				int fromZero = input[i] - (int)'0';
				int shift = (fromZero + caesarShiftNumber) % 10;
				temp[i]= (byte) (shift + (int)'0');
			}
			
			//special characters for ASCII values between 32 and 47
			else if (input[i] >= (int)' ' &&input[i] <= (int)'/') {
				int fromZero = input[i] - (int)' ';
				int shift = (fromZero + caesarShiftNumber) % 16;
				temp[i]= (byte) (shift + (int)' ');
			}
			
			//special characters for ASCII values between 58 and 64
			else if (input[i] >= (int)':' && input[i] <= (int)'@') {
				int fromZero = input[i] - (int)':';
				int shift = (fromZero + caesarShiftNumber) % 7;
				temp[i]= (byte) (shift + (int) ':');
			}
			
			//special characters for ASCII values between 91 and 96
			else if (input[i] >= (int)'[' && input[i] <= (int)'`') {
				int fromZero = input[i] - (int)'[';
				int shift = (fromZero + caesarShiftNumber) % 6;
				temp[i]= (byte) (shift + (int) '[');
			}
			
			//special characters for ASCII values between 123 and 126
			else if (input[i] >= (int)'{' && input[i] <= (int) '~') {
				int fromZero = input[i] - (int)'{';
				int shift = (fromZero + caesarShiftNumber) % 4;
				temp[i]= (byte) (shift + (int) '{');
			}
			
			else {
				temp[i]= input[i];
			}
		}
		
		//reverse string
		for (int i = temp.length - 1, j = offset; i >= offset; i--,j++) {
			input[j]=temp[i];
		}
		
		
		
	}
	
	//to decrypt data
	public static void dataDecryption(byte[] input,int caesarShiftNumber, int offset) {
		
		byte[] temp = new byte[input.length];
		
		
		//caesar decryption
		for (int i = offset; i < input.length; i++) {
			//if an upper case character
			if (input[i] >= (int)'A' && input[i] <= (int)'Z') {
				int fromZero = input[i] - (int)'A';
				int shift = (fromZero - caesarShiftNumber) % 26;
				
				if (shift < 0) {
					shift += 26;
				}
				
				temp[i]= (byte) (shift + (int)'A');
			}
			
			//if an lower case character
			else if (input[i] >= (int)'a' && input[i] <= (int)'z') {
				int fromZero = input[i] - (int)'a';
				int shift = (fromZero - caesarShiftNumber) % 26;
				
				if (shift < 0) {
					shift += 26;
				}

				temp[i]= (byte) (shift + (int)'a');

			}
			
			//if a number
			else if (input[i] >= (int)'0' && input[i] <= (int)'9') {
				int fromZero = input[i] - (int)'0';
				int shift = (fromZero - caesarShiftNumber) % 10;
				
				if (shift < 0) {
					shift += 10;
				}
				
				temp[i]= (byte) (shift + (int)'0');
			}
			
			//special characters for ASCII values between 32 and 47
			else if (input[i] >= (int)' ' && input[i] <= (int)'/') {
				int fromZero = input[i] - (int)' ';
				int shift = (fromZero - caesarShiftNumber) % 16;
				
				if (shift < 0) {
					shift += 16;
				}
				
				temp[i]= (byte) (shift + (int)' ');
			}
			
			//special characters for ASCII values between 58 and 64
			else if (input[i] >= (int)':' && input[i] <= (int)'@') {
				int fromZero = input[i] - (int)':';
				int shift = (fromZero - caesarShiftNumber) % 7;
				
				if (shift < 0) {
					shift += 7;
				}
				
				temp[i]= (byte) (shift + (int)':');
			}
			
			//special characters for ASCII values between 91 and 96
			else if (input[i] >= (int)'[' && input[i] <= (int)'`') {
				int fromZero = input[i] - (int)'[';
				int shift = (fromZero - caesarShiftNumber) % 6;
				
				if (shift < 0) {
					shift += 6;
				}
				
				temp[i]= (byte) (shift + (int)'[');
			}
			
			//special characters for ASCII values between 123 and 126
			else if (input[i] >= (int)'{' && input[i] <= (int)'~') {
				int fromZero = input[i] - (int)'{';
				int shift = (fromZero - caesarShiftNumber) % 4;
				
				if (shift < 0) {
					shift += 4;
				}
				
				temp[i]= (byte) (shift + (int)'{');
			}
			
			else {
				temp[i] = input[i];
			}
				
		}
		for (int i = temp.length - 1, j = offset; i >= offset; i--,j++) {
			input[j]=temp[i];
		}

		
	}
	
	//verify if encryption/decryption works
	public static boolean verifyEncryptionDecryption(String a , String b) {
		if (a.equals(b)) {
			return true;
		}
		
		return false;
	}
	
	public static void main (String[] args) {
		String input = "127.0.0.1:8080";
		input ="www.google.com:80";
//		for (int c=32; c<128; c++) {
//		    input+= (char)c;
//		   } 
		String a="ccc$muumrk$ius@46                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ",b="42>qsg\"ipkssk\"aaa";
		System.out.println("Input is " + input);
		byte[] inputB = input.getBytes();
		CaesarCipher.dataEncryption(inputB,2,0); 
		
		System.out.println("encryption for only last " + new String(inputB));
CaesarCipher.dataEncryption(inputB,4,0); 
		
		System.out.println("encryption for both " + new String(inputB));
		
		CaesarCipher.dataDecryption(inputB,2,0);
		System.out.println("decryption for only last " + new String(inputB));
		CaesarCipher.dataDecryption(inputB,4,0);
		System.out.println("original is " + new String(inputB));
		
		if (CaesarCipher.verifyEncryptionDecryption(new String(inputB), input)) {
			System.out.println("Encryption/Decryption works");
		}
		
		else {
			System.out.println("Encryption/decryption doesn't work");
		}
	}
	
}
