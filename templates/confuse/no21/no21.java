import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Nno21 {
    public String solution(String s) {
        String answer = "";
        List<String> arraylist = new ArrayList<>(
                Arrays.asList(s.split(""))
        );
        int count = 0;
        for (int i = 0; i < arraylist.size();i++){
            if (count % 2 == 0){
                arraylist.set(i, arraylist.get(i).toUpperCase());
                count++;
            } else if (count % 2 == 1) {
                arraylist.set(i, arraylist.get(i).toLowerCase());
                count++;
            }
            if (arraylist.get(i).equals(" ")){
                count = 0;
            }
        }
        for (int j = 0; j < arraylist.size();j++){
            answer += arraylist.get(j);
        }
        System.out.println(answer);
        return answer;
    }
}
public class no21 {
    public static void main(String[] args) {
        Nno21 nno21 = new Nno21();
        String s = "try hello world";
        nno21.solution(s);
    }
}
