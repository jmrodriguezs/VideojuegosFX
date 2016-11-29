package ch.makery.address.model;

import java.time.LocalDate;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ch.makery.address.util.LocalDateAdapter;

/**
 * Model class for a Person.
 *
 * @author Jose Manuel Rodriguez
 */
public class Juego {

	private final StringProperty firstName;
	private final StringProperty lastName;
	private final StringProperty plataformas;
	private final IntegerProperty clasificacion;
	private final StringProperty genero;
	private final FloatProperty precio;

	/**
	 * Default constructor.
	 */
	public Juego() {
		this(null, null);
	}
	
	/**
	 * Constructor with some initial data.
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Juego(String firstName, String lastName) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		
		// Some initial dummy data, just for convenient testing.
		this.plataformas = new SimpleStringProperty("plataforma");
		this.clasificacion = new SimpleIntegerProperty(12);
		this.genero = new SimpleStringProperty("genero");
		this.precio = new SimpleFloatProperty();
	}
	
	public String getFirstName() {
		return firstName.get();
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}
	
	public StringProperty firstNameProperty() {
		return firstName;
	}

	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	
	public StringProperty lastNameProperty() {
		return lastName;
	}

	public String getStreet() {
		return plataformas.get();
	}

	public void setStreet(String street) {
		this.plataformas.set(street);
	}
	
	public StringProperty streetProperty() {
		return plataformas;
	}

	public int getPostalCode() {
		return clasificacion.get();
	}

	public void setPostalCode(int postalCode) {
		this.clasificacion.set(postalCode);
	}
	
	public IntegerProperty postalCodeProperty() {
		return clasificacion;
	}

	public String getCity() {
		return genero.get();
	}

	public void setCity(String city) {
		this.genero.set(city);
	}
	
	public StringProperty cityProperty() {
		return genero;
	}

	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public float getBirthday() {
		return precio.get();
	}

	public void setBirthday(float birthday) {
		this.precio.set(birthday);
	}
	
	public FloatProperty birthdayProperty() {
		return precio;
	}
}