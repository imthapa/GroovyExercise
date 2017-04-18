/**
 * Created by ishwar on 18/4/17.
 */

println "using times"
10.times {
    print it * 3 + " "
}

println ()
println "using upto"
def c = {
    print it * 3 + " "
}
0.upto(9,c)

println ()
println "using for loop"
for (number in 0..9) {
    print "${number * 3} "
}


println ()
println "using for each"
(0..9).each {
    print "${it * 3} "
}
