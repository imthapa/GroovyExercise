package Question5

/**
 *
 5a. Groovy Truth: if('test') { printlnn "test evaluated to true inside if" }
 try replacing test with various objects and observe its behaviour.
 "Test"
 'null'
 null
 100
 0
 empty list
 list with all vaues as null List list = new ArrayList()
 */
if("Test")
    println "this test for non-empty string"
if('null')
    println "this test for non-empty character"
if(null)
    println "check for null"
if(100)
    println "check for integer 100"
if(0)
    println "check for integer 0"
if([])
    println "check for empty list"
if([null])
    println "checking for null inside list"
