<img src="assn-imgs/img_1.jpg" width="400">

# Individual Assignment: Writing a Sorting Application

## Overview
In this project, you'll explore sorting algorithms by developing a Java application 
that sorts user-defined model objects. Instead of using a predefined dataset, you'll 
design a model object with at least five sortable fields, then generate your own 
dataset using generative AI like ChatGPT to test the sorting functionality.

## Objectives
- Design a model object with at least five attributes that can be ordered.
- Use generative AI to create a CSV file with at least 20 records based on your model.
- Implement the heap sort algorithm in Java to sort these objects.

## Designing Your Model Object
Start by defining a model object in Java with at least five attributes. Each attribute 
should be capable of being ordered (e.g., numerical values, strings, dates). This 
structure will form the basis for your sorting application.

## Generating Test Data with ChatGPT
Utilize generative AI, such as ChatGPT, to create a dataset for testing:
- Sign up for a free ChatGPT account [here](https://chat.openai.com/signup).
- Once registered, use ChatGPT to generate realistic data that fits the structure 
  of your model object. Ask it to produce a CSV formatted output with at least 
  20 unique records.
- Save this data as a CSV file to be used in your application.

## Console Interface
Develop a console application that:
- Welcomes users and presents options for displaying and sorting the dataset.
- Implements initial sorting using `Arrays.sort()` based on one of the object's attributes.
- Ensure functionality by allowing users to choose different attributes for sorting.

## Flexible Sorting with Comparators
To allow for more different sorting with your model objects, you will be using the
Comparator interface to implement custom sorting logic. Here's how you can do it:
- Implement a custom `Comparator` classes for each attribute of your model object.
  This class should implement the `Comparator` interface and define the sorting logic.
- Allow users to select the sorting attribute through a console menu, applying 
  the respective comparator.

## Implementing Heap Sort
Create a class that integrates the Heap Sort algorithm:
- Incorporate a `sort()` method that takes an array of your model objects and a `Comparator`, then arranges them using Heap Sort.
- Include detailed testing using debugging tools to ensure your implementation is effective and efficient.

## Design Considerations
This assignment encourages thoughtful design:
- Structure your code with separate classes for the model, data handling, user interface, and sorting logic.
- Avoid simplistic or cluttered designs that could hinder readability or functionality.

## Submission Guidelines
- The sorting algorithm must be your own implementation, without relying on Java's built-in sorting functions.
- Follow best coding practices and include comprehensive documentation and comments in your code.
## Submitting your work

<img src="assn-imgs/img_2.jpg" width="200px">

1. Verify that your assignment is passing a linter check using the IntelliJ
   inspector tool.
2. Lastly, ensure your code is correctly pushed to your GitHub classroom repository.