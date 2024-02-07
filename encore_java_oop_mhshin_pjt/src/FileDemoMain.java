import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemoMain {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		FileReader reader = null ;
		try {
			 reader = new FileReader("C:\\Users\\user\\git\\git_encore_java\\encore_java_oop_mhshin_pjt\\src\\testReader.txt");
			 //System.out.println(reader.read());
			 int data = 0 ;
			 while( (data = reader.read()) !=-1) {
				 System.out.print((char)data);
			 }
			 System.out.println();
			 System.out.println();
			 // File 객체
			 File file = new File("C:\\Users\\user\\git\\git_encore_java\\encore_java_oop_mhshin_pjt\\src\\testReader.txt");
			 reader = new FileReader(file) ;
			 
			 char [] charAry = new char[(int)file.length()];
			 
			 reader.read(charAry) ; // char 하나씩을 읽어들이는 것이 아니라 전체 한꺼번에 읽어들인다
			 
			 for(int idx = 0 ; idx < charAry.length ; idx++) {
				 System.out.println(charAry[idx]);
			 }
			 
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//		catch (FileNotFoundException e) { //자식먼저 걸어주기
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		
	}

	
}
