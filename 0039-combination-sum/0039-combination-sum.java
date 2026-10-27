class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> result = new ArrayList<>();

      combinationSum(0,candidates, target, new ArrayList<>(), result);
       return result; 
    }
    public void combinationSum(int i, int[] candidates, int target, List<Integer> list, 
    List<List<Integer>> result){
    if(i==candidates.length){
        if(target ==0){
    result.add(new ArrayList<>(list));
    }
    return ;
    }
    if(candidates[i]<=target){
        list.add(candidates[i]);

        combinationSum(i, candidates, target-candidates[i], list, result);
        list.remove(list.size()-1);
    }
    combinationSum(i+1, candidates, target, list, result);
}
}