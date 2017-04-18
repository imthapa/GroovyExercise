/**
 9. Create a file which contains all the odd numbered lines of a given file.
    Each line should be numbered at the beginning of line viz : 1, 3, 5.....
 */
it = 0;
file = new File("../../../demo1.txt")
file.createNewFile()
new File("../../../demo.txt").eachLine {
    line ->
        if (++it % 2 != 0) {
            file.append("$it : $line \n")
        }
}