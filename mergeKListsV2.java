public Node mergeKLists(Node[] lists) {
        return helper(lists, 0, lists.length - 1);
    }
    private Node helper(Node[] lists, int left, int right) {
        if (left > right) return null;
        if (left == right) return lists[left];
        
        int mid = left + (right - left) / 2;
        Node hd1 = helper(lists, left, mid);
        Node hd2 = helper(lists, mid + 1, right);
        
        Node hd = new Node(0), curr = hd;
        
        while (hd1 != null && hd2 != null) {
            if (hd1.val <= hd2.val) {
                curr.next = hd1;
                hd1 = hd1.next;
            } else {
                curr.next = hd2;
                hd2 = hd2.next;
            }
            curr = curr.next;
        }
        curr.next = (hd1 == null) ? hd2:hd1;
        
        return hd.next;
    }
