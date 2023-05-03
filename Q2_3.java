public void deleteMiddleNode(LinkedListElement middleNode) {
    // Check if the given node is null or the last node of the list
    if (middleNode == null || middleNode.getNext() == null) {
        return;
    }
    
    // Copy the value of the next node to the current node
    middleNode.setValue(middleNode.getNext().getValue());
    
    // Set the current node's next pointer to the next node's next pointer
    middleNode.getNext() = middleNode.getNext().getNext();
}
