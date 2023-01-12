import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Country {
	public static TreeMap<String, ArrayList<String>> tm = new TreeMap<>();

	 

    public void getCountry(String countryName) {
        if(tm.containsKey(countryName)) {
            System.out.println("Districts for the Entered Country:");
            System.out.println(tm.get(countryName));
        }else {
            System.out.println("Country Name not found");
        }
       
    }

    public void listCountryBefore(String countryName) {
        Set<Entry<String, ArrayList<String>>> set =tm.entrySet();
        System.out.println("District before country ");
        for(Entry<String, ArrayList<String>> e:set) {
            if(e.getKey().equals(countryName)) {
            System.out.println(e.getValue()+":"+e.getKey());
            }
        }
      
    }

    public void listCountryAfter(String countryName) {
        Set<Entry<String, ArrayList<String>>> set =tm.entrySet();
        System.out.println("District after country ");
        for(Entry<String, ArrayList<String>> e:set) {
            if(e.getKey().equals(countryName)) {
            System.out.println(e.getKey()+":"+e.getValue());
            }
        }
      
    }

    public static void main(String[] args) {
        Country test = new Country();
        //Testing Data
        ArrayList<String> districts = new ArrayList<>();
        districts.add("Jhunujhunu");
        districts.add("Abedakar");
        ArrayList<String> districts1 = new ArrayList<>();
        districts1.add("UP");
        districts1.add("France");
        tm.put("India", districts);
        tm.put("Rajasthan", districts1);        

        test.getCountry("abc");
        test.listCountryBefore("Jhunujhunu");
        test.listCountryAfter("India");

    }

 

}


