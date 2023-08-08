import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author FateSealed
 * @date 2023/06/28 19:11
 **/
public class DAO<T> {
    private final Map<String,T> map=new HashMap<String,T>();

    public void save(String id, T value) {
        map.put(id, value);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T value) {
        map.put(id, value);
    }

    public List<T> list() {
        final ArrayList<T> ts = new ArrayList<T>();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            ts.add(entry.getValue());
        }
        return ts;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class MyTest{
    @Test
    public void test(){
        final DAO<User> userDAO = new DAO<User>();
        userDAO.save("123",new User(10,12,"王之山"));
        userDAO.save("132",new User(11,12,"王之山"));
        System.out.println(userDAO.get("123"));
        userDAO.update("132",new User(15,21,"帐篷"));
        System.out.println(userDAO.list());
        userDAO.delete("123");
        System.out.println(userDAO.list());
    }
}