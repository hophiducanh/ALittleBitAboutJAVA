package com.tellyouiam.regex.quantifier;

import static com.tellyouiam.regex.RegexUtil.test;

public class PossessiveQuantifier {

    /**
     * The possessive quantifier's first step is same as of greedy quantifiers.
     * They possibly eat entire input string before doing a match.
     * After eating the input string, they match the 'entire' regex expression against the eaten input.
     * If there's a match then good!. If there's no match then that's it, no more steps.
     * The engine will declare final no match found output.
     * They don't back off like greedy quantifiers do.
     * https://www.logicbig.com/tutorials/core-java-tutorial/java-regular-expressions/regex-possessive-quantifiers.html
     * */

    public static void main(String[] args) {
        //++ possessive quantifier
        test(".++", "abc");
        test(".++x", "abcx");

        /* Making it greedy */
        test(".+x", "abcx");
        test("x++", "xxbxxx");
        /* Making it reluctant */
        test("x+?", "xxbxxx");
        test("A.++", "AEG");
        test("((cat)|(dog))++", "cat dog catdog dogcat");
        /* Making it reluctant */
        test("((cat)|(dog))+?", "cat dog catdog dogcat");

        //*+ possessive quantifier:  It matches zero or more times possessively.
        test(".*+", "");
        test(".*+x", "abcx");
        test("x*+", "xxbxx");
        test("x*?", "xxbxx");
        ;
        test("a.*+z", "abztstz");
        test("a*+z", "abztstaz");
        test("a*+z", "aaaaaaa");
        test("a*+z?", "aaaaaaa");
        test("'[^']*+'", "'Reason and Rationality'");

        //?+ possessive quantifier:  matches zero or one, possessively.
        test(".?+", "");
        test(".?+", "abc");
        test(".?+x", "yyyyx");
        test(".?+x", "x");
        test("x?+", "xyz");
        test("x?+z", "xyzyzzxyxzy");

        //{}+ possessive quantifer:  The Curly Brackets Possessive Quantifier.
        test(".{3,}+", "abcd");
        test("a.{0,}+z", "abcdz");
        test(".*+abc", "aabc");
    }
}
