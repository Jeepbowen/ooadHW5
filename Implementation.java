public class Implementation {
    public static void main(String[] args) throws Exception {
        Customer cs1 = new Customer("HUANG");
        Movie mov1 = new Movie("A CLOCKWORK ORANGE",1);
        Movie mov2 = new Movie("APOCALYSE NOW",0);
        Movie mov3 = new Movie("HUMAN",2);
        Movie mov4 = new Movie("BLADE RUNNER",0);
        Movie mov5 = new Movie("GOOD WILL HUNTING",1);
        Movie mov6 = new Movie("RAGING BULL",2);
        Movie mov7 = new Movie("AMELLE",0);
        Rental ret1 = new Rental(mov1,3);
        Rental ret2 = new Rental(mov2,5);
        Rental ret3 = new Rental(mov3,5);
        Rental ret4 = new Rental(mov4,4);
        Rental ret5 = new Rental(mov5,2);
        Rental ret6 = new Rental(mov6,7);
        Rental ret7 = new Rental(mov7,10);
        cs1.addRental(ret1);
        cs1.addRental(ret2);
        cs1.addRental(ret3);
        cs1.addRental(ret4);
        cs1.addRental(ret5);
        cs1.addRental(ret6);
        cs1.addRental(ret7);
        System.out.println(cs1.statement());
    }
}
