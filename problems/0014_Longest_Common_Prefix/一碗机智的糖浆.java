class Solution {
    //��һ��oflower flow�أ�
    //���������Ҫ���ҹ���ǰ׺���Կ���һֱ��ȥĩβ���ַ�������
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            //ѭ����ѭ��
            //str1.indexOf(str2)ֻҪstr1�в�����str2�ͷ���-1,ֻҪ�����˾ͷ�����������
            //���ﷵ��0����˵str2��ȫ��str1��ǰ��ļ�������һ��
            while (strs[i].indexOf(prefix) != 0) {
                //ÿ��ȥ��str2��һ��ĩβ�ַ���Ѱ�Һ�str1ͷ����ȫһ�µ��ַ���
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            } 
        }
        return prefix;   
    }
}