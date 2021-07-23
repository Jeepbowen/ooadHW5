public class NewReleaseMoviePrice extends RentalPriceStrategy{
    double thisAmount = 0;
    int daysRented;
    public NewReleaseMoviePrice(int daysRented){
        this.daysRented = daysRented;
    }
    public double amount(){
        thisAmount +=daysRented*3;
        return thisAmount;
    }
}

