class MovieTicket {
    // Private variables
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    // Getters
    public String getMovieName() {
        return movieName;
    }

    public double getTotalPrice() {
        double totalCost = ticketPrice * numberOfTickets;

        if (numberOfTickets >= 5) {
            totalCost = totalCost - (totalCost * 5 / 100); // 5% discount
        }

        return totalCost;
    }
}

public class ClassAss2{
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();

        mt.setMovieName("Avengers: Endgame");
        mt.setTicketPrice(200);
        mt.setNumberOfTickets(6);

        System.out.println("Movie Name: " + mt.getMovieName());
        System.out.println("Total Price: " + mt.getTotalPrice());
    }
}
//public class ClassAss2 {

//}
