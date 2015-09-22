# Orders
You are given a sequence of n orders in format <customer> <amount> <product>. Example:
•	steve 8 apples
•	maria 3 bananas
•	kiro 3 bananas
•	kiro 9 apples
•	maria 2 apples
•	steve 4 apples
•	kiro 1 bananas
•	kiro 1 apples

Write a program that prints all products in the order of their first appearance. For each product print the customers and their aggregated ordered amounts. Order the customers by name alphabetically.For the orders above the output should be:
•	apples: kiro 10, maria 2, steve 12
•	bananas: kiro 4, maria 3

Input
The input comes from the console. At the first line the number n stays alone. At the next n lines, we have n orders.
The input data will always be valid and in the format described. There is no need to check it explicitly.

Output
Print one line for each product. Product lines should be ordered in the same way in which the products first appear in the input. For each product print the customers ordered this product in alphabetical order, along with the total ordered amount for each customer.
