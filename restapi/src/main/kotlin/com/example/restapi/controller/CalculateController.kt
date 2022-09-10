package com.example.restapi.controller

import com.example.restapi.model.Calculator
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class CalculateController {

    @PostMapping("/calculate")
    fun newTransfer(@RequestBody calculator: Calculator.Calculator): ResponseEntity<String> {
        val value = calculator.getNumber() ?: return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("Wrong operation")
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(value.toString())
    }
}