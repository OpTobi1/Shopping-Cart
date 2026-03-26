# Shopping Cart Management System

## Overview
[cite_start]This is a simple Java-based console application for managing a shopping cart system[cite: 1, 2]. It demonstrates basic Object-Oriented Programming (OOP) concepts such as classes, objects, static variables, and constants.

## Features
* [cite_start]**Product Management:** Create products with automatic, unique, and sequential IDs starting from 100[cite: 6, 8, 9].
* [cite_start]**Cart Items:** Manage items in the cart, including product details and quantities [cite: 21-23].
* [cite_start]**Shopping Cart:** Add up to 50 items to a cart[cite: 32]. [cite_start]If a product already exists, its quantity is updated; otherwise, a new item is added[cite: 39].
* [cite_start]**Calculations:** Automatically calculate the total price of each item and the entire cart[cite: 27, 42].
* [cite_start]**Tracking:** Identify the most expensive product in a cart [cite: 43] [cite_start]and track the total number of carts created across the system using static variables[cite: 34, 42].

## File Structure
* [cite_start]`Product.java`: Represents a product with a final ID, name, and price [cite: 3-12].
* [cite_start]`Item.java`: Represents an entry in the shopping cart (a `Product` and its quantity) [cite: 18-23].
* [cite_start]`ShoppingCart.java`: Manages an array of `Item` objects and calculates totals [cite: 29-32].
* [cite_start]`Main.java`: The main execution file demonstrating the creation of products and carts [cite: 44-82].

## How to Run
1. Compile all Java files: `javac *.java`
2. Run the main class: `java Main`
