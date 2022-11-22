package com.kh.example.practice4.run;
import  com.kh.example.practice4.model.vo.*;
import com.kh.example.practice6.model.vo.Book;
public class Run {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     
		 Student s1 = new Student();
	     s1.information();
	     Book bk=new Book("셜록홈즈","교본문구","김상식",150000,15);
	     bk.info();
	     Book bk2=new Book("셜록홈즈","교본문구","김상식");
	     bk2.info();
		
	}


}
