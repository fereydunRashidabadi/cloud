package ir.karnik.amazonstore.controller;

import ir.karnik.amazonstore.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("amazon/shop/")
public class ShopController {

    final
    ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("all-category")
    public ResponseEntity<List<String>> findAllCategory(){
        return ResponseEntity.ok().body(shopService.getAllCategory());
    }

    @GetMapping("get")
    public ResponseEntity<List<String>> getCategoryItem(@RequestParam String category){
        return ResponseEntity.ok().body(shopService.getCategoryItem(category));
    }
}
