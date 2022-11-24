package com.kh.chap01_beforeVsafter.after.model.vo;
			//자식				//부모
			//후손				//조상
			//하위				//상위
public class Desktop extends Product{
	private boolean allInOne;

	public Desktop() {
		super();
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		//super->부모클래스의 주소값을 보관 sueper.으로 부모에 접근가능
		//brand,pCode,pName,price를 부모 클래스의 Product에 있는 필드에 초기화(대입)
		
		//해결방법 1. 부모클래스의 필드를 자식까지는 접근가능하도록 접근제한자를 변경
		//private->protected로 변경
//		super.brand=brand;
//		super.pCode=pCode;
//		super.pName=pName;
//		super.price=price;
		//해결방법2. 부모클래스에서 접근할수있는(public)setter메서드 활용
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		//해결방법3. 부모생성자 호출하기 단, 반드시 첫줄에 기술되어야 한다.
		super(brand,pCode,pName,price);
		this.allInOne=allInOne;
		
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public boolean getAllInOne() {
		return allInOne;
	}
	//오버라이딩:부모클래스의 메소드를 내 입맛대로 정의
	public String information() {
		return super.information()+",allInOne: "+allInOne;
	}
}
