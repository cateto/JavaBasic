import java.io.*;
import java.nio.file.*;

class CutFile
{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileInputStream fis;
	FileOutputStream fos;
	File f;
	String originCopyF;
	String newCutF;
	

	CutFile(){
		System.out.print("잘라내기 할 파일의 경로 : ");

		try{
			originCopyF = br.readLine();
			if(originCopyF != null) originCopyF = originCopyF.trim();

		}catch(IOException io){}

		System.out.print("잘라내기 할 폴더 위치(default : 현재 디렉토리) : " );

		try{
			newCutF = br.readLine();
			if(newCutF != null) newCutF = newCutF.trim();
			if(newCutF.length() == 0){
					fis = new FileInputStream(originCopyF);
					f = new File(originCopyF);
					fos = new FileOutputStream(f.getName());
					cut(fis, fos);
					f.delete();
					System.out.println("잘라내기를 성공했습니다!(^x^)");
			}else{
				try{
					fis = new FileInputStream(originCopyF);
					f = new File(originCopyF);
					fos = new FileOutputStream(newCutF + "/" + f.getName());
					cut(fis, fos);
					f.delete();
					System.out.println("잘라내기를 성공했습니다!(^x^)");
				}catch(FileNotFoundException fe){}
			}
		}catch(IOException io){}

	}

	void cut(FileInputStream fis, FileOutputStream fos){
		
		byte[] b = new byte[8];
		int total = 0;
		
		try{
			while((total = fis.read(b)) != -1){
				fos.write(b, 0, total); 
				fos.flush();
			}
		}catch(IOException ie){
		}finally{
			try{
				fis.close();
				fos.close();
			}catch(IOException ie){}
		}

	}
}
