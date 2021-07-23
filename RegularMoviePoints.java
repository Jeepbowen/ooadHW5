public class RegularMoviePoints extends RentalPointStrategy {
    int rentdays;
    public RegularMoviePoints(int rentdays){
        this.rentdays = rentdays;
    }
    public int amountPoints(){
        return 1;
    }
}
