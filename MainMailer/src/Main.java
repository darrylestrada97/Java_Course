import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Ann Jones","Ann Jones Ph.D.","Bob Jones M.D","Carol Jones","Ed Green M.D"};
        List<String> population = getNames(names);
        Map<String, Integer> counts = new TreeMap<>();
        population.forEach(s -> {
            counts.merge(s,1,Integer::sum);
        });


        String annJonesPhd = "Ann Jones";
        System.out.println(counts);
        System.out.println(counts.get("Ann Jones"));
        System.out.println("There are "+ counts.get(annJonesPhd) + " records for "+annJonesPhd );
        System.out.println(population);
        List<String> cleanedNames = standardizeNames(population);
        System.out.println(population);
        System.out.println(cleanedNames);
        System.out.println("There are "+ counts.get(annJonesPhd).toString() + " records for "+annJonesPhd );
        System.out.println(counts);
        /***
         * Since we changed the key names, in the using the standardizeName function, that affected the keys in the counts map, therefor the keys are not longer working.
         * That is why we have to use immutable objects instead.
         * ***/
    }



    public static  List<String> getNames(String[] names){
      List<String> list = new ArrayList<>();
      int index = 3;
      for(String name : names){
          for (int i = 0; i < index; i++){
              list.add(name);

          }
          index++;
      }
        System.out.println(list);
      return list;
    };

    private static List<String> standardizeNames(List <String> list){
        List<String> newList = new ArrayList<>();
        for (var name: list){
            for (String suffix : new String[]{"Ph.D.","M.D"}){
                int startIndex = -1;
                if ((startIndex = name.indexOf(suffix)) > -1 ){
                    name = name.replace(suffix,"");
                }
                newList.add(name);
            }
        }
        return newList;
    }
}