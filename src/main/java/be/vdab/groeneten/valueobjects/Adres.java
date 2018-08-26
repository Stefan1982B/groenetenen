package be.vdab.groeneten.valueobjects;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.SafeHtml;

import be.vdab.groeneten.constraints.Postcode;

@Embeddable
public class Adres implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotBlank
	@SafeHtml
	private String straat;
	@NotBlank
	@SafeHtml
	private String huisNr;
	@NotNull
	@Postcode
	private int postcode;
	@NotBlank
	@SafeHtml
	private String gemeente;
	public String getStraat() {
		return straat;
	}
	public String getHuisNr() {
		return huisNr;
	}
	public int getPostcode() {
		return postcode;
	}
	public String getGemeente() {
		return gemeente;
	}
	public Adres(@NotBlank @SafeHtml String straat, @NotBlank @SafeHtml String huisNr,
			@NotNull @Range(min = 1000, max = 9999) int postcode, @NotBlank @SafeHtml String gemeente) {
		this.straat = straat;
		this.huisNr = huisNr;
		this.postcode = postcode;
		this.gemeente = gemeente;
	}
	
	protected Adres() {
		
	}
}
