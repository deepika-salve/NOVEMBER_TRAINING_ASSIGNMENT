package collection.Q8;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q8TestMain {

	public static void printhighestProductionPerDay(List<ProductionFacility> pflist) {
		int sum = 0;
		int avr = 0;
		int countofdays = 0;
		for (ProductionFacility pf : pflist) {
			sum = sum + pf.getTotalproduction_perday();
			countofdays++;
		}

		avr = sum / countofdays;
		for (ProductionFacility pf : pflist) {
			if (avr < pf.getTotalproduction_perday())
				System.out.println("the facility with highest production is :" + pf);
		}
	}

	public static void printProductionFacilityByName(String name, List<ProductionFacility> ls) {

		for (ProductionFacility pf : ls) {
			if ( name.equals(pf.getPro_facility_name()))
				System.out.println("\nDetail of facility on the basis of names " + name + " is :" + pf);

		}

	}

	public static void printProductionFacilityHighestItems(List<ProductionFacility> ls) {
		
		ProductionFacility maxValue = ls.stream().max(Comparator.comparing(v -> v.getTotalproduction_perday())).get();
       System.out.println("facility is producing highest items is:"+maxValue);


	}

	public static void main(String[] args) {
		String[] itemlist1 = { "comb", "hair oil", "shampoo" };
		String[] itemlist2 = { "soap", "surf", "liquid soap" };
		String[] itemlist3 = { "pillow", "bed sheet", "door mate" };

		List<ProductionFacility> pflist = new ArrayList<>();

		ProductionFacility p1day1 = new ProductionFacility(1, "Future Images", "indore", 5000, itemlist1,
				LocalDate.of(2014, Month.JANUARY, 1));
		ProductionFacility p1day2 = new ProductionFacility(2, "Future Images", "indore", 2, itemlist1,
				LocalDate.of(2014, Month.JANUARY, 2));
		ProductionFacility p1day3 = new ProductionFacility(3, "Future Images", "indore", 4, itemlist1,
				LocalDate.of(2014, Month.JANUARY, 3));
		pflist.add(p1day1);
		pflist.add(p1day2);
		pflist.add(p1day3);

		printhighestProductionPerDay(pflist);
		pflist.clear();

		ProductionFacility p2day1 = new ProductionFacility(4, "Easy Day Productions", "dewas", 4800, itemlist2,
				LocalDate.of(2014, Month.MARCH, 14));
		ProductionFacility p2day2 = new ProductionFacility(5, "Easy Day Productions", "dewas", 5800, itemlist2,
				LocalDate.of(2014, Month.MARCH, 15));
		ProductionFacility p2day3 = new ProductionFacility(6, "Easy Day Productions", "dewas", 3000, itemlist2,
				LocalDate.of(2014, Month.MARCH, 16));

		pflist.add(p2day1);
		pflist.add(p2day2);
		pflist.add(p2day3);

		printhighestProductionPerDay(pflist);
		pflist.clear();

		ProductionFacility p3day1 = new ProductionFacility(7, "Curtains", "mahu", 6000, itemlist3,
				LocalDate.of(2015, Month.MAY, 23));
		ProductionFacility p3day2 = new ProductionFacility(8, "Curtains", "mahu", 8000, itemlist3,
				LocalDate.of(2015, Month.MAY, 24));
		ProductionFacility p3day3 = new ProductionFacility(9, "Curtains", "mahu", 7890, itemlist3,
				LocalDate.of(2015, Month.MAY, 25));

		pflist.add(p3day1);
		pflist.add(p3day2);
		pflist.add(p3day3);
		printhighestProductionPerDay(pflist);
		pflist.clear();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of facility : ");
		String name = scanner.next();

		pflist.add(p1day1);
		pflist.add(p1day2);
		pflist.add(p1day3);
		pflist.add(p2day1);
		pflist.add(p2day2);
		pflist.add(p2day3);
		pflist.add(p3day1);
		pflist.add(p3day2);
		pflist.add(p3day3);
		printProductionFacilityByName(name, pflist);
		printProductionFacilityHighestItems(pflist);
		
		System.out.println("Print production detail of each facility on the basis of production date."+ pflist);

	}

}
