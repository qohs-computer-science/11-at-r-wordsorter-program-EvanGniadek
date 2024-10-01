[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/BFBm91-B)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=16275898)
<p><strong>Description:</strong><span>&nbsp; You are assisting a teacher in the school by preparing a list of words that are in an article that the students will be reading.&nbsp; You will traverse through the article processing all of the words and storing unique words appropriately in the data structure(s).&nbsp; You will then perform tasks on the data structure(s) based on what the teacher needs.&nbsp;&nbsp;</span></p>
<p><strong>Directions: </strong><span>&nbsp;</span></p>
<p><span>Read ALL of the following directions before beginning the program.&nbsp;&nbsp;</span></p>
<ol>
    <li aria-level="1"><span>Create an algorithm/pseudocode for this program.&nbsp; Keep in mind the datatypes that you will need to use to accurately getting input, evaluating input, and providing output.&nbsp;&nbsp;</span></li>
    <li aria-level="1"><span>Open the template in our programming environment, you will have access to all the files you need.&nbsp; Following is an outline of what your program should ask for, what type of input to expect, and what it should output.&nbsp; Make sure that you follow the instructions below &ndash; you are given the code for reading from a file.</span>
        <ol>
            <li aria-level="2"><span>DATA STRUCTURE:&nbsp;&nbsp;</span>
                <ol>
                    <li aria-level="3"><span>You will create a data structure that can hold an &ldquo;infinite&rdquo; number of words sorted by the letter that each word starts with.</span></li>
                    <li aria-level="3"><span>Your words will only appear in the data structure in lowercase letters (you will have to make sure you deal with this when you deal with your input).&nbsp;&nbsp;</span></li>
                </ol>
            </li>
            <li aria-level="2"><span>INPUT:</span>
                <ol>
                    <li aria-level="3"><span>Your first set of input will be from a file.&nbsp;&nbsp;</span>
                        <ol>
                            <li aria-level="4"><span>Process all of the words within the file &ldquo;article.txt&rdquo;&nbsp;&nbsp;</span></li>
                            <li aria-level="4"><span>Words are added to the data structure after they are inputted if and only if they do not already exist in the data structure &ndash; the data structure should hold a set of unique words.&nbsp; &nbsp;&nbsp;</span></li>
                        </ol>
                    </li>
                    <li aria-level="3"><span>Your second set of input will be from the keyboard and will continue until the user chooses to stop.&nbsp; You will output a menu with the following options and then process each option until the user enters input to exit.&nbsp;&nbsp;</span>
                        <ol>
                            <li aria-level="4"><span>Print out all words starting with a specific letter - user will input a single letter and output should either be a list of all the words (on a separate line) or &ldquo;No words start with this letter&rdquo;&nbsp;&nbsp;</span></li>
                            <li aria-level="4"><span>Print out all words&nbsp;-user will not input any extra information, it will output the letter and then the list associated with that letter.&nbsp; If there are no words in the data structure, &ldquo;Empty List&rdquo; will be outputted.&nbsp;</span></li>
                            <li aria-level="4"><span>Print out the total number of unique words&nbsp;user will not input any extra information, it will either output &ldquo;There are __ unique words in the article&rdquo; or &ldquo;Empty List&rdquo;&nbsp;&nbsp;</span></li>
                            <li aria-level="4"><span>Search and determine if a word is in the article&nbsp;- user will enter a single word with no symbols and the program will output &ldquo;Word found in the article&rdquo; or &ldquo;Word NOT found in the article.&rdquo;&nbsp;&nbsp;&nbsp;</span></li>
                            <li aria-level="4"><span>Remove a word from the data structure&nbsp; user will enter a single word with no symbols and the program will output &ldquo;Word successfully removed from the list&rdquo; or &ldquo;Word NOT found in the article.&rdquo;&nbsp;&nbsp;</span></li>
                            <li aria-level="4"><span>Exit&nbsp;&nbsp;</span></li>
                        </ol>
                    </li>
              </ol>
        </li>
  </ol>
       
      
