import java.time.LocalDateTime;

public class Review {

	private int numberOfStars;
	private String description;
	private float rating;
	private boolean published;
	private LocalDateTime dateReviewed;
	
	public Review(int numberOfStars, String description, float rating, boolean published, LocalDateTime dateReviewed) {
		this.numberOfStars = numberOfStars;
		this.description = description;
		this.rating = rating;
		this.published = published;
		this.dateReviewed = dateReviewed;
	}
	
	public Review addReview() {
	
	}
	
	public Review modifyReview() {
	
	}
	
	public boolean checkForReviews() {
	
	}