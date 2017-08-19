package Chapter_1;

public class Excercise_5 {

	public static void main(String[] args) {

		checkRunnable("Manish", 50);
	}

	public static void checkRunnable(String name, int count) {

		Thread t = new Thread(() -> {

			for (int i = 0; i < count; i++) {
				System.out.println(name);
			}
		});
		t.start();
	}
}
