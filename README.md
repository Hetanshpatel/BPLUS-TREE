The project is all about the implementation of B+ trees. B+ tree is a data structure used for storing Key, 
Value pairs. The attribute of B+ tree which differentiates it from other data structures is the same level 
of its leaf node. The challenge of implementing B+ tree is to maintain its required degree at each node. 
A degree is defined as the maximum number of child nodes which can exist at a point. If during the 
insertion, the number of nodes exceed the degree, then that node must do spilt and rearrange all the 
nodes between parent and child to maintain the degree of B+ tree.
This project is focused mainly on five main functionalities:
1. Initialization of Degree for B+ tree: The first & foremost step is to initialize the degree 'm' for B+tree.
2. Insert Key Value Pair: User can call any function after initialization. If he calls Insertion, then the 
Insert( ) function will be called up and the Key Value pair will be inserted at the desired place.
3.Search Key: This search( ) functionality deals with the navigating of whole B+ tree. It requires to 
navigate the B+ tree node by node with the help of given key & displays the associated values as the
output. This function prints the returned value.
4. Range Search: In this case, user searches for a particular range of key values as (Key1,Key2)
. The expected output is the all key value pairs associated with this range such that Key1 <=Key
<=Key2
5. Delete: This Delete() functionality deals with the deleting the given key which is passed as a parameter
in the function. This function deletes the key passed as a argument in the function. This function sets 
given key as 0(zero) and value of that key to null
*******************************************************************************
The implementation of B + tree has been done in Java language.
1. Source Code: It is divided into three java files: First file i.e. Tree.java contains all methods to 
be implemented i.e. initialize(), insertPair(), leaf merge()
,nonleafsplit(), parentmerge(), getSearch() , printSearch(), search(), rangeSearch() and delete() . 
These function help in performing task of Insertion, Search, SearchRange and delete in B+ tree. 
The second file i.e. BPlusTree.java contains main function . Data is read from input file and and 
functions from BPlusTree.java are called accordingly. The third file is FileHandler.java where all 
file handling methods are operated like FileInputStream and BufferedReader.
2. Input File: The input file named 'input.txt' is backbone of this project. This file contains lines of 
command which are going to used in this project. File's first line contains the initialize(order) 
command to initialize tree by specifying order of the tree . After that, it gives any of the three
commands
o Insert(Key,Value): It refersthe Insert function & performs the insertion at the desired
location
o Delete(Key): It refers the delete function & delete the key at leaf.
o Search(Key): This input element invokes the getSearch ( ) function which in turn invokes the 
search ( ) function. It searches for the associated value with respect to the key. And that 
getSearch() function print out the resulting search value.
o Search(Key1, Key2): This search operation again invokes the rangeSearch ( ) function which 
in turn invokes the search( ) function & looks for the Key1 position. Since, the nodes are 
interconnected with each other, rangeSearch ( ) function directly displays the all the node 
values until it encounters the Key 2 position. And that rangeSearch() function printout the 
range for the given input, if that range is obtainable.
3. Output File: This is the file named “output_file.txt” where all the generated output data is stored
once the whole program is run.
4. Make File: This file will contains the addresses of the required files and hence it will be used to 
execute the program.
