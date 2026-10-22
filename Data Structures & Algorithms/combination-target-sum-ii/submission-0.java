class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // Step 1: Sort to handle duplicates
        backtrack(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] candidates, int target, int start, List<List<Integer>> ans, List<Integer> current) {
        // Base case: if target is met, add copy of current combination
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same recursion level to avoid duplicate combinations
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // If the current candidate exceeds the remaining target, stop searching this branch (since array is sorted)
            if (candidates[i] > target) {
                break;
            }

            // Include candidate
            current.add(candidates[i]);
            
            // Move to the next index (i + 1) because each number can only be used once
            backtrack(candidates, target - candidates[i], i + 1, ans, current);
            
            // Backtrack (remove element to try next path)
            current.remove(current.size() - 1);
        }
    }
}
