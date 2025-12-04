package com.movie.tester;

import java.util.Scanner;

import com.movie.services.serviceImplementation;

public class TestMovie {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			serviceImplementation obj = new serviceImplementation();
			boolean exit = false;
			while (!exit) {
				System.out.println("-------Options--------");
				System.out.println("Enter choice");
				System.out.println("1.AddMovie");
				System.out.println("2.Display");
				System.out.println("3.Remove");
				System.out.println("4.Update Date");
				System.out.println("5.Search Movie");
				System.out.println("6.Display by Ratings");

				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println("Add Movie");
						System.out.println("Enter movieId");
						int movieId = sc.nextInt();
						System.out.println("Enter movieName");
						String movieName = sc.next();
						System.out.println("Enter ratings");
						double ratings = sc.nextDouble();
						System.out.println("Enter movieType");
						String movieType = sc.next();
						System.out.println("Enter date: yyyy-mm-dd");
						String date = sc.next();
						System.out.println("Enter inCinemas");
						boolean inCinemas = sc.nextBoolean();

						obj.addMovie(movieId, movieName, ratings, movieType, date, inCinemas);

						break;
					}

				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
