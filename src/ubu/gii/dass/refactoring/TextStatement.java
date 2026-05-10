package ubu.gii.dass.refactoring;

public class TextStatement extends Statement {

	@Override
	String header(String name) {
		return "Rental Record for " + name + "\n";
	}

	@Override
	String rentalStatement(String title, double charge) {
		return "\t" + title + "\t" + String.valueOf(charge) + "\n";
	}

	@Override
	String footer(double totalAmount, int frequentRenterPoints) {
		return "Amount owed is " + String.valueOf(totalAmount) + "\n" + "You earned "
				+ String.valueOf(frequentRenterPoints) + " frequent renter points";
	}

}