package com.project.learn;

import java.util.Date;

public final class ImmutableExample {
	
	final String name;
	
	final Engine eng;


	
	ImmutableExample(String name ,Engine eng){
		
		this.name=name;
		Engine e = new Engine();
		e.setValue(eng.getValue());
		this.eng=e;

	}
	

	public String getName() {
		return name;
	}


	public Engine getEng() {
		Engine e1 = new Engine();
		e1.setValue(this.eng.getValue());
		return eng;
	}


	public static void main(String[] args) {
		Engine eg = new Engine();
		eg.setValue("ford");


		ImmutableExample ex1 = new ImmutableExample("ja", eg);


		System.out.println(ex1);

		ex1.getEng().setValue("audi");

		System.out.println(ex1);
		
	}

	@Override
	public String toString() {
		return "ImmutableExample{" +
				"name='" + name + '\'' +
				", eng=" + eng +
				'}';
	}
}

class Engine{
	
	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Engine [value=" + value + "]";
	}
	
	
	
	
}
