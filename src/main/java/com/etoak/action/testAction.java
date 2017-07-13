package com.etoak.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class testAction {
	public static void main(String[] args) {
		System.out.println(readTxtLine("C://etoak.csv",20));
	}

	public static String readTxtLine(String txtPath, int lineNo) {

		String line = "";
		String encoding = "utf-8";
		try {
			File txtFile = new File(txtPath);
			InputStream in = new FileInputStream(txtFile);
			InputStreamReader read = new InputStreamReader(in, encoding);
			BufferedReader reader = new BufferedReader(read);
			int i = 0;
			while (i < lineNo) {
				line = reader.readLine();
				i++;
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}
	
	
	public static void readAppointedLineNumber(File sourceFile, int lineNumber)  
            throws IOException {  
        FileReader in = new FileReader(sourceFile);  
        LineNumberReader reader = new LineNumberReader(in);  
        String s = "";  
        if (lineNumber <= 0 || lineNumber > getTotalLines(sourceFile)) {  
            System.out.println("不在文件的行数范围(1至总行数)之内。");  
            System.exit(0);  
        }  
        int lines = 0;  
        while (s != null) {  
            lines++;  
            s = reader.readLine();  
            if((lines - lineNumber) == 0) {  
                System.out.println(s);  
                System.exit(0);  
            }  
        }  
        reader.close();  
        in.close();  
    }
	
	// 文件内容的总行数。  
    public static int getTotalLines(File file) throws IOException {  
        FileReader in = new FileReader(file);  
        LineNumberReader reader = new LineNumberReader(in);  
        String s = reader.readLine();  
        int lines = 0;  
        while (s != null) {  
            lines++;  
            s = reader.readLine();  
            if(lines>=2){  
                if(s!=null){  
                    System.out.println(s+"$");  
                }  
            }  
        }  
        reader.close();  
        in.close();  
        return lines;  
    }  
}
