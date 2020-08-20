package authors;

import java.util.List;

import services.AuthorService;

public class Authors {

	public static void main(String[] args) throws Exception {
		int threshold = 5;
		//The list of most active authors according to a set threshold
		List<String> usernames = AuthorService.getUsernames(threshold);
				
		//The author with the highest comment count
		String authorWithHighestCount = AuthorService.getUsernameWithHighestCommentCount();
		
		//The list of the authors sorted by when their record was created according to a set threshold
		List<String> sortedAuthorsByDate = AuthorService.getUsernamesSortedByRecordDate(threshold);
		
		System.out.println(usernames);
		System.out.println(authorWithHighestCount);
		System.out.println(sortedAuthorsByDate);
	}

}
