public class NewReleaseMoviePoints extends RentalPointStrategy {
    int points = 1;
    int rentdays;
    public NewReleaseMoviePoints(int rentdays){
        this.rentdays = rentdays;
    }
    public int amountPoints(){
        if(rentdays>1){
            points++;
        }
        return points;
    }

}
