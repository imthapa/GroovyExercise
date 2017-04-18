/*
8. Combine content of all the files in a specific directory to another new file
 */

demofile=new File("../../../demo.txt")
        demofile.createNewFile()
(new File("../../../Files/").listFiles()).each {
    key ->
        file = new File("${key}")
        if (file.isFile()) {
         file.eachLine {line -> demofile.append("$line  \n" ) }
        }
}