class Solution {
    public int reverse(int x) {
        //�з���λ��ֵ��ΧΪ [?231,  231 ? 1]
        //һ�ι�����ת������һλ���֡�����������ʱ�����ǿ���Ԥ�ȼ����ԭ����������һλ�����Ƿ�ᵼ�������
        int rev = 0;
        while (x != 0) {
            //ȡ��x��ĩβ����256��6
            int pop = x % 10;
            //x/10��25
            x /= 10;
            //�ж������Ƿ����Integer.MAX_VALUE/10�������˾Ͳ�����10�ˣ��Լ����λ�������ֵ��λ7����Сֵ8��Ĳ��
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            //��������10�����ټӸ�λ
            rev = rev * 10 + pop;
        }
        return rev;
    }
}