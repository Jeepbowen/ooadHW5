public class RegularMoviePrice extends RentalPriceStrategy{
    double thisAmount = 2;
    int daysRented;
    public RegularMoviePrice(int daysRented){
        this.daysRented = daysRented;
    }
    public double amount(){
        if(daysRented>2){
            thisAmount +=(daysRented-2)*1.5;
        }
        return thisAmount;
    }
}
