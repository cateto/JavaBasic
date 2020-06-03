import java.io.*;
import java.nio.file.Files;

class CopyFile
{
	File f;
	FileOutputStream fos;
	FileInputStream is;
	FileOutputStream fos2;
	FileInputStream is2;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String originCopyF;
	String originName;
	String newCopyF;

	CopyFile(){
		System.out.print("복사 할 파일의 경로 : ");

		try{
			originCopyF = br.readLine();
			if(originCopyF != null) originCopyF = originCopyF.trim();
			f = new File(originCopyF);

		}catch(IOException io){}

		System.out.print("복사할 폴더 위치(default : 현재 디렉토리) : " );
		
		try{
			newCopyF = br.readLine();
			if(newCopyF != null) newCopyF = newCopyF.trim();
			if(newCopyF.length() == 0){
				try{
					is = new FileInputStream(originCopyF);
					fos = new FileOutputStream(f.getName());
					copy(is, fos);
					System.out.println("복사를 성공했습니다!(^v^)");
				}catch(FileNotFoundException fe){}
			}else{
				try{
					is2 = new FileInputStream(originCopyF);
					fos2 = new FileOutputStream(newCopyF + "/" + f.getName());
					copy(is2, fos2);
					System.out.println("복사를 성공했습니다!(^v^)");
				}catch(FileNotFoundException fe){}
			}
		}catch(IOException io){}
		
	}

	void copy(FileInputStream is, FileOutputStream fos){
		byte[] b = new byte[8];
		int total = 0;
		
		try{
			while((total = is.read(b)) != -1){
				fos.write(b, 0, total); 
				fos.flush();
			}
		}catch(IOException ie){
		}finally{
			try{
				is.close();
				fos.close();
			}catch(IOException ie){}
		}
	}


}
