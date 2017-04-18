/**
 * Created by ishwar on 18/4/17.
 */
//class Question7 {
//
//}

def search = {
    element,list ->
        boolean flag = true;
        list.each{
            key -> if(key == element){
                println "${element} is present"
                flag = false
            }
        }
        if(flag)
            println "${element} is absent"
}
arr = new ArrayList<>();
arr.add("ishwar")
arr.add("ajay")
arr.add("sumit")

search "ishwarr",arr
search "ishwar",arr

