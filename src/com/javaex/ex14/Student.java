package com.javaex.ex14;

public class Student extends Person{

	//필드
	private String schoolName;
	
	//생성자
	public Student() {}
	
	
	public Student(String schoolName) {
		//Person()부모쪽 디폴트 생성자 실행
		this.schoolName = schoolName;
		
		System.out.println("Student(1)"); //테스트
	}
		
	
	
	public Student(String name, int age, String schoolName) {
		//1. 자신의 생성자 시작 -> 완료x
		//2. 부모의 생성자 호출
		//   -부모의 생성자를 선택할 수 있다.
		//   -선택하지 않으면 디폴트 생성자가 실행된다.
		//3. 부모의 생성자 작업이 끝나면 자신의 생성자 작업을 완료한다.
		

		//부모 생성자 호출 방법
		//표기 없으면 디폴트 생성자 호출
		//선택을 하면 선택한 생성자 호출
		// super(파라미터) <-- 이런 식으로 표기함
		super(name, age);
		this.schoolName = schoolName;
		
		System.out.println("Student(3)"); //테스트
	}
	
	//메소드
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//일반메소드
	public void showInfo() {
		/*
		System.out.println(getName()); //=super.getName()
		System.out.println(getAge());
		System.out.println(schoolName);
		*/
		
		System.out.println("이름:" + getName() + ", 나이:" + getAge() + ", 학교:" + schoolName);
		System.out.println("이름:" + name + ", 나이:" + age + ", 학교:" + schoolName);
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
}