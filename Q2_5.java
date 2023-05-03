public LinkedListElement addTwoNumbers(LinkedListElement l1, LinkedListElement l2) {
    LinkedListElement Head = new LinkedListElement(0);
    LinkedListElement current = Head;
    int carry = 0;
    
    while (l1 != null || l2 != null) {
        int x = (l1 != null) ? l1.getValue() : 0;
        int y = (l2 != null) ? l2.getValue() : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        current.next = new LinkedListElement(sum % 10);
        current = current.getNext();
        if (l1 != null) l1 = l1.getNext();
        if (l2 != null) l2 = l2.getNext();
    }
    
    if (carry > 0) {
        current.getNext() = new LinkedListElement(carry);
    }
    
    return Head.getNext();
}
