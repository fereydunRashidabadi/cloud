package ir.karnik.financialunit.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class ItemService {

    private final HashMap<String, List<String>> list = new HashMap<>();

    public ItemService() {
        list.put("mobile", Arrays.asList("nokia", "apple", "xiaomi"));
        list.put("laptop", Arrays.asList("dell", "asus", "lenovo"));
    }

    
    public List<String> getItems(String category) {
        if (list.containsKey(category))
            return list.get(category);
        return Arrays.asList("");
    }
}
