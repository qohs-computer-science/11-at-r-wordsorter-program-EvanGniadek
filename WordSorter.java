//Evan J Gniadek the purpose of this code is to review my knowledge of java for programming

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class WordSorter 
{
	public static ArrayList<String> sortedList = new ArrayList<String>();

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		Scanner input = new Scanner(System.in);
		try
		{
			in = new Scanner(new File("article.txt"));	
		}
		catch(Exception e)
		{
			System.out.println("Cannot find file... Exiting Program");
			return;
		}	
		String word = "";
		while(in.hasNext())
		{
			word = in.next();
			word = word.replace(",", "");
			word = word.replace("(tm)", "");
			word = word.replace(")", "");
			word = word.replace("(", "");
			word = word.replace(".", "");
			word = word.replace("'s", "");
			word = word.replace(":", "");
			word = word.replace("!", "");
			word = word.replace("?", "");
			word = word.replace("'", "");
			sortedList.add(word.toLowerCase());			
			
		}

		WordSorter.sort();
		Scanner userIn = new Scanner(System.in);
		Scanner strIn = new Scanner(System.in);
		boolean cont = true;
		int given = 0;
		while(cont){
			System.out.println("1. to print out all words starting with a letter 2. print out all words of all letters");
			System.out.println("3. print out number of unique words 4. is a word in article? 5. delete word 6. exit program");
			given = userIn.nextInt();
			switch(given){
				case 1:
					System.out.println("what Letter do you want to print the words for");
					char whatChar = strIn.next().charAt(0);
					WordSorter.printList(whatChar);
					
					break;	
				case 2:
						WordSorter.printAll("abcdefghijklmnopqrstuvwxyz");
					break;
				case 3: 
					WordSorter.wordCount();
					break;
				case 4:
					System.out.println("What word are you looking for?");
					strIn.nextLine();
					String whatWord = strIn.nextLine();
					if(WordSorter.isInArticle(whatWord))
						System.out.println("its in there!");
					else
						System.out.println("Not in there!");
					break;
				case 5:
					System.out.println("What word do you want to delete");
					strIn.nextLine();
					String deleteWord = strIn.nextLine();
					WordSorter.delete(deleteWord);
				
					break;
				case 6:
			//Stop the looping of the switch 
				cont = false;
				break;
				default:
					break;
				//reprints the options 
			}//end of switch
		}//end of while
		in.close();
		input.close();
		userIn.close();
		strIn.close();
	}//end of main method
	
	public static void sort(){

		for(int i = 0; i < sortedList.size()-1; i++){
			int index = i;
			for(int j = i + 1; j < sortedList.size(); j++)
				if( sortedList.get(j).charAt(0) < sortedList.get(index).charAt(0))
					index = j;
			String temp= sortedList.get(index);
			sortedList.set(index, sortedList.get(i));
			sortedList.set(i, temp);
		}//end of loop
		ArrayList<String> glep = new ArrayList<String>();
		for(String temp : sortedList)
			if(!glep.contains(temp))
				glep.add(temp);
		sortedList = glep;
	}//End of sortList method
	
	public static void printList (char p){
		Boolean found = false;
		System.out.println("the words that start with " + p +" are..." );
		for(int i = 0; i < sortedList.size(); i++)
			if(sortedList.get(i).indexOf(p) == 0)
				{System.out.println( sortedList.get(i) + ","); found = true;}//End of this little statement 

		if(!found)
			System.out.println("No words start with letter the " + p);
	
		
		}//end of this method 
		public static void printAll(String alpha){
			if(alpha.length() > 0){
				WordSorter.printList(alpha.charAt(0));
				WordSorter.printAll(alpha.substring(1));
			}//end of if
			if(sortedList.size() < 1)
				System.out.println("This article... Is empty!");
		}//end of printAll
		
		public static void wordCount (){
			System.out.println("the word count is" + sortedList.size());
		}
		
		public static Boolean isInArticle (String theWord){
				if(sortedList.indexOf(theWord) == -1)
					return false;
		
				else 
					return true;
		}//checkForWord
		
		public static void delete (String theWord){
			if(!WordSorter.isInArticle(theWord))
				System.out.println("Word does not exist");
			else
				sortedList.remove(sortedList.indexOf(theWord));
				System.out.println("The word was removed"); 
		}// remove the word
}//End of public class 
