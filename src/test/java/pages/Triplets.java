package pages;
import java.util.*;

public class Triplets {
	

		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the array size and elements
	        System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();
	        System.out.println("Enter " + size + " numbers:");
	        int[] nums = new int[size];
	        for (int i = 0; i < size; i++) {
	            nums[i] = scanner.nextInt();
	        }

	        // Call the method to find triplets
	        List<List<Integer>> result = findThreeSum(nums);

	        // Print the result
	        System.out.println("Unique triplets that sum to 0:");
	        for (List<Integer> triplet : result) {
	            System.out.println(triplet);
	        }
	    }

	    public static List<List<Integer>> findThreeSum(int[] nums) {
	        List<List<Integer>> triplets = new ArrayList<>();
	        Set<String> seen = new HashSet<>(); // To track unique triplets

	        // Traverse through the array with three nested loops
	        for (int i = 0; i < nums.length - 2; i++) {
	            for (int j = i + 1; j < nums.length - 1; j++) {
	                for (int k = j + 1; k < nums.length; k++) {
	                    if (nums[i] + nums[j] + nums[k] == 0) {
	                        // Sort the triplet to ensure uniqueness
	                        int[] triplet = {nums[i], nums[j], nums[k]};
	                        Arrays.sort(triplet);
	                        String key = triplet[0] + "," + triplet[1] + "," + triplet[2];

	                        // Add only unique triplets to the result
	                        if (!seen.contains(key)) {
	                            triplets.add(Arrays.asList(triplet[0], triplet[1], triplet[2]));
	                            seen.add(key);
	                        }
	                    }
	                }
	            }
	        }

	        return triplets;
	    }
	}


