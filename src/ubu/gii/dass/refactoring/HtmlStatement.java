package ubu.gii.dass.refactoring;

public class HtmlStatement extends Statement {

	@Override
	String header(String name) {
		return "<h1>Rental Record for " + name + "</h1>\n";
	}

	@Override
	String rentalStatement(String title, double charge) {
		return "<h2>" + title + " " + String.valueOf(charge) + "</h2>\n";
	}

	@Override
	String footer(double totalAmount, int frequentRenterPoints) {
		return "<p>Amount owed is " + String.valueOf(totalAmount) + "</p>\n" + "<p> You earned "
				+ String.valueOf(frequentRenterPoints) + " frequent renter points </p>\n";
	}

}