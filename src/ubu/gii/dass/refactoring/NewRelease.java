package ubu.gii.dass.refactoring;

public class NewRelease implements Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		int frequentRenterPoints = 1;
		if (daysRented > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

}
