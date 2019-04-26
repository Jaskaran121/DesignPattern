package VisitorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class clientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompilationUnit object = new CompilationUnit();
		object.accept(new ConcreteVisitorA());		
	}
}
