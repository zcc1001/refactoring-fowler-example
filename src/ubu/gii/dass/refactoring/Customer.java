package ubu.gii.dass.refactoring;

/**
* Tema  Refactorizaciones 
*
* Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones gen�ricas de java 1.5
*
* @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
* @version 1.1
* @see java.io.File
*
*/
import java.util.*;

public class Customer {
	private String _name;
	private List<Rental> _rentals;

	public Customer(String name) {
		_name = name;
		_rentals = new ArrayList<Rental>();

	};

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return _name;
	};

	public String statement() {
		return buildStatement(new TextStatement());
	}

	public String htmlStatement() {
		return buildStatement(new HtmlStatement());
	}

	public String buildStatement(Statement statement) {
		Iterator<Rental> rentals = _rentals.iterator();
		String result = statement.header(_name);
		while (rentals.hasNext()) {
			Rental each = rentals.next();
			result += statement.rentalStatement(each.getMovie().getTitle(),
					each._movie.getCharge(each.getDaysRented()));
		}
		result += statement.footer(getTotalCharge(), this.getTotalFrequentRenterPoints());
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		while (rentals.hasNext()) {
			Rental each = rentals.next();
			result += each._movie.getCharge(each.getDaysRented());
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		while (rentals.hasNext()) {
			Rental each = rentals.next();
			result += each._movie.getFrequentRenterPoints(each.getDaysRented());
		}
		return result;
	}

}
