import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Offer extends Applications {
	protected Private senderOfApplication;
	private boolean isCounterOffer;

	protected PropertyManager recipientOfApplication;
	private static final AtomicInteger offerID = new AtomicInteger(1);
	private boolean pmResponseToOffer;
	private boolean privateResponseToOffer;
	private boolean acceptanceVerified;

	protected Ad adSelected;

	public Offer(Private senderOfApplication, PropertyManager recipientOfApplication, Ad adSelected, double priceApplied, boolean withInstallments, String appComments) {
		super(senderOfApplication, recipientOfApplication, adSelected, priceApplied, withInstallments, appComments);

		this.isCounterOffer = false;
		this.pmResponseToOffer = false;
		this.privateResponseToOffer = false;
		this.acceptanceVerified = false;
	}

	public Boolean getIsCO(){
		return this.isCounterOffer;
	}

	public AtomicInteger getOfferID(){
		return this.offerID;
	}

	public Boolean getPMResponse(){
		return this.pmResponseToOffer;
	}

	public Boolean getPrivateResponse(){
		return this.privateResponseToOffer;
	}

	public Private getSenderOfApplication(){
		return this.senderOfApplication;
	}

	public PropertyManager getRecipientOfApplication(){
		return this.recipientOfApplication;
	}

	public Ad getAdSelected() { return this.adSelected;}

	/*public Offer createOffer() {
		
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
		
	}*/

	public boolean checkForOfferVerification() {
		System.out.println("Please verify this Offer(verify/cancel)");
		int whileFlag = -1;
		boolean answer = false;
		while (whileFlag != 0) {
			Scanner in = new Scanner(System.in);
			String verResponse = in.nextLine().toLowerCase();
			if (verResponse.equals("verify")) {
				answer = true;
				whileFlag = 0;
			} else if (verResponse.equals("cancel")) {
				answer = false;
				whileFlag = 0;
			} else {
				System.out.println("Type 'verify' or 'cancel'");
				whileFlag = 1;
			}
		}
		return answer;
	}
}
	/*public boolean checkForAvailableOffer() {
		
	}
	
	public Offer selectOffer() {
		
	}*/