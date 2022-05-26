public class DraftMessage {

    // Attributes

    private String category;
    private String body;
    private Private sender;
    private PropertyManager recipient;

    public DraftMessage(String category, String body, Private sender, PropertyManager recipient){
        this.category = category;
        this.body = body;
        this.sender = sender;
        this.recipient = recipient;
    } // Constructor

    // Methods

  /*public DraftMessage checkForDraft(){
    return DraftMessage();
  }*/

    public void saveDraftMessage(){

    }
}
