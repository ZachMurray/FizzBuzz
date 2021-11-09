import java.awt.image.AreaAveragingScaleFilter;
import java.util.LinkedList;
import java.util.List;

public class app {
    public static void main(String[] arg) {
        System.out.println(FizzBuzz(1, 100));
    }

    protected static String FizzBuzz(int startInt, int endInt) {
        StringBuilder returnString = new StringBuilder();
//        List<String> returnStringList = new LinkedList<String>();
        for (int i = startInt; i <= endInt; i++) {
            if ((i % 3) == 0 && (i % 5) == 0)
                returnString.append("FizzBuzz\t");
            else if ((i % 3) == 0)
                returnString.append("Fizz\t");
            else if (i % 5 == 0)
                returnString.append("Buzz\t");
            else
                returnString.append(i).append("\t");
        }
        return String.valueOf(returnString);
    }
}
