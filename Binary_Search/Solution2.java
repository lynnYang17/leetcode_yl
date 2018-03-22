class Solution2 {
	public static void main(String[] args){
		Solution2 s2 = new Solution2();
		char[] letters = {'c', 'f', 'j'};
		char target = 'd';
		System.out.println(s2.nextGreatestLetter(letters,target));
	}

    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (letters[mi] <= target) lo = mi + 1;
            else hi = mi;
        }
        return letters[lo % letters.length];
    }
}
