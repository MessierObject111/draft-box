package week60.sentenceSimilarity;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words1 = {"great", "acting", "skills"};
		String[] words2 = {"fine", "drama", "talent"};
		String[][] pairs = {{"great", "fine"}, {"acting","drama"}, {"skills","talent"}};
		
		String[] w1 = {};
		String[] w2 = {};
		String[][] p = {{"great","good"},{"extraordinary","good"},{"well","good"},{"wonderful","good"},
				{"excellent","good"},{"fine","good"},{"nice","good"},{"any","one"},{"some","one"},
				{"unique","one"},{"the","one"},{"an","one"},{"single","one"},{"a","one"},{"truck","car"},
				{"wagon","car"},{"automobile","car"},{"auto","car"},{"vehicle","car"},{"entertain","have"},
				{"drink","have"},{"eat","have"},{"take","have"},{"fruits","meal"},{"brunch","meal"},
				{"breakfast","meal"},{"food","meal"},{"dinner","meal"},{"super","meal"},{"lunch","meal"},
				{"possess","own"},{"keep","own"},{"have","own"},{"extremely","very"},{"actually","very"},
				{"really","very"},{"super","very"}};
		Solution s = new Solution();
		System.out.print(s.areSentencesSimilar(w1, w2, p));
		
	}

}
