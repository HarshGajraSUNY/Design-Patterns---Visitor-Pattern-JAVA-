Visitor Pattern (JAVA)

File Processing Decorators

Design a visitor, PopulateVisitor, that reads from an input file and stores it in a tree. You can decide what kind of tree to use. The visitor should return a reference to this tree. The element for this visitor is the name of the input file the TreeBuilder (or whatever class has all the methods needed to build a tree). All assumptions about the input file in assignment-4 are also applicable here.
Design a visitor, PalindromeHighlight, that takes the tree as an element, created by the previous visitor, and updates the tree's content by modifying all the Palindrome words, greater than 3 characters, to be capitalized. Please note that except creating the tree, PopulateVisitor should NOT store any information in the tree to help this visitor.
Design a visitor, PrimeLength, that takes the tree as an element, which was returned by the previous visitor, and updates the tree's content by modifying all the words whose length is a prime number, by adding a suffix "-PRIME" to the string.
Design a visitor, PrintTree, that takes the tree as an element, which was returned by the previous visitor, and prints the tree's distinct words, in ascending (alphanumeric) order, in the output file.
From the command line accept the input file name, output file name, and debug level.




## To clean:
ant -buildfile src/build.xml clean
-----------------------------------------------------------------------
-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all
-----------------------------------------------------------------------
-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=input file -Darg1=output file -Darg2=Threadcount -Darg3=word -Darg4=debugValue
-----------------------------------------------------------------------
-----------------------------------------------------------------------


"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.


-----------------------------------------------------------------------
-----------------------------------------------------------------------

We have Used Binary search tree BST for implemeting the Nodes tree. Binary search tree BST is a collection of nodes arranged in a way where they maintain BST properties. 
Each node has a key and an associated value. While searching, the desired key is compared to the keys in BST and if found, the associated value is retrieved.
BST allow fast lookup, addition and removal of items, and can be used to implement lookup tables that allow finding an element by its keys. 
Since BST put elements in a sorted order the insertion and search are very fast.
Insertion : O(log n)
Deletion : O(height) i.e O(log n)
Traverasal : O(n)
Search : O(height) i.e O(log n)
