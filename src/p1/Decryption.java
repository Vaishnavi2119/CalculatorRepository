package p1;

//class DecryptString {
//
//   }

public class Decryption {

	public static void main(String[] args) {
	
		 System.out.println(decrypt("ABC", 3));
	        System.out.println(decrypt("HELLO WORLD!", 3));
	        System.out.println(decrypt("ABC", 29));
	        System.out.println(decrypt("ABC", -3));

	}
	
	 public static String decrypt(String text, int k) {

	        if (text == null || text.isEmpty()) {
	            return "";
	        }

	        // 🔑 MOST IMPORTANT FORMULA
	        k = ((k % 26) + 26) % 26;

	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < text.length(); i++) {
	            char c = text.charAt(i);

	            if (c >= 'A' && c <= 'Z') {

	                // Shift backward
	                char decrypted = (char) (c - k);

	                // Wrap-around if needed
	                if (decrypted < 'A') {
	                    decrypted = (char) (decrypted + 26);
	                }

	                result.append(decrypted);
	            } else {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }

}
