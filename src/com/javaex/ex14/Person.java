package com.javaex.ex14;

public class Person {
	//필드 - protected 일부오픈(상속.같은패키지.같은클래스)
	protected String name; 
	protected int age;
	
	//생성자
	public Person() {
		System.out.println("Person()"); //테스트
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)"); //테스트
	}

	
	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//일반메소드
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}