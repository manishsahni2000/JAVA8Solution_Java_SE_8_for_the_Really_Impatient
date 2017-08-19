package Chapter_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Excercise_9 {

	public static void main(String[] args) {

		Collection2<Integer> c = new ArrayList2<Integer>();
		c.add(100);
		c.add(101);
		Set<Integer> set = new HashSet<>();

		c.forEachIf(set::add, predicate -> predicate % 2 == 0);
		System.out.println(set);

	}

	interface Collection2<T> extends Collection<T> {

		default void forEachIf(Consumer<T> action, Predicate<T> filter) {

			forEach(e -> {

				if (filter.test(e))
					action.accept(e);
			});
		}
	}

	static class ArrayList2<T> extends ArrayList<T> implements Collection2<T> {
	}

}