![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | BLOG - NEW BLOG

## A Quick Introduction

Inspired by Wattpad, Mr. Alex is on a mission to build "CODE WALL" - A community for developers. He has laid out a plan & hired a designer & developer to work on the project. Unfortunately, due to some trust issues, he had to fire them. He is suspicious that one of his competitors is trying to steal his idea & work on it quickly even before him. 

This is Alex's dream project. Well, now it's ours too. We assured him that you'd help out your best to finish this on time. So, could you hurry up & get going?

## What should you do
```
Fork this repo
Clone this repo
Practice Java basics - operators, conditions, loops, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions

1. ***Do not modify the entire code.***
2. ***Edit the code as per the instructions.***
3. ***Go to Java Resources -> src folder.***
4. ***You will have 3 packages src/controller, src/model and src/businesslogic.***
5. ***Create Classes inside the model package***
6. ***Once the progressions are completed, follow the instructions to run the application and test your code.***
7. ***Use username as admin and password as admin to login inside the blog.***
8. ***This is a continuation of Day-3.You can build on top of Day-3 Project Builder.***
 
## Run the Project
1. ***Right click on the project.***
2. ***Go to Run as -> Run on server.***
3. ***You can check the output in eclipse browser or in your browser.***

## Input Format
1. ***There are 3 inputs***
2. ***First input is a String which corresponds to blog title***
3. ***Second input is a String which corresponds to blog description.***
4. ***Third input is a String which corresponds to system date{use LocalDate} .***

## Output Format
1. ***Output is a boolean value true or false.***

## Progression - 1 
1. ***Day - 4 We will check if the blog title and description contains any offensive word or not.***
2. ***Your task is to make sure that the title and description does not contain any offensive words.***
3. ***To achieve this, lets create a abstract class OffensiveWordsChecker.***
4. ***Create an abstract method public abstract boolean checkBlog(Blog blog).***

## Progression - 2
1. ***Create an Interface - public interface OffensiveWordsInterface.***
2. ***Create two methods boolean checkBlogTitle(Blog blog) and boolean checkBlogDescription(Blog blog).***

## Progression - 3
1. ***Create a class called CheckBlogPost which extends OffensiveWordsChecker and also implements OffensiveWordsInterface.***
2. ***Implement checkBlog(Blog blog) method.***
3. ***The checkBlog(Blog blog) method in turn should invoke checkBlogTitle(Blog blog) and checkBlogDescription(Blog blog).***
4. ***The checkBlog method should return true if there are no offensive words otherwise it should return false.***
5. ***You need to use the google offensive word list which is located in your project directory under resources - full-list-of-bad-words_text-file_2018_07_30.txt***
6. ***Use it for your reference of bad words.***
7. ***Select 25 offensive words from the file and store it in an array.***
8. ***You can compare the offensive words with the array and return the output.***

## Progression - 4
1. ***The checkBlogTitle(Blog blog) should check if the blog title contains any offensive words.***
2. ***Return true if there are no offensive words else false if it contains any offensive words.***
3. ***You can use the array created in Progression - 3 to check if title contains any offensive words.***
4. ***Return true if there are no offensive words.***

## Progression - 5
1. ***The checkBlogDescription(Blog blog) should check if the blog description contains any offensive words.***
2. ***Return true if there are no offensive words else false if it contains any offensive words.***
3. ***You can use the array created in Progression - 3 to check if title contains any offensive words.***
4. ***Return true if there are no offensive words.***

## Progression - 6
1. ***Create an object for CheckBlogPost in BlogController.***
2. ***Call the CheckBlogPost with the object created and pass user as argument.***
3. ***Store the value in a boolean variable checkblog.***


Happy Coding ProGrad ❤️

