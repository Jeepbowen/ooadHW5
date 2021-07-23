public class CalculatePrice {
    private RentalPriceStrategy rentalstrategy;

    public double amount(){
        return rentalstrategy.amount();
    }

    public void setRentalstrategy(RentalPriceStrategy rentalstrategy){
        this.rentalstrategy = rentalstrategy;
    }
}
