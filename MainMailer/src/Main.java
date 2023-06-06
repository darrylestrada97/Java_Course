import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Ann Jones","Ann Jones Ph.D.","Bob Jones M.D","Carol Jones","Ed Green M.D"};
        List<StringBuilder> population = getNames(names);
        Map<StringBuilder, Integer> counts = new TreeMap<>();
        population.forEach(s -> {
            counts.merge(s,1,Integer::sum);
        });
        System.out.println(counts);
        StringBuilder annJonesPhd = new StringBuilder("Ann Jones Ph.D.");
        System.out.println("There are "+ counts.get(annJonesPhd).toString()+ " records for "+annJonesPhd );
        List<StringBuilder> cleanedNames = standardizeNames(population);
        System.out.println(cleanedNames);
    }



    public static  List<StringBuilder> getNames(String[] names){
      List<StringBuilder> list = new ArrayList<>();
      int index = 3;
      for(String name : names){
          for (int i = 0; i < index; i++){
              list.add(new StringBuilder(name));

          }
          index++;
      }
        System.out.println(list);
      return list;
    };

    private static List<StringBuilder> standardizeNames(List <StringBuilder> list){
        List<StringBuilder> newList = new ArrayList<>();
        for (var name: list){
            for (String suffix : new String[]{"Ph.D.","M.D"}){
                int startIndex = -1;
                if ((startIndex = name.indexOf(suffix)) > -1 ){
                    name.replace(startIndex - 1, startIndex + suffix.length(),"");
                }
                newList.add(name);
            }
        }
        return newList;
    }
}