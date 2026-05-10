package ubu.gii.dass.refactoring;

public abstract class Statement {

	abstract String header(String name);

	abstract String rentalStatement(String title, double charge);

	abstract String footer(double totalAmount, int frequentRenterPoints);
}