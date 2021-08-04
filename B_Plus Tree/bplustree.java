import java.util.*;
import java.io.*;

public class bplustree{

	public static void main(String args[]) throws IOException{

		// initializing input file, output files and streams
		FileHandler fileHandler = new FileHandler(args[0],"output_file.txt");

		Tree bPlusTree;

		ArrayList<String> lines;
		lines = fileHandler.readInput();

		//bPlusTree object of Tree class
		bPlusTree = new Tree();

		int a;
		for(a=0;a<lines.size();a++)
		{
			//represents a line gotten from the input file
			String line = lines.get(a);

			//using following delimiters, tokenizing the line
			StringTokenizer stringTokenizer = new StringTokenizer(line,"(,)");

			//assign operation to operation using token
			String operation = stringTokenizer.nextToken();

			//parameter list will be used to provide inputs and
			//distinguish between different types of searches
			Vector<String> parameterList = new Vector<String>();

			while(stringTokenizer.hasMoreTokens()){
				parameterList.add(stringTokenizer.nextToken());
			}

			//if operation is equal to initialize then
			//initialize function of bPlusTree object is called
			if(operation.equals("initialize"))
			{
				bPlusTree.initialize(Integer.parseInt(parameterList.get(0)));
			}

			//if operation is equal to insert then
			//insert function of bPlusTree object is called
			else if(operation.equals("Insert"))
			{
				bPlusTree.insertPair(Double.parseDouble(parameterList.get(0)),parameterList.get(1));

			}

			//if operation is equal to search then
			//search function of bPlusTree object is called
			else if(operation.equals("Search"))
			{
				//if parameterList has only one argument
				if(parameterList.size()==1)
				{
					String toWrite;
					toWrite = bPlusTree.getSearch(Double.parseDouble(parameterList.get(0)),bPlusTree.root);
					fileHandler.writeOutput(toWrite);
				}

				//if parameterList has 2 arguments
				else if(parameterList.size()==2)
				{
					String toWrite;

					try{
						toWrite = bPlusTree.rangeSearch(Double.parseDouble(parameterList.get(0)),Double.parseDouble(parameterList.get(1)));
						fileHandler.writeOutput(toWrite);
					}

					catch(NullPointerException e){}
				}

				//if operation is equal to delete then
				//delete function of bPlusTree object is called
				else if(operation.equals("Delete"))
				{
					bPlusTree.delete(Double.parseDouble(parameterList.get(0)));
				}

				else{
					System.out.println("wrong number of parameters in search");
				}
			}
		}
		fileHandler.closeOutputBuffer();
	}
}