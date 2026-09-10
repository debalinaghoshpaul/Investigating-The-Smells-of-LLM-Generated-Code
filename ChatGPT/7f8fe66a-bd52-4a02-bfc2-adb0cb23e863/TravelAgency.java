import java.util.Scanner;

public class TravelAgency {

    private Scanner scanner;
    private Flight[] flights;
    private Hotel[] hotels;
    private Reservation[] reservations;

    public TravelAgency() {
        scanner = new Scanner(System.in);
        flights = new Flight[0];
        hotels = new Hotel[0];
        reservations = new Reservation[0];
    }

    public void addFlight(Flight flight) {
        Flight[] newFlights = new Flight[flights.length + 1];
        for (int i = 0; i < flights.length; i++) {
            newFlights[i] = flights[i];
        }
        newFlights[flights.length] = flight;
        flights = newFlights;
    }

    public void addHotel(Hotel hotel) {
        Hotel[] newHotels = new Hotel[hotels.length + 1];
        for (int i = 0; i < hotels.length; i++) {
            newHotels[i] = hotels[i];
        }
        newHotels[hotels.length] = hotel;
        hotels = newHotels;
    }

    public void addReservation(Reservation reservation) {
        Reservation[] newReservations = new Reservation[reservations.length + 1];
        for (int i = 0; i < reservations.length; i++) {
            newReservations[i] = reservations[i];
        }
        newReservations[reservations.length] = reservation;
        reservations = newReservations;
    }

    public Flight[] searchFlights(String origin, String destination, String departureDate, String returnDate) {
        Flight[] matchingFlights = new Flight[0];
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination) && flight.getDepartureDate().equals(departureDate) && flight.getReturnDate().equals(returnDate)) {
                Flight[] newMatchingFlights = new Flight[matchingFlights.length + 1];
                for (int i = 0; i < matchingFlights.length; i++) {
                    newMatchingFlights[i] = matchingFlights[i];
                }
                newMatchingFlights[matchingFlights.length] = flight;
                matchingFlights = newMatchingFlights;
            }
        }
        return matchingFlights;
    }

    public Hotel[] searchHotels(String destination, String checkInDate, String checkOutDate) {
        Hotel[] matchingHotels = new Hotel[0];
        for (Hotel hotel : hotels) {
            if (hotel.getDestination().equals(destination) && hotel.getCheckInDate().equals(checkInDate) && hotel.getCheckOutDate().equals(checkOutDate)) {
                Hotel[] newMatchingHotels = new Hotel[matchingHotels.length + 1];
                for (int i = 0; i < matchingHotels.length; i++) {
                    newMatchingHotels[i] = matchingHotels[i];
                }
                newMatchingHotels[matchingHotels.length] = hotel;
                matchingHotels = newMatchingHotels;
            }
        }
        return matchingHotels;
    }

    public Reservation bookFlight(Flight flight) {
        Reservation reservation = new Reservation(flight);
        addReservation(reservation);
        return reservation;
    }

    public Reservation bookHotel(Hotel hotel) {
        Reservation reservation = new Reservation(hotel);
        addReservation(reservation);
        return reservation;
    }

    public void cancelReservation(Reservation reservation) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i].equals(reservation)) {
                reservations[i] = null;
            }
        }
    }

    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();

        // Add some flights and hotels to the travel agency
        travelAgency.addFlight(new Flight("ORD", "LAX", "2023-06-01", "2023-06-08"));
        travelAgency.addFlight(new Flight("LAX", "JFK", "2023-06-10", "2023-06-17"));
        travelAgency.addHotel(new Hotel("LAX", "Hilton", "2023-06-01", "2023-06-08"));
        travelAgency.addHotel(new Hotel("JFK", "Marriott", "2023-06-10", "2023-06-17"));

        // Search for flights and hotels
        Flight[] matchingFlights = travelAgency.searchFlights("ORD", "JFK", "2023-06-01", "2023-06-17");
        Hotel[] matchingHotels = travelAgency.searchHotels("JFK", "2023-06-10", "2023-06-17");

        // Book a flight and hotel
        Reservation flightReservation = travelAgency.bookFlight(matchingFlights[0]);
        Reservation hotelReservation = travelAgency.bookHotel(matchingHotels[0]);

        // Cancel the hotel reservation
        travelAgency.cancelReservation(hotelReservation);

        // Print all reservations
        for (Reservation reservation : travelAgency.reservations) {
            if (reservation != null) {
                System.out.println(reservation);
            }
        }
    }
}

class Flight {

    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;

    public Flight(String origin, String destination, String departureDate, String returnDate) {
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    @Override
    public String toString() {
        return "Flight from " + origin + " to " + destination + " departing on " + departureDate + " and returning on " + returnDate;
    }
}

class Hotel {

    private String destination;
    private String name;
    private String checkInDate;
    private String checkOutDate;

    public Hotel(String destination, String name, String checkInDate, String checkOutDate) {
        this.destination = destination;
        this.name = name;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getDestination() {
        return destination;
    }

    public String getName() {
        return name;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Hotel " + name + " in " + destination + " from " + checkInDate + " to " + checkOutDate;
    }
}

class Reservation {

    private Flight flight;
    private Hotel hotel;

    public Reservation(Flight flight) {
        this.flight = flight;
    }

    public Reservation(Hotel hotel) {
        this.hotel = hotel;
    }

    public Flight getFlight() {
        return flight;
    }

    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Reservation) {
            Reservation other = (Reservation) o;
            return (flight != null && flight.equals(other.flight)) || (hotel != null && hotel.equals(other.hotel));
        }
        return false;
    }

    @Override
    public String toString() {
        if (flight != null) {
            return flight.toString();
        } else {
            return hotel.toString
