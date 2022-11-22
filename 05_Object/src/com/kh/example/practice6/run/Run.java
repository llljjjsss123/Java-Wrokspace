package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;


public class Run {

	public static void main(String[] args) {
		   Book bk=new Book("셜록홈즈","교본문구","김상식",150000,15);
		     bk.info();
		     Book bk2=new Book("셜록홈즈","교본문구","김상식");
		     bk2.info();

	}

}
