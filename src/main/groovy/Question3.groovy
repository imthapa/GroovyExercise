/*class Question3 {
    3. Print this pattern using groovy:
        *
        **
        ****
        ********
}*/
4.times {
    (2**it).times {
        print "*"
    }
    println ""
}
