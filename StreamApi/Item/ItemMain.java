package StreamApi.Item;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemMain {
	public static void main(String[] args) {

		List<Item> l = new ArrayList<>();
		l.add(new Item(101, "soap", LocalDateTime.of(2019, 5, 3, 4, 30), LocalDateTime.of(2021, 3, 26, 9, 27),
				100));
		l.add(new Item(102, "shampoo", LocalDateTime.of(2020, 5, 20, 8, 00),
				LocalDateTime.of(2021, 5, 20, 8, 00), 2500));
		l.add(new Item(103, "facewash", LocalDateTime.of(2021, 7, 21, 7, 20), LocalDateTime.of(2022, 7, 21, 7, 20),
				800));
		l.add(new Item(104, "cream", LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37),
				2500));
		l.add(new Item(105, "facemask", LocalDateTime.of(2019, 9, 12, 6, 37),
				LocalDateTime.of(2020, 9, 12, 6, 37), 2000));
		l.add(new Item(106, "massager", LocalDateTime.of(2019, 9, 12, 6, 37), null, 1000));

		System.out.println("Find average of the given price of item");

		float price = (float) l.stream().mapToDouble(Item::getPrice).average().orElse(Double.NaN);
		System.out.println(price);

		System.out.println("Find the highest price of the given item");

		Item max = l.stream().map(v -> v).max(Comparator.comparing(Item::getPrice))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(max);

		System.out.println("Find the lowest price of the given item");

		Item min = l.stream().map(v -> v).min(Comparator.comparing(Item::getPrice))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(min);

		System.out.println("Find the item thoes have not Expiry date");

		List<Item> list = l.stream().filter(v -> v.getDoe() == null).collect(Collectors.toList());
		System.out.println(list);

		System.out.println("store the name and price from list to set");

		Set<Item> value = l.stream().map(a -> new Item(a.getIname(), a.getPrice()))
				.collect(Collectors.toSet());
		for (Item i : value) {
			System.out.println(i.getIname() + " " + i.getPrice());
		}

		System.out.println("remove duplicate price from list of item");

		l.stream().map(s -> s.getPrice()).distinct().forEach(System.out::println);
	}


}
