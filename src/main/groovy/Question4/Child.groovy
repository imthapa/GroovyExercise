package Question4

import groovy.transform.ToString

/*
4. GString... override the toString() of the Person class to return something like...
"Sachin is a man aged 24 who lives at Delhi. He works for Intelligrape with employee id 12 and
draws $$$$$$$ lots of money !!!!."
 */

Child employee = new Child();
employee.setName("Aryan");
employee.setAge(21)
employee.setAddress("dwarka")
employee.setGender("Male")
employee.setEmpId(1212)
employee.setCompany("To The New")
employee.setSalary(30000)

println "--------using @ToString to access the value-------"
println employee

@ToString(includeSuper = true)
class Employee extends Human{
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

    String toString() {
        """${super.toString()}.He works for ${company} with employee id ${empId} 
               and draws ${salary} lots of money !!!!."""
    }
}