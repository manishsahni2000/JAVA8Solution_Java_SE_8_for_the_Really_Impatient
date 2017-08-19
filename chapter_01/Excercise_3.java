package Chapter_1;

import java.io.File;
import java.util.Arrays;

public class Excercise_3 {

	static File file = new File("/D:/Study_Material/JAVA8/");

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(getFiles("pdf")));

	}

	public static String[] getFiles(String extension) {

		String[] directories = file.list((filter, name) -> name.endsWith(extension));

		return directories;
	}

}
