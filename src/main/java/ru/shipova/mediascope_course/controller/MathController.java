package ru.shipova.mediascope_course.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.shipova.mediascope_course.service.MathService;

@RestController
@RequestMapping("math")
@Api(description = "Главный и единственный контроллер приложения", value = "MathController")
public class MathController {

    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/getFibonachiForUser")
    @ApiOperation(value = "Что делает метод")
    public String getFibonachiForUser(@RequestParam(value = "userName") String userName,
                                      @RequestParam(value = "fibonachiNumber") Integer fibonachiNumber) {
        return mathService.getFibonachiForUser(userName, fibonachiNumber);
    }
}
