public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double computeRentalPrice() {
        double thisAmount = 0;
        CalculatePrice cp = new CalculatePrice();
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                cp.setRentalstrategy(new RegularMoviePrice(getDaysRented()));
                thisAmount += cp.amount();
                break;
            case Movie.NEW_RELEASE:
                cp.setRentalstrategy(new NewReleaseMoviePrice(getDaysRented()));
                thisAmount += cp.amount();
                break;
            case Movie.CHILDRENS:
                cp.setRentalstrategy(new ChildrensMoviePrice(getDaysRented()));
                thisAmount += cp.amount();
                break;
        }
        return thisAmount;
    }
    public int computeRentalPoint(){
        int frequentRenterPoints = 0;
        CalculatePoint cp = new CalculatePoint();
        switch (getMovie().getPriceCode()){
            case Movie.REGULAR:
                cp.setRentalstrategy(new RegularMoviePoints(getDaysRented()));
                frequentRenterPoints +=cp.getPoints();
                break;
            case Movie.CHILDRENS:
                cp.setRentalstrategy(new ChildrensMoviePoints(getDaysRented()));
                frequentRenterPoints +=cp.getPoints();
                break;
            case Movie.NEW_RELEASE:
                cp.setRentalstrategy(new NewReleaseMoviePoints(getDaysRented()));
                frequentRenterPoints +=cp.getPoints();
                break;
        }
        return frequentRenterPoints;
    }
}
