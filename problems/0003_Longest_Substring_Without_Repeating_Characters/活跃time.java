/**
 * Solution.java
 * top.actim.leetcode._3_Longest_Substring_Without_Repeating_Characters
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2019��4��8�� 		a
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
*/

package top.actim.leetcode._3_Longest_Substring_Without_Repeating_Characters;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MySolution {
	public static void main(String[] args) {
		Solution solution = new Solution();

		int res = solution.lengthOfLongestSubstring("abcabcbb");
		System.out.println(res);

		res = solution.lengthOfLongestSubstring("bbbbbb");
		System.out.println(res);

		res = solution.lengthOfLongestSubstring("pwwkew");
		System.out.println(res);

		res = solution.lengthOfLongestSubstring("abcdbcadf");
		System.out.println(res);

	}
}

class Solution {
	public int lengthOfLongestSubstring(String s) {
		// ��Hash�����ظ� List����˳��
		LinkedHashSet<Character> temp = new LinkedHashSet<Character>();
		// ���ַ���ת��Ϊ����
		char[] charArr = s.toCharArray();
		// ���
		int result = 0;

		for (char c : charArr) {

			// ��¼���Ȳ��Ƴ��ظ�����
			if (temp.contains(c)) {
				if (temp.size() > result)
					result = temp.size();
				for (Iterator<Character> iterator = temp.iterator(); iterator.hasNext();) {
					char ch = iterator.next();
					iterator.remove();
					if (ch == c) {
						break;
					}
				}
			}

			// ���뻺����
			temp.add(c);

		}

		// ��󳤶�
		if (temp.size() > result)
			result = temp.size();

		return result;
	}
}
