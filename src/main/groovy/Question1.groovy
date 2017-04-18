import groovy.transform.ToString

/*class Question1 {
    1. Create a class in Java along with follwing fields. classname: Person fields: name, age,
    gender, address Access the fields in all known ways: like through getter , by dot operator
}*/

Person person = new Person();
println "--------using setters to set the value-------"
person.setName("Aryan");
person.setAge(21)
person.setAddress("dwarka")
person.setGender("Male")

println "--------using getters to access the value-------"
println person.getName()
println person.getAge()
println person.getAddress()
println person.getGender()

println "--------using dot to access the value-------"
println person.name
println person.age
println person.address
println person.gender

@ToString
class Person{
    String name
    Integer age
    String gender
    String address

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Integer getAge() {
        return age
    }

    void setAge(Integer age) {
        this.age = age
    }

    String getGender() {
        return gender
    }

    void setGender(String gender) {
        this.gender = gender
    }

    String getAddress() {
        return address
    }

    void setAddress(String address) {
        this.address = address
    }
}