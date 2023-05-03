"You can create a parallell stack that only stores the first element to be pushed and then any element that will be pushed later that is
smaller than the peek at the auxiliary stack. Then for popping if the value to be popped is the same as the aux stack peek they both get
popped, else only the normal stack one gets popped. Getting the min then is only a matter of peeking the aux stack."