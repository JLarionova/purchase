# Purchase Management System

## Overview

This project involves creating a simple purchase management system using Java. The system reads purchase data from a CSV file, processes it into different classes, and performs various operations on the data using Java collections. The project is structured into several tasks, each designed to build and manipulate data about purchases and their associated days of the week.

## Project Structure

### Packages and Classes

- **Package `com.itgen.lesson`**
  - **`Purchase` Class**: Represents a general purchase with attributes such as name, price, and quantity.
  - **`PricePurchase` Class**: Inherits from `Purchase` and includes an additional attribute for discount.

- **Default Package**
  - **`Main` Class**: Contains the main logic for reading data from the CSV file, processing it, and performing the required operations.

## CSV File Format

The `in.csv` file contains purchase data in the following format:

- **Odd Lines**: Purchase details in the format `name;price;quantity;discount` (if applicable).
- **Even Lines**: The day of the week when the purchase was made.

  
## Tasks

1. **Loading Data into Maps**
   - Load the data from the CSV file into a `Map` where:
     - **Key**: `Purchase` object
     - **Value**: Day of the week when the last purchase was made

2. **Print First Map**
   - Print the contents of the first map using a for-each loop.

3. **Loading Data into a Second Map**
   - Load data into a second `Map` where:
     - **Key**: `Purchase` object
     - **Value**: Day of the week when the first purchase was made

4. **Print Second Map**
   - Print the contents of the second map using a for-each loop.

5. **Find Specific Purchases**
   - Identify the first and last day of the week on which bread was bought for the price of 155.

6. **Remove Specific Data from First Map**
   - Remove all entries related to "meat" from the first map.

7. **Remove Specific Data from Second Map**
   - Remove all entries related to purchases made on Friday from the second map.

8. **Print Both Maps**
   - Print the contents of both maps using a for-each loop.
