package com.kh.chap03_Map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		Properties prop=new Properties();//비어있는 상태
		//5.load(InputStream is)
		try {
//			prop.load(new FileInputStream("test.properties"));
			//loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(prop.getProperty("Map"));
		System.out.println(prop.getProperty("List"));
	}

}
