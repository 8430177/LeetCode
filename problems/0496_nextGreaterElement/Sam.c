/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElement(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int *p_arr = (int *)malloc(sizeof(int) * nums1Size);//����һ���ڴ棬������������
    int *p = p_arr;
    int i, j, k;

    *returnSize = nums1Size;
    for (i=0; i<nums1Size; i++)
    {
        //��nums2���ҵ���nums1[i]��ֵ��ȵ�ֵ���±�k
        for (j=0; j<nums2Size; j++)
        {
           if (nums1[i] == nums2[j]) 
           {
               k = j;
           }
        }
        
        for (j=k+1; j<nums2Size; j++)
        {
            if (nums1[i] < nums2[j])
            {
                *p_arr = nums2[j];
                break;
            }
        }
        if (j == nums2Size)
        {
            *p_arr = -1;
        }
        p_arr += 1;
    }
    return p;
    
}