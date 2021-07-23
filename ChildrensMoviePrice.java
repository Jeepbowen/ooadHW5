public class ChildrensMoviePrice extends RentalPriceStrategy{
    double thisAmount = 1.5;
    int daysRented;
    public ChildrensMoviePrice(int daysRented){
        this.daysRented = daysRented;
    }
    public double amount(){
        if(daysRented>3){
            thisAmount +=(daysRented-3)*1.5;
        }
        return thisAmount;
    }
}
