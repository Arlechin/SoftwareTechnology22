import java.time.LocalDateTime;

public class Agreement {

	private Boolean haveAgreed;
	private float priceAgreed;
	private Ad adSelected;
	private LocalDateTime dateAgreed;
	private PropertyManager party;

	public Agreement(Boolean haveAgreed, float priceAgreed, Ad adSelected, LocalDateTime dateAgreed) {
		this.dateAgreed = dateAgreed;
		this.priceAgreed = priceAgreed;
		this.adSelected = adSelected;
		this.priceAgreed = priceAgreed;
	}

	public void checkForAgreement() {

	}

	public void mentionOnAgreement() {

	}
}