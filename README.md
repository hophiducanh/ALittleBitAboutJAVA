# a-littlebit-about-java

Best Practice
======

[Should a function have only one return statement?](https://stackoverflow.com/questions/36707/should-a-function-have-only-one-return-statement/36714#36714)
- I lean to the idea that return statements in the middle of the function are bad. You can use returns to build a few guard clauses at the top of the function, and of course, tell the compiler what to return at the end of the function without issue, but returns in the middle of the function can be easy to miss and can make the function harder to interpret.

[In Java, why do people prepend fields with `this`?](https://stackoverflow.com/questions/406053/in-java-why-do-people-prepend-fields-with-this/406063#406063)
- Same reason why some people like to prepend private data members with "m_" or name interfaces "IFoo". They believe it increases readability and clarity. Whether or not you agree with conventions like these is a matter of taste. 
- Defensive programming (in case someone editing the code later adds a parameter or local with a conflicting name
- Make the code "self-documenting," more obvious

[What is the proper style for listing imports in Java?](https://stackoverflow.com/questions/2067158/what-is-the-proper-style-for-listing-imports-in-java/2067469#2067469)
- There is no runtime cost from using an import statement
- The compilation process can take a little more time with an import statement
- The compilation process can take even more time with a wildcard import statement
- For improved readability, wildcard import statements are bad practice for anything but throwaway classes
- The compilation overhead of non-wildcard import statements are minor, but they give readability benefits so best practice is to use them

# IO
![](https://image.slidesharecdn.com/iostreamsv2-151225120725/95/java-input-output-and-file-handling-3-638.jpg?cb=1451045800)
https://www.slideshare.net/sunilos/java-input-output-and-file-handling


#Jackson
Jackson is a suite of data-processing tools for Java comprising of [three components](https://www.quora.com/What-is-the-difference-between-fasterxmls-jackson-core-and-jackson-databind-Do-I-need-to-use-both-or-can-I-use-only-one-of-them/answer/Prashanth-Ambure):
- [Streaming](https://www.baeldung.com/jackson-streaming-api) (jackson-core) defines low-level streaming APIs and includes JSON-specific implementations.
- Annotations (jackson-annotations) contains standard Jackson annotations.
- Databind (jackson-databind) implements data-binding (and object serialization) support on the streaming package. This package depends on both the streaming and annotations packages.
