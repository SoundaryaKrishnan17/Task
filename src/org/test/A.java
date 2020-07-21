package org.test;

public class A {
	public A() {
	    this("JAVA");
	    System.out.println("Default const");
	  }

	  public A(int id) {
	    this(3456.5678f);
	    System.out.println("int para constant");
	  }

	  public A(String name) {
	    this(12);
	    System.out.println("String const");
	  }

	  public A(float sal) {
	    System.out.println("float const");
	  }

	  public static void main(String[] args) {
	    A a = new A();
	  }

	}



