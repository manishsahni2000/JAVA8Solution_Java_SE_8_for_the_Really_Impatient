package Chapter_1;

import java.util.ArrayList;
import java.util.List;

public class Excercise_7 {

	public static void main(String[] args) {

		Thread t = new Thread(andthen(() -> {
			System.out.println("First");
		}, () -> {
			System.out.println("Second");
		}));

		t.start();

		String[] names = { "Peter", "Paul", "Mary" };
		List<Runnable> runners = new ArrayList<>();
		for (String name : names)
			runners.add(() -> System.out.println(name));

		for (Runnable runner : runners) {
			new Thread(runner).start();
		}

	}

	public static Runnable andthen(Runnable r1, Runnable r2) {

		return () -> {
			r1.run();
			r2.run();
		};

	}
}
