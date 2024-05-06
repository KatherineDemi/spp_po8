package Task2;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.time.ZoneId;


public class Airline {
    private List<Flight> flights;

    public Airline(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public void addFlights(Flight flight) {
        flights.add(flight);
    }

    public void deleteFlight(Flight flight) {
        flights.remove(flight);
    }

    public void printListOfFlights() {
        flights.forEach(System.out::println);
    }

    public void printListOfFlightsForSelectedDestination(String destination) {
        flights.stream()
                .filter(flight -> flight.getDestination().equals(destination))
                .forEach(System.out::println);
    }

    public void printListOfFlightsForSelectedDay(DayOfWeek dayOfWeek) {
        flights.stream()
                .filter(flight -> flight.getDaysOfTheWeek().contains(dayOfWeek))
                .forEach(System.out::println);
    }

    public void printListOfFlightsForSelectedDayAndTime(DayOfWeek dayOfWeek, Date date) {
        if (date != null) {
            LocalDateTime dateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            flights.stream()
                    .filter(flight -> flight.getDaysOfTheWeek().contains(dayOfWeek))
                    .filter(flight -> flight.getDepartureTime().isBefore(dateTime))
                    .forEach(System.out::println);
        }
    }

    public void printListOfFlightsForSelectedType(TypeOfAircraft typeOfAircraft) {
        flights.stream()
                .filter(flight -> flight.getTypeOfAircraft().equals(typeOfAircraft))
                .forEach(System.out::println);
    }
}
