public void removeDuplicates(LinkedList list) {
        if (list.head == null) {
            return;
        }
        
        HashSet<Integer> set = new HashSet<Integer>();

        Node iteration = list.head;
        Node previous = null;

        while (iteration != null) {
            if (set.contains(iteration.getValue())) {
                previous.setNext(iteration.getNext());
            } else {
                set.add(iteration.getValue());
                previous = iteration;
            }
            iteration = iteration.getNext();
        }
    }