package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 "+MemberController.SIZE+"명입니다.");
			System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명입니다.");
			if(mc.existMemberNum()!=10) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1: insertMember(); break;
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAll(); break;
				case 9: System.out.println("프로그램을 종료합니다."); return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");return;
				}
			}else {
				System.out.println("회원수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				
				switch(num) {
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAll(); break;
				case 9: System.out.println("프로그램을 종료합니다"); return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");return;
				}
			}
				
		}
	}
	
	public void insertMember() {
		sc.nextLine();
		
		System.out.println("새 회원을 등록합니다.");
		
		boolean result = true;
		String id = "";
		while(result) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			if (mc.checkId(id) == true) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}else {
				result = false;
			}
		}
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		boolean a = true;
		char gender =' ';
		while(a) {
			System.out.print("성별 : ");
			gender = sc.nextLine().charAt(0);
			if (gender=='m' || gender=='M'|| gender=='f' || gender=='F') {
				a = false;
			}else {
				System.out.println("성별을 다시 입력하세요");
			}
		}
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		mc.insertMember(id, name, password, email, gender, age);
		
		System.out.println();
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다.\n"); return;
			default : System.out.println("잘못 입력하셨습니다.\n"); return;
		}
	}
	
	public void searchId() {
		sc.nextLine();
		System.out.print("검색할 아이디 : ");
		String id = sc.nextLine();
		if(mc.searchId(id)==null) {
			System.out.println("검색 결과가 없습니다.\n");
			return;
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(id));
			System.out.println();
		}
		
	}
	
	public void searchName() {
		sc.nextLine();
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		String result = "";
		Member[] m = mc.searchName(name);
		for(int i =0; i<m.length; i++) {
			if(m[0]==null) {
				System.out.println("검색 결과가 없습니다.\n");
				return;
			}if(m[i]==null) {
				continue;
			}else {
				result += m[i].inform()+"\n";
			}	
		}
		System.out.println("찾으신 회원 조회 결과입니다.\n"+result);
		
		
	}
	
	public void searchEmail() {
		sc.nextLine();
		System.out.print("검색할 이메일 : ");
		String email = sc.nextLine();
		String result = "";
		Member[] m = mc.searchEmail(email);
		for(int i =0; i<m.length; i++) {
			if(m[0]==null) {
				System.out.println("검색 결과가 없습니다.\n");
				return;
			}if(m[i]==null) {
				continue;
			}else {
				result += m[i].inform()+"\n";
			}	
		}System.out.println("찾으신 회원 조회 결과입니다.\n"+result);
		
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다.\n"); return;
			default : System.out.println("잘못 입력하셨습니다.\n"); return;
		}
	}
	
	public void updatePassword() {
		sc.nextLine();
		System.out.print("수정할 회원 id : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원 비밀번호 : ");
		String password = sc.nextLine();
		if(mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.\n");
			
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n");
			return;
			
		}
	}
	
	public void updateName() {
		sc.nextLine();
		System.out.print("수정할 회원 id : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원 이름 : ");
		String name = sc.nextLine();
		if(mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.\n");
			
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n");
			return;
			
		}
	}
	
	public void updateEmail() {
		sc.nextLine();
		System.out.print("수정할 회원 id : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원 이메일 : ");
		String email = sc.nextLine();
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.\n");
			
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n");
			return;
			
		}
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9: System.out.println("메인으로 돌아갑니다.\n"); return;
			default : System.out.println("잘못 입력하셨습니다.\n"); return;
		}
	}
	
	public void deleteOne() {
		sc.nextLine();
		System.out.print("삭제할 회원 id : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char answer = sc.nextLine().charAt(0);
		if(answer =='y' || answer == 'Y') {
			if(mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.\n");
				return;
			}else {
				System.out.println("존재하지 않는 아이디입니다.\n");
				return;
			}
		}return;
	}
	
	public void deleteAll() {
		sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n): ");
		char answer = sc.nextLine().charAt(0);
		if(answer =='y' || answer == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.\n");
				return;
			}
	}
	
	public void printAll() {
		Member[] m = mc.printAll();
		if(mc.existMemberNum()== 0) {
			System.out.println("저장된 회원이 없습니다.\n");
		}
		
		for(int i = 0; i<m.length; i++) {
			if(m[i] == null) {
				continue;
			}else {
				System.out.println(m[i].inform());
			}
			System.out.println();
			
		}
	}
	
}
