class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //dummy����ָ��head
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int length=0;
        //����һ��������
        ListNode first=head;
        //����������
        while(head!=null){
            length++;
            head=head.next;
        }
        //����ĩβ��n����,length��һ��Ҫ�����ĸ���
        length -= n;
        first=dummy;
        //ֻҪlength����0����һֱ����ȥ��ֱ������Ŀ������
        while(length>0){
            length--;
            first=first.next;
        }
        //����Ҫɾ���Ľڵ�
        first.next=first.next.next;
        return dummy.next;
    }
}