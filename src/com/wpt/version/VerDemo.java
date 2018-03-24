package com.wpt.version;

public class VerDemo {

	public static void main(String[] args) {
		String newValue = "6.2.4.0";
		String oleValue = "6.12.4.0";
		
		int result = compareVersion(oleValue, newValue);
		System.out.println("result=" + result);
		
	}
	
	
	public static int compareTo(String newValue,String oleValue) {
        int len1 = oleValue.length();
        int len2 = newValue.length();
        int lim = Math.min(len1, len2);
        char v1[] = oleValue.toCharArray();
        char v2[] = newValue.toCharArray();

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }
	private static int compareVersion(String lhs, String rhs) {
        if (lhs == rhs || lhs.equals(rhs)) {
            return 0;
        } else {
            String[] leftStrVersions = lhs.split("\\.");
            String[] rightStrVersions = rhs.split("\\.");
            int minLength = Math.min(leftStrVersions.length, rightStrVersions.length);
            long leftVersion, rightVersion;
            for (int i = 0; i < minLength; i++) {
                leftVersion = Long.parseLong(leftStrVersions[i]);
                rightVersion = Long.parseLong(rightStrVersions[i]);
                if (leftVersion == rightVersion) {
                    continue;
                } else {
                    return leftVersion - rightVersion > 0 ? 1 : -1;
                }
            }
        }

        return 0;
    }
}
