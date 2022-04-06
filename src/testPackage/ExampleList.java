package testPackage;

import java.util.ArrayList;

public class ExampleList {
	public static void main(String[] args) {
		ArrayList ListTest = new ArrayList();
		ListTest.add("List Test");
		ListTest.add(3500);
		ListTest.add(2, "Test");
		
		System.out.println(ListTest.get(0));
		System.out.println(ListTest.get(1));
		System.out.println(ListTest.get(2));
		System.out.println("==============================================");
		ArrayList<String> pitches = new ArrayList<String>();
		pitches.add("ArrayList");
		pitches.add("String");
		
		System.out.println(pitches.get(0));
		System.out.println(pitches.get(1));
		System.out.println("==============================================");
		ArrayList<String> pitchesstring = new ArrayList<>();
		pitchesstring.add("pitchesstring");
		pitchesstring.add("String Test");
		
		System.out.println(pitchesstring.get(0));
		System.out.println(pitchesstring.get(1));

		
	}
}
