import java.io.*;

class PerfectCubes{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter startRange:");
		int startRange = Integer.parseInt(br.readLine());
		
		System.out.println("Enter endRange:");
		int endRange = Integer.parseInt(br.readLine());
		
		for(int i = startRange; i<= endRange; i++){
			
			for(int j = 1; j*j*j<=i; j++){
				
				if(j*j*j == i)
					System.out.println(i + "\t");
				
			}
		}
	}
}