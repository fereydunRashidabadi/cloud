package ir.karnik.financialunit.controller;

import ir.karnik.financialunit.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("amazon/items/")
public class ItemsController {

    final
    ItemService itemService;

    public ItemsController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("get-by-category")
    public ResponseEntity<List<String>> getItems(@RequestParam String category){
        return ResponseEntity.ok().body(itemService.getItems(category));

    }

}
