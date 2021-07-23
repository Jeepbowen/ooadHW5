public class CalculatePoint {
    private RentalPointStrategy rentalstrategy;
    public int getPoints(){
        return rentalstrategy.amountPoints();
    }
    public void setRentalstrategy(RentalPointStrategy rentalstrategy){
        this.rentalstrategy = rentalstrategy;
    }
}
