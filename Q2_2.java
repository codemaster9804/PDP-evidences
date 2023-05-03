public T removeDuplicates(LinkedList list, int k) {
        
        LinkedListElement tmp = list.head;
        for (int i = list.size(); i > k; i--) {
            tmp = tmp.getNext();
        }

        return tmp;

    }