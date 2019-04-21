int findMaxConsecutiveOnes(int* nums, int numsSize) 
{
    int record_1 = 0;//��¼1���ֵĴ���
    int last_record_1 = 0;//��¼ͳ�ƹ�������һ��1���ֵĴ���
    int i = 0;
    
    for (i=0; i<numsSize; i++)
    {
        if (nums[i] != 0)
        {
            record_1++;
        }
        else if (record_1 >= last_record_1)
        {
            last_record_1 = record_1;
            record_1 = 0;
        }
        else if (record_1 < last_record_1)
        {
            record_1 = 0;
        }
    }
    return (record_1 > last_record_1?record_1:last_record_1);
}