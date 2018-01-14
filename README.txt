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

[Date: 11/21/2017 ] Paritosh Fulara , Harsh Mohan Gajra
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