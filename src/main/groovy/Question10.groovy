/**
 10. Write a method which removes all the white spaces in a file and writes the output to another file.
     Suppose white space characters are Space, Tab and Enter
 */

file = new File("../../../demo3.txt")
file.createNewFile()
new File("../../../Files/first.js").eachLine {
    line ->
        line = line.replace(" ", "")
        file.append(line)
}
