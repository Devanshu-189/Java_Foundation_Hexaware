package com.hexaware.vis.entities;

public class Review {
    private int reviewId;
    private int userId;
    private int policyId;
    private String feedback;
    private int rating;

    public Review() {}

    public Review(int reviewId, int userId, int policyId, String feedback, int rating) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.policyId = policyId;
        this.feedback = feedback;
        this.rating = rating;
    }

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

    @Override
    public String toString() {
        return "Review{" + "reviewId=" + reviewId + ", userId=" + userId + ", policyId=" + policyId + ", rating=" + rating + '}';
    }
}
