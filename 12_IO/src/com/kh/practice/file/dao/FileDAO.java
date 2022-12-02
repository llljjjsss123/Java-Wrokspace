package com.kh.practice.file.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		return new File(file).isFile();//true면 file임. 즉 생성되어 있음
		//false면->파일이없음
	}
	public void fileSave(String file, String s) {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public StringBuilder fileOpen(String file) {
		StringBuilder sb=new StringBuilder();
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String value=null;
		while(value=br.readLine()) !=null) {
				sb.append(value)
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb;
	}
	public void fileEdit(String file, String s) {
		
	}
}
