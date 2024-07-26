class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineCount = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineCount.containsKey(c) || magazineCount.get(c) == 0) {
                return false;
            }
            magazineCount.put(c, magazineCount.get(c) - 1);
        }

        return true;
    }
}