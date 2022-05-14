// 744. Find Smallest Letter Greater Than Target
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int size = letters.length;
        for(int i=0; i< size; i++){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }
}
