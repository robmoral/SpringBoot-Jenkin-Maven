class Solution {
    public int compareVersion(String version1, String version2) {
        if(version1.equals(version2)) return 0;
		
  		String[] first = version1.split("\\.");
		String[] second = version2.split("\\.");

		int i = 0;
		int j = 0;
		
		while (i < first.length || j < second.length) {

			int x = i < first.length ? Integer.valueOf(first[i]) : 0;
			int y = j < second.length ? Integer.valueOf(second[j]) : 0;

			if (x == y) {
				i++;
				j++;
				continue;
			}

			return x > y ? 1 : -1;

		}
		return 0;
    }
}
