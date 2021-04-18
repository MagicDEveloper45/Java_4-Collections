
public class Division
{
    private static int divisionID = 0;
    private int id;
    private String title;

    public Division(String title)
    {
        this.id = divisionID++;
        this.title = title;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getDivision()
    {
        return "ID = " + this.id + ", Title " + this.title;
    }
}
