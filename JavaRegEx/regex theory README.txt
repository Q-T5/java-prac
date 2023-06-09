REGULAR EXPRESSIONS
A regular expression (RegEx) is a sequence of characters that forms a search pattern.
It is also called a Rational Expression.
When searching for data in a text, you can use this search pattern to describe what you're searching for.
RegEx are used to perform all types of search and replace operations.

REGULAR EXPRESSION CHARACTERS
The following are different types of characters in a RegEx
        1. Metacharacters
        2. Quantifier
        3. Groups and Ranges
        4. Escape Characters and character classes

1)Metacharacters
^	Use: Used to match an expression to its right at the start of a String
	Example: ^a returns a match to any String that starts with 'a' e.g. 'aab', 'a9c' etc.
	
$	Use: Used to match the expression to its left at the end of a String
	Example: r$ returns a match to any String that ends with 'r' e.g. 'aaabr', 'ar', 'r' etc.
	
.   Use: returns a match to any single character in a String except the \n [line terminator]
	Example: b.x is an expression that matches String like 'bax', 'b9x', 'bar' etc 
	
|	Use: used to match a particular character or a group of characters on either side. If the character on
	the left side is matched, then the right side's character is ignored
	Example: A|b is an expression which gives various Strings but each String contains either A or b
	
\	Use: Used to escape a special character after this sign is a String

A	Use: Used to match to the character 'A' in the String
	Example: returns a match to those Stringd in which at least one time 'A' is present e.g 'Amcx', 'mnAr', 'mnopAxr' etc
	
Ab	Use: Used to match the substring to 'Ab' in any String
	Example: this expression matches those Strings in which 'Ab' is present at least once e.g 'Abcx', 'mnAb', 'mnopAbx4' etc.
	
	
2)Quantifers- used in RegEx for specifying the number of occurences of a character
+	Use: specifies an expression to its left one or more times
	Example: s+ is an expression which returns 's', 'ss', 'sss' etc

?	Use: specifies an expression to its left for 0(zero) or 1(one) times
	Example: aS? is an example which gives either 'a', 'as', but not 'ass'
	
*	Use: specifies an expression to its left or right zero or more times
	Example: Br* is an expression that matches 'B', 'Br', 'Brr', 'Brrr' etc.
	
{x}	Use: specifies an epression to its left for only x times
	Example: Mab{5} is an expression which gives the following String that contains 5 bs 'Mabbbbb'
	
{x, }Use: specifies an expression to its left for x or more times
	 Example: Xb{3, } is an expression which gives various Strings containing at least 3 bs e.g 'Xbbb', 'Xbbbb' etc.
	 
{x,y}Use: specifies an expression to its left at least x times but less than y times
	 Example: Pr{3,6}a is an expression that provides the following two Strings 'Prrrr', 'Prrrrr' etc.
	 
3)Groups and Ranges- define the collection of characters enclosed in the brackets
( )	Use: used to match everything which is in the simple bracket
	Example: A(xy) is an expression that matches anything with the following String 'Axy'
	
{ }	Use: used to match a particular number of occurences defined in the curly bracket for its left String
	Example: xz{4,6} is an expression which matches with the following String 'xzzzzz'

[ ]	Use: used to match any character from a range of characters defined in the square bracket
	Example: xz[atp]r is an expression matching the following Strings 'xzar', 'xztr', 'xzpr' etc.
	
[pqr]Use: matches to p, q and r individually
	 Example: Following Strings are matched to this expression 'p', 'q', 'r' etc.
	 
[pqr][xy]Use: It matches either p, q, r followed by either x or y
	 Example: Followinf strings are matched with this expression 'px', 'qx', 'rx', 'qy', 'ry' etc.
	 
(?...)Use: used for matching a non-capturing group
	  Example: A(?:nt|pple) is an expression that matches the following string 'Apple'
	  
[^...]Use: it matches a character that is not defined in the square bracket]
	  Example: Ab[^pqr] is an expression which matches only the following String 'Ab'
	  
[a-z] Use:matches letters of a small case from a to z
	  Example: matches Strings such as 'a', 'python', 'good' etc.
	  
[A-Z] Use:  matches leters of an upper case from A to Z
	  Example: this expression matches Strings such as 'EXCELLENT', 'NATURE', but not 'excellent'
	  
^[a-zA-Z] Use: Combines the effect of the above two expressions

[0-9] Use: matches a digit from 0-9
	  Example: expression matches the Strings such as '9845', '54455' etc.
	  
[aeiou] Use: matches only the small case vowels

[AEIOU] Use: matches only the upper case vowels

ab[^4-9] Use: matches those digits or characters which are not defined in the square brackets
		 Example: matches those Strings which do not contain 5, 6, 7 and 8

REGEX IN JAVA
Java does not have a built-in RegEx class, but we can import the java.util.regex package to work with RegEx.
The package contains the following classes:
        Pattern Class- defines a pattern to be used in the search
        Matcher Class - used to search for the pattern
        PatternSyntaxException Class- indicates syntax error in a regular expression

		THE util.regex.Pattern CLASS
Is a compiled version of Regex and can be called by the compile() method, which accepts the regex as its first argument
It does not have any public constructor

METHODS
(i) static Pattern compile(String regex)- this method is used to compile the given regex into a pattern
(ii) Matcher matcher(CharSequence input)- this method creates a matcher for matching the pattern with the given String which is inputted by a user
(iii) String toString()- returns the representation of the String
(iv) String[] split(CharSequence input)- this method splits a String on the basis of matches
(v) static Boolean matches(String regex, CharSequence input)- this method matches the regular expression against the given input String

		THE util.regex.Matcher CLASS
I used for performing the match operation on the input String by calling a matcher() function on any object or Pattern.
It does not have any public constructor

METHODS
(i)boolean matches()- this method checks whether the regex matches the pattern or not
(ii) boolean find()- this method searches the occurences of a regex in a String
(iii) boolean find(int start)- this method searches the occurences of regex in a String from the starting index
(iv) String group()- this method helps i finding the matched subsequence
(v) int start()- this method helps in returning the starting index of the matched subsequence
(vi) int end() this method helps in returning the last index of the matched subsequence
(vii) int groupCount()- this method helps in returning the total number of the matched subsequence 
