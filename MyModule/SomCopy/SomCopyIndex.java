import java.io.*;
import java.nio.file.Files;

class SomCopyIndex 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String userRespond;


	SomCopyIndex(){
		System.out.println("*****************************************");
		System.out.println("안녕하세요! 어떤 기능을 원하시나요?");
		System.out.println("(^_^)");
		System.out.println("1.파일 복사하기(^v^) 2.파일 잘라내기(^x^)");
		System.out.println("*****************************************");

		try{
			userRespond = br.readLine();
			
			if(userRespond.equals("1") || userRespond.equals("1.")){
				//파일 복사
				new CopyFile();
			}else if(userRespond.equals("2") || userRespond.equals("2.")){
				//파일 잘라내기
				new CutFile();

			}else{
				System.out.println("Please type in 1 or 2");
			}
		}catch(IOException io){}
	}

}
