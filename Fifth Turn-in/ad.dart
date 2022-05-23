class Ad {

  // Attributes

  String title;
  String adType;
  String description;
  List<String> photos;
  List<String> videos;
  DateTime dateOfUpload;
  double price;
  double brokerageFee;
  List<User> reportedBy;
  List<Private> likedBy;
  bool tour360Availability;
  bool virtualTourAvailability;

  // Methods

  Ad({ this.title, this.adType, this.description, this.photos, this.videos, this.dateOfUpload, this.price, this.brokerageFee, this.reportedBy, this.likedBy, this.tour360Availability, this.virtualTourAvailability }) // Constructor

  bool searchInReported(){

  }

  bool availableProperty(){

  }

  bool markAsReported(){

  }

  bool markAsFavorite(){

  }

  bool checkVirtualTourAvailability(){

  }

  bool checkTour360Availability(){

  }

}