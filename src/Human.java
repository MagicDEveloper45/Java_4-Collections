
public class Human
{
    int id, salary;
    String name, sex, dateOfBirth;
    Division division;

    public Human(int id, String name, String sex, Division division, int salary, String dateOfBirth)
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.division = division;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString()
    {
        int currId = this.id;
        return "Id = " + currId + ", Name: " + this.name + ", Sex: " + this.sex + ", Salary: " + this.salary + "," +
                " DateOfBirth: " + this.dateOfBirth + ", Division: " + this.division.getDivision();
    }
}
