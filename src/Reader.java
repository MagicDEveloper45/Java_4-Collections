
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Reader {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\Игорь Лукин\\Desktop\\Новая папка\\foreign_names.csv";
        String currLine = "";
        String separator = ";";

        List<Human> humanList = new ArrayList();
        HashSet setDivision = new HashSet();

        try {

            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine();

            while((currLine = br.readLine()) != null)
            {
                String[] line = currLine.split(separator);
                Division division = null;
                Iterator iterator = setDivision.iterator();

                while(iterator.hasNext())
                {
                    Division currDivision = (Division)iterator.next();
                    if (currDivision.getTitle().equals(line[4]))
                    {
                        division = currDivision;
                    }
                }

                if (division == null)
                {
                    division = new Division(line[4]);
                    setDivision.add(division);
                }

                Human human = new Human(Integer.parseInt(line[0]), line[1], line[2], division, Integer.parseInt(line[5]), line[3]);
                humanList.add(human);
            }

            Iterator iterator = humanList.iterator();

            while(iterator.hasNext())
            {
                Human human = (Human)iterator.next();
                System.out.println(human.toString());
            }

        }
        catch (FileNotFoundException ex1)
        {
            ex1.printStackTrace();
        }

        catch (IOException ex2)
        {
            ex2.printStackTrace();
        }
    }
}
