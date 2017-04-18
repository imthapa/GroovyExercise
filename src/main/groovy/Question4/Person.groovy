package Question4

import groovy.transform.ToString

/*
4. GString... override the toString() of the Person class to return something like...
"Sachin is a man aged 24 who lives at Delhi. He works for Intelligrape with employee id 12 and
draws $$$$$$$ lots of money !!!!."
 */

Human person = new Human()

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
class Human {

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


    String toString() {
        "${name} is a ${gender == "Male" ? "man" : "woman"} aged ${age} who lives at ${address}"
    }
}