package chapter3.template;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//≈€«√∏¥
public class Calculator_list3_34 {

	public Integer calcSum(String filepath) throws IOException{
		BufferedReaderCallback sumCallback = new BufferedReaderCallback() {
			
			public Integer doSomethingWithReader(BufferedReader br) throws IOException {
				Integer sum = 0;
				String line = null;
				while((line = br.readLine()) != null) {
					sum += Integer.valueOf(line);
				}

				return sum;
			}
		};
		return fileReadTemplate(filepath, sumCallback);
	}
	
	public Integer fileReadTemplate(String filepath, BufferedReaderCallback callback) throws IOException{
		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader(filepath));
			int result = callback.doSomethingWithReader(br);
			return result;
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw e;
			
		}finally {
			if(br != null) {

				try {
					br.close();					
				} catch (IOException e2) {

					System.out.println(e2.getMessage());
					throw e2;
				}
			}
		}
	}

	public Integer calcMultiply(String numFilepath) throws IOException{	

	BufferedReaderCallback multipleCallback = new BufferedReaderCallback() {
				
				public Integer doSomethingWithReader(BufferedReader br) throws IOException {
					Integer sum = 0;
					String line = null;
					while((line = br.readLine()) != null) {
						sum *= Integer.valueOf(line);
					}
	
					return sum;
				}
			};
			return fileReadTemplate(numFilepath, multipleCallback);
		
	}

}
