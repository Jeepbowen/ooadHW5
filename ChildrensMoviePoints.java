public class ChildrensMoviePoints extends RentalPointStrategy{
    int rentdays;
    public ChildrensMoviePoints(int rentdays){
        this.rentdays = rentdays;
    }
    public int amountPoints(){
        return 1;
    }
}
