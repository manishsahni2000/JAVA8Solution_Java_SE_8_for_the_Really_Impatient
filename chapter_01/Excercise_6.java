package Chapter_1;

public class Excercise_6 {

	public static void main(String[] args) {
		perform();
	}

	public static void perform() {

		Thread t = new Thread(uncheck(() -> {
			System.out.println("Zzz");
			Thread.sleep(1000);
		}));

		t.start();

	}

	public static Runnable uncheck(RunnableEx runner) {
		return () -> {

			try {
				runner.run();
			} catch (Exception e) {

				e.printStackTrace();
			}
		};

	}

	// interface with only one abstract method

	@FunctionalInterface
	interface RunnableEx {

		public void run() throws Exception;
	}

}
