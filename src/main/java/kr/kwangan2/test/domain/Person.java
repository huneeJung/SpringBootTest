package kr.kwangan2.test.domain;

import lombok.Data;

@Data
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
