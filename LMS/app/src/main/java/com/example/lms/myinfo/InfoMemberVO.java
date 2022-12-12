package com.example.lms.myinfo;

import java.io.Serializable;
import java.util.ArrayList;

public class InfoMemberVO implements Serializable {
	private String id,	pw,	name,	gender, phone,	email,	post,	addr,	grade, state, department_id, department_name, 	info_name, profile;
	private String birth, start_date, end_date;
	private int info_cd;
	ArrayList<InfoMemberVO> list;

	public InfoMemberVO(String id, String pw, String name, String gender, String phone, String email, String post, String addr, String grade, String state, String department_id, String department_name, String info_name, String profile, String birth, String start_date, String end_date, int info_cd, ArrayList<InfoMemberVO> list) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.post = post;
		this.addr = addr;
		this.grade = grade;
		this.state = state;
		this.department_id = department_id;
		this.department_name = department_name;
		this.info_name = info_name;
		this.profile = profile;
		this.birth = birth;
		this.start_date = start_date;
		this.end_date = end_date;
		this.info_cd = info_cd;
		this.list = list;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getInfo_name() {
		return info_name;
	}
	public void setInfo_name(String info_name) {
		this.info_name = info_name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public int getInfo_cd() {
		return info_cd;
	}
	public void setInfo_cd(int info_cd) {
		this.info_cd = info_cd;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
	
	
	

	
}
