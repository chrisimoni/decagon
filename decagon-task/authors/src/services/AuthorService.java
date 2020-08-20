package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorService {
	public static List<String> getUsernames(int threshold) throws Exception {
		List<String> usernames = new ArrayList<>();

		// page number
		int pageNumber = 1;

		// Get Authors data from the API with page number passed as parameter
		LoadUserData data = new LoadUserData();
		List<UserData> users = data.getAuthorData(pageNumber);

		// Sort the data by submission count
		Collections.sort(users, (d1, d2) -> {
			return d2.getSubmissionCount() - d1.getSubmissionCount();
		});

		// retrieve usernames based on the threshold
		for (int i = 0; i < threshold; i++) {
			if(i >= users.size()) {
				break;
			}
			usernames.add(users.get(i).getUsername());
		}

		return usernames;
	}

	public static String getUsernameWithHighestCommentCount() throws Exception {
		int pageNumber = 1;
		// Get Authors data from the API with page number passed as parameter
		LoadUserData data = new LoadUserData();
		List<UserData> users = data.getAuthorData(pageNumber);

		// Sort the data by comment count
		Collections.sort(users, (d1, d2) -> {
			return d2.getCommemntCount() - d1.getCommemntCount();
		});
		
		//return the first record from the sorted list
		return users.get(0).getUsername();
	}

	public static List<String> getUsernamesSortedByRecordDate(int threshold) throws Exception {
		List<String> usernames = new ArrayList<>();

		// page number
		int pageNumber = 1;

		// Get Authors data from the API with page number passed as parameter
		LoadUserData data = new LoadUserData();
		List<UserData> users = data.getAuthorData(pageNumber);

		// Sort the data by date
		Collections.sort(users, (d1, d2) -> {
			return d1.getCreatedAt().compareTo(d2.getCreatedAt());
		});

		// retrieve usernames based on the threshold
		for (int i = 0; i < threshold; i++) {
			if(i >= users.size()) {
				break;
			}
			usernames.add(users.get(i).getUsername());
		}

		return usernames;
	}

}
