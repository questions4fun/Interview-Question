# Interview-Question

Please clone this repostory and make sure you use IntelliJ IDE, simply open the project and open the FunClassTests.java file and use hot key Ctrl + Shift + F10 to run. Trust me using intellij is going to save you sometime here...

Some assumptions made for this method:
* I will always receive a string of words where words are anything that is seperated by a blank space (e.g. "a e i o u" would return 1 because we assume a word is anything that is a string and separated by a blank space, even if they aren't actually valid words, so there is no actual word checking)
* It is possible to receive null
* Special escaped characters count as 1 (e.g. \n \t \f, etc.)
* I will always receive a string of words where the whole string length can never cause overflow
