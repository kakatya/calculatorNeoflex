package org.example.calculatorNeoflex.controller;

import org.example.calculatorNeoflex.service.calculatorarguments.HolidayPayArguments;
import org.example.calculatorNeoflex.service.HolidayPayCalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class SalaryController {

    @GetMapping("/calculate")
    public ResponseEntity<?> calculate(@RequestParam Double salary, @RequestParam Integer days) {
        try {
            return ResponseEntity.ok().body(String.format("%.2f", new HolidayPayCalculatorService()
                    .calculate(new HolidayPayArguments(days, salary))));
        } catch (Exception e){
            return ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
