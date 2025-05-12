# Plant Trees, CS 1400 Project - Group 3

## A program that has two parts, where the user's input is used to output information on trees and wildfires

## THIS PROJECT HAS ONLY BEEN TESTED ON ECLIPSE

## Why this program was created

* There are many forests that are being impacted by natural disturbances
* Forests getting destoryed leads to less water, disrupted wildlife, and climate change
* Trees provide various benefits to us
* We need to know how to prevent forests from being damaged in the future 

## How to import the necessary libraries

This program requires two libraries to be imported (OpenCSV and Apache Commons Lang).

**OPEN CSV**

1. Download the latest jar file for OpenCSV, which can be found here:
   ```sh
   https://sourceforge.net/projects/opencsv/
   ```
3. Right-click on the project and select "Build Path".
4. Select "Configure Build Path", select "Libraries", select "Class Path", then click "Add External Jars".
5.  Select the OpenCSV jar file and click "open".
6.  Select "Order and Export" and check the OpenCSV jar file.
7.  Click "Apply and Close".

**APACHE COMMONS LANG**

1. Download the latest jar file for Apache Commons Lang, which can be found here:
   ```sh
   https://commons.apache.org/lang/download_lang.cgi
   ```
3. Repeat steps 2-6 from **OPEN CSV**.

## How to use code

**PART A**

1. Input one of the following: Oak, Compact Italian Cypress, Tuscarora Crape Myrtle, Cold Hardy (the program is case-sensitive).
2. Based on user input, the program will output whether or not it is a good choice to be planted in California in areas close to power lines.

**PART B**

1. The program will display the Fires_100.csv file.
2. Input a name from the "UNIT_ID" (the name must be inputted exactly the same as displayed).
3. The program will display how many wildfires occurred in that area.
