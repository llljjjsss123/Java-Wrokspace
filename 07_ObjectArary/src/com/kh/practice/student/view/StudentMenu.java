package com.kh.practice.student.view;

import java.util.Scanner;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();

	public StudentMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======학생 정보 출력=======");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		Student[] sArr = ssm.printStudent();
		for (Student std : sArr) {
			System.out.println(std.inform());
		}
		System.out.println();

		System.out.println("=======학생 성적 출력=======");
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		double[] avg = ssm.avgScore();
		System.out.println("학생 점수 합계: " + (int) avg[0]);
		System.out.println("학생  평균: " + avg[1]/5);
		System.out.println("=======학생 결과 출력=======");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		for (Student std : sArr) {
			String result = "통과";
			if (std.getScore() < StudentController.CUT_LINE) {
				result = "재시험 대상";
			}
			System.out.printf("%s학생은 %s입니다.\n", std.getName(), result);
		}
	}

}
