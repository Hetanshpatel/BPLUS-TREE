import java.util.ArrayList;
import java.io.*;

public class FileHandler{

	public File ipFile;
	public File opFile;
	public BufferedWriter outputBufferedWriter;
	public  ArrayList<String> sentences;

	//function for handling file
	public FileHandler(String inputFilePath, String outputFilePath) throws IOException{

		//INPUT file
		ipFile = new File(inputFilePath);
		//OUTPUT file
		opFile = new File(outputFilePath);

		//if file does not exist then create new one
		opFile.createNewFile();

		//initialising output stream
		FileOutputStream fileOutputStream = new FileOutputStream(opFile);
		outputBufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
	}

	//function for read input from given file

	public ArrayList<String> readInput() throws IOException {

		//initializing fileinputstream and bufferreader
		FileInputStream fileInputStream = new FileInputStream(ipFile);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

		//initializing arraylist to store lines from inputfile
		String line = null;
		ArrayList<String> lines = new ArrayList<String>();

		//adding line(s) to lines from inputfile
		while ((line = bufferedReader.readLine()) != null) {
			lines.add(line);
		}

		//closing buffer reader
		bufferedReader.close();
		//returning lines
		return lines;
	}

	//function for writing output
	public void writeOutput(String stringForWriting) throws IOException{
		//writing to output file
		outputBufferedWriter.write(stringForWriting);
		outputBufferedWriter.newLine();
	}

	//function for closing outputbuffer
	public void closeOutputBuffer() throws IOException{
		outputBufferedWriter.close();
	}
}