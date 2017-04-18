/**
 7. Write a closure which checks if a value is contained within a list where the closure
 accepts two parameters
 */

def search = {
    element, list ->
        boolean flag = true;
        list.each {
            key ->
                if (key == element) {
                    println "${element} is present"
                    flag = false
                }
        }
        if (flag)
            println "${element} is absent"
}
arr = new ArrayList<>();
arr.add("ishwar")
arr.add("ajay")
arr.add("sumit")

search "ishwarr", arr
search "ishwar", arr

