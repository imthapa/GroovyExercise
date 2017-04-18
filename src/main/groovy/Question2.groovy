import groovy.transform.ToString

/*class Question2 {
    2. Extend the Person class in Groovy Add following fields to it: empId, company, salary Access the
     fields in all known ways: like through getter , by dot operator, by @ operator.
}*/

Child child = new Child();
println "--------using setters to set the value-------"
child.setName("Aryan");
child.setAge(21)
child.setAddress("dwarka")
child.setGender("Male")
child.setEmpId(1212)
child.setCompany("To The New")
child.setSalary(30000)

println "--------using getters to access the value-------"
println child.getName()
println child.getAge()
println child.getAddress()
println child.getGender()
println child.getEmpId()
println child.getCompany()
println child.getSalary()

println "--------using dot to access the value-------"
println child.name
println child.age
println child.address
println child.gender
println child.empId
println child.company
println child.salary

println "--------using @ToString to access the value-------"
println child

@ToString(includeSuper = true)
class Child extends Person{
    Integer empId
    String company
    Integer salary

    Integer getEmpId() {
        return empId
    }

    void setEmpId(Integer empId) {
        this.empId = empId
    }

    String getCompany() {
        return company
    }

    void setCompany(String company) {
        this.company = company
    }

    Integer getSalary() {
        return salary
    }

    void setSalary(Integer salary) {
        this.salary = salary
    }
}