package com.hand.mvc_pattern.util;

public class Main {

	public static void main(String[] args) {
		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("Niko");
		controller.setStudentRollNo("002");
		controller.updateView();
	}
	
	private static Student retriveStudentFromDatabase(){
		Student student = new Student();
		student.setName("John");
		student.setRollNo("001");
		
		return student;
	}
}
