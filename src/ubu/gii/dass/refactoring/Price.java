package ubu.gii.dass.refactoring;

public interface Price {
	public int getPriceCode();
	public double getCharge(int daysRented);
	public int getFrequentRenterPoints(int daysRented);
}
