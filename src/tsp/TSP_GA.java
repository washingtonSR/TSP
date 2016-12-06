/*
* TSP_GA.java
* Create a tour and evolve a solution
*/

package tsp;

import model.City;

public class TSP_GA {

    public static void main(String[] args) {

        // Create and add our cities
        City city = new City("Natal", -5.77f , -35.200f);
        TourManager.addCity(city);
        City city2 = new City("Parnamirim", -5.91f, -35.27f);
        TourManager.addCity(city2);
        City city3 = new City("Macaíba", -5.85f, -35.35f);
        TourManager.addCity(city3);
        City city4 = new City("São Gonçalo do Amarante", -5.78f, -35.32f);
        TourManager.addCity(city4);
        City city5 = new City("São José de Mipibu", -6.07f, -35.24f);
        TourManager.addCity(city5);

        // Initialize population
        Population pop = new Population(50, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());

        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
    }
}