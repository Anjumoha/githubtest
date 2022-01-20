package com.student.Responce;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.student.model.Student;
@JsonInclude(value = Include.NON_EMPTY)
public class StudentResponce {
	
	

		
		private List<Student> loginList;
		private Student login;
		
		private String statusCode;
		private String statusMessage;
		public List<Student> getLoginList() {
			return loginList;
		}
	public void setLoginList1(List<Student> loginList) {
				this.loginList = loginList;	
		}
		public Student getLogin() {
			return login;
		}
		public void setLogin(Student login) {
			this.login = login;
		}
		public String getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}
		public String getStatusMessage() {
			return statusMessage;
		}
		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}
		public void setLoginList(List<Student> loginList) {
			this.loginList = loginList;
		}
}
