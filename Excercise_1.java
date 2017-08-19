package Chapter_1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Excercise_1 {

	static File file = new File("/D:/Study_Material/JAVA8");

	public static void main(String[] args) {

		System.out.println(Arrays.toString(usingjava7()));
		System.out.println(Arrays.toString(usingjava8Lambda()));
		System.out.println(Arrays.toString(usingMethodReferences()));
	}

	public static String[] usingjava7() {

		String[] directories = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File current, String name) {
				return new File(current, name).isDirectory();
			}
		});

		return directories;
	}

	public static File[] usingjava8Lambda() {

		File[] directories = file.listFiles((current) -> current.isDirectory());

		return directories;
	}

	public static File[] usingMethodReferences() {
		File[] dir = file.listFiles(File::isDirectory);
		return dir;
	}
}
