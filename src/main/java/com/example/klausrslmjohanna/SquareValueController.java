
package com.example.klausrslmjohanna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//square calculator
@RestController
public class SquareValueController {
    @GetMapping("/square")
    public int returnsquare(int n){
        return n*n;
    }
}