package com.kh.chap03_Map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_Map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {
	public static void main(String[] args) {
		//properties: 맵 계열 =>key value세트로 저장
		//			  단 Properties의 특징: key, value모두 String으로 제한됨.
		Properties prop=new Properties();
		//String이 아닌 값 넣게 된 경우
		//Map계열이기 때문에 put메서드 활용가능.
//		prop.put("다이제", new Snack("초코맛",1000));
//		System.out.println(prop);
//		System.out.println(prop.get("다이제"));
//		
		//단, 주로 Properties를 사용하는 경우는 Properties에 담겨있는 Key+Value값 세트들을 파일로 기록하기 위해 사용됨.
//		try {
//			prop.store(new FileOutputStream("test.properties"),"Properties test");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}{
//			
//		}
		//Properties에 값을 추가할때는 SetProperty(String Key,String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop);//저장순서 유지x,key값 중복x
		
		//값 가져오기
		//2.getProperty(String key):String
		System.out.println(prop.getProperty("set"));
		
		//3.store(OutputStream os, String Comments): Properties에 담긴 key-value값들을 파일로 출력
		try {
			prop.store(new FileOutputStream("test.properties"),"Properties Test");{
				//4. store To
			prop.storeToXML(new FileOutputStream("test.xml"),"Properties Test");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
