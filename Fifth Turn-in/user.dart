class User {

  // Attributes

  String username;
  String password;
  String email;
  String phoneNumber;
  DateTime dateOfRegistration;

  // Methods

  User({ this.username, this.password, this.email, this.phoneNumber, this.dateOfRegistration }); // Constructor

}

class Private extends User{

  // Attributes

  int numberOfReviews;
  int numberOfPublishedReviews;
  List<Ad> reportedAds;

  // Methods

  Private({ String username, String password, String email, String phoneNumber, DateTime dateOfRegistration, this.numberOfReviews, this.numberOfPublishedReviews, this.reportedAds }) :
        super(username: username, password: password, email: email, phoneNumber: phoneNumber, dateOfRegistration: dateOfRegistration);

  void requestOfferVerification(){

  }

  void acceptDeal(){

  }

}