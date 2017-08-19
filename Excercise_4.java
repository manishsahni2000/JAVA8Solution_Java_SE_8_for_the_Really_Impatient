package Chapter_1;

import java.io.File;
import java.util.Arrays;

public class Excercise_4 {

	static File file = new File("/D:/Study_Material/");

	public static void main(String[] args) {

		sort(file.listFiles());

	}

	public static void sort(File[] files) {

		Arrays.sort(
				files,
				(f1, f2) -> {
					if (f1.isDirectory() && !f2.isDirectory()) {
						return -1;
					} else if (!f1.isDirectory() && f2.isDirectory()) {
						return 1;
					} else {
						return f1.getName().toLowerCase()
								.compareTo(f2.getName().toLowerCase());
					}
				});
		System.out.println(Arrays.toString(files));
	}

}
