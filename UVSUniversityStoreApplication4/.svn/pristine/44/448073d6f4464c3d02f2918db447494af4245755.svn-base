package sg.nus.iss.se22ft1.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations {
	/*
	 * Use:	Used to read a file.
	 * Input: 
	 * 		Path of the file
	 * Output:
	 * 		StringBuffer where each line is separated by '\n'
	 * Made by: SCM
	 */

	public static StringBuffer readFromFile(String path) {
		// Line by Line
		StringBuffer stringBuffer = new StringBuffer("");
		FileInputStream fstream;
		try {
			fstream = new FileInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					fstream));
			String strLine = "";
			while ((strLine = br.readLine()) != null) {
				stringBuffer.append(strLine + "\n");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringBuffer;
	}

	/*
	 * Use: Used to append to a file.
	 * Input: 
	 * 		Path of the file
	 * 		String that is to be written to the file
	 * Output:
	 * 		None
	 * Made by: SCM
	 */
	public static void appendToFile(String path, String textToWrite) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(path, true));// true = append, false = overwrite
			//writer.newLine();
			writer.write(textToWrite);
		} catch (IOException e) {
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
			}
		}
	}
	
	/*
	 * Use: Used to overwrite a file.
	 * Input: 
	 * 		Path of the file
	 * 		String that is to be written to the file
	 * Output:
	 * 		None
	 * Made by: SCM
	 */
	public static void overwriteFile(String path, String textToWrite) {
		try{
			
		File f= new File(path);
		if (!f.exists()) {
             f.createNewFile();
		 }
		}
		catch(IOException e){
			e.printStackTrace();
		}


		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(path, false));// true = append, false = overwrite
			writer.write(textToWrite);
		} catch (IOException e) {
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
			}
		}
	}
}