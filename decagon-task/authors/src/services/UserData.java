package services;

import java.util.Date;

public class UserData {
	private int id;
	private String username;
	private String about;
	private int submitted;
	private String updatedAt;
	private int submissionCount;
	private int commemntCount;
	private Date createdAt;
	
	

	public UserData(int id, String username, String about, int submitted, String updatedAt, int submissionCount,
			int commemntCount, Date createdAt) {
		this.id = id;
		this.username = username;
		this.about = about;
		this.submitted = submitted;
		this.updatedAt = updatedAt;
		this.submissionCount = submissionCount;
		this.commemntCount = commemntCount;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public int getSubmitted() {
		return submitted;
	}

	public void setSubmitted(int submitted) {
		this.submitted = submitted;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getSubmissionCount() {
		return submissionCount;
	}

	public void setSubmissionCount(int submissionCount) {
		this.submissionCount = submissionCount;
	}

	public int getCommemntCount() {
		return commemntCount;
	}

	public void setCommemntCount(int commemntCount) {
		this.commemntCount = commemntCount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", username=" + username + ", about=" + about + ", submitted=" + submitted
				+ ", updatedAt=" + updatedAt + ", submissionCount=" + submissionCount + ", commemntCount="
				+ commemntCount + ", createdAt=" + createdAt + ", getId()=" + getId() + ", getUsername()="
				+ getUsername() + ", getAbout()=" + getAbout() + ", getSubmitted()=" + getSubmitted()
				+ ", getUpdatedAt()=" + getUpdatedAt() + ", getSubmissionCount()=" + getSubmissionCount()
				+ ", getCommemntCount()=" + getCommemntCount() + ", getCreatedAt()=" + getCreatedAt() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
