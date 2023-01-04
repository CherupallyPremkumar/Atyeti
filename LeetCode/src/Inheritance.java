import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class Hello{
  private int id;
  private String name;
  private List<String> hobbies;

    public Hello(int id, String name, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.hobbies = new ArrayList<>();
        for (String hobby: hobbies)
            hobbies.add(hobby);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        Map<String,Integer> map = new HashMap<>();
        map.put("hello",11);
        List list=new ArrayList<>();
       for (String hobby: hobbies){
           list.add(hobby);
       }
       return list;
    }


}