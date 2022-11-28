package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		for(Member a : m) {
			if (a!=null) {
				count++;
			}
		}return count;
	}
	
	public boolean checkId(String inputId) {
		boolean b = false;
		for(Member a : m) {
			if(a==null) {
				continue;
			}
			if (a.getId().equals(inputId)) {
				b = true;
			}
		}return b;
	}
	
	int count = 0;
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
			m[count++] = new Member(id, name, password, email,gender,age);
			
	}
	
	public String searchId(String id) {
		String result = null;
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				continue;
			}
			if (m[i].getId().equals(id)) {
				result = m[i].inform();
			}
		}return result;
	}
	
	public Member[] searchName(String name) {
		int count1 =0;
		Member[] result = new Member[m.length];
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				continue;
			}
			if (m[i].getName().equals(name)) {
				result[count1++] = m[i];
			}
		}return result;
		
	}
	
	public Member[] searchEmail(String email) {
		int count1 =0;
		Member[] result = new Member[m.length];
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				continue;
			}
			if (m[i].getEmail().equals(email)) {
				result[count1++] = m[i];
			}
		}return result;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean result = false;
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if (m[i].getId().equals(id)) {
				m[i].setPassword(password);
				result = true;
			}
		}return result;	
	}
	
	public boolean updateName(String id, String name) {
		boolean result = false;
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				continue;
			}
			if (m[i].getId().equals(id)) {
				m[i].setName(name);
				result = true;
			}
		}return result;	
	}
	
	public boolean updateEmail(String id, String email) {
		boolean result = false;
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if (m[i].getId().equals(id)) {
				m[i].setEmail(email);
				result = true;
			}
		}return result;	
	}
	
	public boolean delete(String id) {
		boolean result = false;
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if (m[i].getId().equals(id)) {
				m[i] = null;
				result = true;
			}
		}return result;	
	}
	
	public void delete() {
		for(int i = 0; i<m.length; i++) {
			m[i] = null;
		}
	}
	
	public Member[] printAll() {
		return m;
	}
}
