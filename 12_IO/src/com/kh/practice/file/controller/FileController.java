package com.kh.practice.file.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.kh.practice.file.dao.FileDAO;

public class FileController {
	private FileDAO fd=new FileDAO();
	public boolean checkName(String file) {
		fd.checkName(file);
	}
	public void fileSave(String file, String s) {
		fd.fileSave(file, sb.toString());
	}
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
		
	}
	public void fileEdit(String file, String s) {
		
	}
}
