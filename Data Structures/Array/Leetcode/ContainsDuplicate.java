class Solution {
    public boolean containsDuplicate(int[] intArray) {
        Map<Integer, Integer> isUniqueOrDuplicate = new HashMap<>();
        
        for(int val : intArray) {
            isUniqueOrDuplicate.put(val,isUniqueOrDuplicate.getOrDefault(val , 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : isUniqueOrDuplicate.entrySet()) {
            if(entry.getValue() > 1) {
                return true;
            }
        }
        
        return false;
    }
}