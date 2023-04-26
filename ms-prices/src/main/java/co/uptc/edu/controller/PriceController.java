package co.uptc.edu.controller;
import co.uptc.edu.model.Price;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping ("/p1/ms-price/prices")
@RestController
public class PriceController {

    @PostMapping(value = "")
    public ResponseEntity<Price> createPrice(){
        Price p = new Price();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }




    @GetMapping(value ="")
    public void getPrice(){

    }

    @PostMapping(value = "/update")
    public void updatePrice(){}}
