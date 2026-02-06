package p1;

public class BeautifulStrings {

	public static void main(String[] args) {
		
		String str = "abdde";
		char arr[] = str.toCharArray();
		//int cnt = 0;
//		for(int i = 1; i < str.length(); i++) {
//			if(str.charAt(i+1) != str.charAt(i) && str.charAt(i+1) != str.charAt(i)+2) {
//				System.out.println(str.charAt(i)+" "+str.charAt(i+1));
//				cnt++;
//			}
//		}
//		System.out.println();
//		System.out.println(cnt);
		int opr = 0;
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] == arr[i-1]  || arr[i] == arr[i-1]+1 || arr[i] == arr[i-1]-1) {
				//string is not beautiful
				//so check the boundaries and their prev, next, curr
				//select the char which isnt among the above 6
				
				for(char ch = 'a'; ch <= 'z'; ch++) {
					
					if((ch != arr[i-1] && ch != arr[i-1]+1&& ch != arr[i-1]-1) && 
						((i+1 >= arr.length) ||	(ch != arr[i+1] && ch != arr[i+1]-1 && ch != arr[i+1]+1))) {
						
						arr[i] = ch;
						opr++;
						break;
					}
				}
			}
		}
		System.out.println(opr);
		
		System.out.println(new String(arr));
	}
}
