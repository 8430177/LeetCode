class Solution {
    public boolean isPalindrome(int x) {
        //���еĸ��������ǻ�����
        //ĩβ��0����Ҳ���ǣ���0�⣩
        if( x<0 || x%10==0 && x!=0 ){
            return false;
        }
        //ȡx�ĺ���ֵ��ǰ��αȽ��Ƿ���ͬ
        //������ֵ����ǰ���ֵʱ�͵��������м�λ��
        int revertedNumber=0;
        while(x>revertedNumber){
            //ÿ�κ��ε�����ҪrevertedNumber*10+x%10��ֵ
            revertedNumber = revertedNumber*10 + x%10;
            //ÿ��x��Ҫ����10
            x /= 10;
        }
        //�жϺ��κ�ǰ���
        //���ǻ���ʱȥ���м�λ��
        return x==revertedNumber || x==revertedNumber/10;
    }
}