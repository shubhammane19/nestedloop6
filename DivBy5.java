import java.io.*;

class DivBy5{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter startRange:");
		int startRange = Integer.parseInt(br.readLine());
		
		System.out.println("Enter endRange:");
		int endRange = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = startRange; i<=endRange; i++){
			
			if(i%5 == 0 && i%2 == 0){
				
				count++;
				System.out.println(i + " ");
			}
		}
		System.out.println("No of count: " + count);
	}
}