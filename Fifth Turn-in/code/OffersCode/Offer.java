import java.time.LocalDateTime;

public class Offer {

	private Application offerApplication;
	private PropertyManager offerComposer;
	private boolean isCounterOffer;
	private PropertyManager offerRecipient;
	private int offerID;
	private boolean pmResponseToOffer;
	private boolean privateResponseToOffer;
	private boolean acceptanceVerified;
	private Ad adSelected;
	
	public Offer(Application offerApplication, PropertyManager offerComposer, boolean isCounterOffer, PropertyManager offerRecipient, int offerID, boolean pmResponseToOffer, boolean privateResponseToOffer, boolean acceptanceVerified, Ad adSelected) {
		this.offerApplication = offerApplication;
		this.offerComposer = offerComposer;
		this.isCounterOffer = isCounterOffer;
		this.offerRecipient = offerRecipient;
		this.offerID = offerID;
		this.pmResponseToOffer = pmResponseToOffer;
		this.privateResponseToOffer = privateResponseToOffer;
		this.acceptanceVerified = acceptanceVerified;
		this.adSelected = adSelected;
	}
	
	public Offer createOffer() {
		
	}
	
	public boolean checkAcceptVerification() {
		
	}
	
	public boolean checkResponse() {
		
	}
	
	public boolean checkRequiredFields() {
		
	}
	
	public boolean checkRegistrationVerification() {
		
	}
	
	public boolean checkForApp() {
		
	}
	
	public boolean checkCORegistrationVerification() {
		
	}
	
	public boolean checkForOfferVerification() {
		
	}
	
	public boolean checkForAvailableOffer() {
		
	}
	
	public Offer selectOffer() {
		
	}