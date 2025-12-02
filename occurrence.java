package org.testleaf;

public class occurrence {
public static void main(String[] args) {
	String str = "java programming";
	char ch = 'a';
	int count = 0;
	for (char c : str.toCharArray()) 
	{ 
		if (c == ch)
		{ count++;
	}
	}
	System.out.println("Occurrence of '" + ch + "' = " + count);
}
}


