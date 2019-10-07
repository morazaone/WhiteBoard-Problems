    //check my youtube page on my page juanmoraza.com
    public double medianOfSortedList(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int median1 = (m + n) / 2; //1
        int median2 = median1 - 1; //0
 
        int i = 0;
        int j = 0;
        int m1 = 0;
        int m2 = 0;
        int index = 0;
        double total = 0;

        boolean even = ((m + n) % 2 == 0);
        boolean inM = true;
        boolean inN = true;

        if (m == 0)
            inM = false;
        if (n == 0)
            inN = false;

        

        while (true) {

            if (inM && inN && nums1[i] <= nums2[j]) {

               
                if (index == median2) {
                    m2 = nums1[i];
                }
                 if (index == median1) {
                    m1 = nums1[i];
                    break;
                }
                i++;
                if (i >= m) 
                    inM = false;
                

            } else if (inM && inN && nums1[i] > nums2[j]) {
              
                if (index == median2)
                    m2 = nums2[j];
                   if (index == median1) {
                    m1 = nums2[j];
                    break;
                }
                j++;

                if (j >= n)
                    inN = false;
            } else if (j < n) {
               
                if (index == median2)
                    m2 = nums2[j];
                  if (index == median1) {
                    m1 = nums2[j];
                    break;
                }
                j++;
            } else if (i < m) {
               
                if (index == median2) {
                    m2 = nums1[i];
                }
                  if (index == median1) {
                    m1 = nums1[i];
                    break;
                }
                i++;
            } else {
                break;
            }
            index++;
        }

        if (even) {
            return (m1 + m2) / 2.0;
        } else {
            return m1 * 1.0;
        }

    
}
