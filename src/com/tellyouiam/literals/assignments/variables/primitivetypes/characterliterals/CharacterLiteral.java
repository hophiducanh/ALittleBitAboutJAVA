package com.tellyouiam.literals.assignments.variables.primitivetypes.characterliterals;

public class CharacterLiteral {
    public static void main(String[] args) {
        //A char literal is represented by a single character in single quotes:
        char a = 'a';
        char b = '@';

        //You can also type in the Unicode value of the character, using the Unicode notation of prefixing the

        char letterN = '\u004E';

        //Remember, characters are just 16-bit unsigned integers under the hood. That means you can assign a
        //number literal, assuming it will fit into the unsigned 16-bit range (0 to 65535).For example, the following
        //are all legal:

        char c = 0x892; //hexadecimal literal
        char d = 982; //int literal
        char e = (char) 70000; //70000 is out of range
        char f = (char) -98; //legal but ridiculous

        //And the following are not legal and produce compiler errors:

        //char x = -29; //Possible loss of precision; need a cast
        //char y = 70000; //Possible loss of precision; need a cast

        //You can also use an escape code (the backslash) if you want to represent a character that can’t be
        //typed in as a literal, including the characters for linefeed, newline, horizontal tab, backspace, and quotes:

        char m = '\"'; //A double quote
        char n = '\n'; //A new line
        char tab = '\t'; //A tab
        
        int min_radix = Character.MIN_RADIX;
        System.out.println("MIN_RADIX: " + min_radix);
    
        int max_radix = Character.MAX_RADIX;
        System.out.println("MAX_RADIX: " + max_radix);
    }
}
