lab3
Find All Duplicates
Write a function (or static method in the case of Java)
that accepts a list of integers and returns a list of only those integers that appear more than once.

add to README.md
Nested loop ::
This approach uses two loops to compare each number in the list with every other number.
the outer loop iterates through the primary list, and for each number, the inner loop checks if the number has already appeared in list.
These numbers are stored into two seperate lists, one is a "current number" list
and the other is a "Matches" list that will be returned at the end. This will continue for the length of the origional list of numbers.

some of the tradeoffs:
Time Complexity, the nested loop approach has a big O notation of O(n^2) because for each number it compares it to the rest of the list
It is simple however, and very easy to implement, but as the list gorws in size it becomes less efficent.
for smaller lists this method is a perfectly fine solution.



Dictionary or Map::
This approach works by using a dictionary to track how many times each number appears in the list. A dictionary stores the numbers as keys

and the number of times its been encountered as values. So when you are able to keep track of the times youve encountered a number, you can very effeciently identify matches.


Tradeoffs ::
This method has a better time complexity than the nested loop variation, it has a time complexity of O(n)
meaning that it only iterated over the size of the list once, then over the dictionary once.
This method is much more efficent but you need a good understanding of hash maps and dictionarys to be able to implement it.

