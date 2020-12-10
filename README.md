# OrderedArrayList

NoNullArrayList

We talked about how to do the NoNullArrayList by throwing an IllegalArgumentException if the input is null and use the super class method for the NoNullArrayList if it's not null. Null is not a valid value to add to your ArrayList.

OrderedArrayList
We talked about the add method we first check which index we want to put it in by comparing it with two adjacent elements in the ArrayList until we find one that the compareTo method would give a nonpositive and a nonnegative integer. I had a misconception about using >= and <= to compare but I figured you have to use compareTo to make it usable to all the types. 
