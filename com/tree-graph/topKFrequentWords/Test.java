package priorityQueue.topKFrequentWords;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		TopKFrequentWords tk = new TopKFrequentWords();
		List<String> result = tk.topKFrequent2(words, 4);
		for(String s : result) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		String[] words2 = {"i", "love", "leetcode", "i", "love", "coding"};
		List<String> result2 = tk.topKFrequent2(words2, 2);
		for(String s : result2) {
			System.out.print(s + " ");
		}
		System.out.println();

	}

}
