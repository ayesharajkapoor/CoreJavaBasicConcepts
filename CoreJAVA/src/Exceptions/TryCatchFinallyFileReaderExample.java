package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;


public class TryCatchFinallyFileReaderExample {
	static String FILENAME="samplefile.txt";
	static BufferedReader br = null;
	static FileReader fr= null;
public static void main(String[] args) {
	try {
		fr=new FileReader(FILENAME);
		br=new BufferedReader(fr);
		String sCurrentLine;
		while((sCurrentLine=br.readLine())!=null) {
			System.out.println(sCurrentLine);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		try {
			if(br!=null) {
				br.close();
			}
			if(fr!=null) {
				fr.close();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

}
