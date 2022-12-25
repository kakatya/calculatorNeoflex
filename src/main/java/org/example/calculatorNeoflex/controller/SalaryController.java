package org.example.calculatorNeoflex.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.calculatorNeoflex.service.calculatorarguments.HolidayPayArguments;
import org.example.calculatorNeoflex.service.HolidayPayCalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class SalaryController {
    static final Logger log = LogManager.getLogger(SalaryController.class);

    @GetMapping("/calculate")
    public ResponseEntity<?> calculate(@RequestParam Double salary, @RequestParam Integer days) {
        try {
            Double s = new HolidayPayCalculatorService()
                    .calculate(new HolidayPayArguments(days, salary));
            log.info("holiday pay: " + s);
            return ResponseEntity.ok().body(String.format("%.2f", s));
        } catch (Exception e) {
            return ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
