package com.kh.chap03_class.run;
import com.kh.chap03_class.model.vo.*;
import com.kh.chap03_class.model.vo.member.Member;
public class Run {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setpName("아이폰14");
		p1.setPrice(14000000);
		p1.setBrand("애플");//barnd 필드에 애플값이 이미 초기화됨
		//brand명 지정시 애플상품이면 초기화하지 않아도 됨
		
		
		System.out.println(p1.information());
		
		Product p2=new Product();
		p2.setpName("갤럭시 z플립4");
		p2.setPrice(1350000);
		p2.setBrand("삼성");
		
		System.out.println(p2.information());
		
		Member m1=new Member();
		m1.changeName("민경민");
		m1.printName();
	}

}
