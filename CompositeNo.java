import java.io.*;

class CompositeNo{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter startRange:");
		int startRange = Integer.parseInt(br.readLine());
		
		System.out.println("Enter endRange:");
		int endRange = Integer.parseInt(br.readLine());
		
		for(int i = startRange; i<=endRange; i++){
			
			int count = 0;
			for(int j = 1; j*j<= i; j++){
				
				if(i%j == 0)
					
					count++;
				}
				if(count>= 2)
					System.out.println(i);
			}
	}
}
