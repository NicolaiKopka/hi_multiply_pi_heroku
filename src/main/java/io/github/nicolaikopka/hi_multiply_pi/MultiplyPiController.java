package io.github.nicolaikopka.hi_multiply_pi;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("get-the-pi-to-multiply")
public class MultiplyPiController {

    @GetMapping
    public String welcome() {
        return "I only know integers. You have been warned. Now add that path variable";
    }

    @GetMapping("/{number}")
    public double multiply(@PathVariable int number) {
        return Math.PI * number;
    }
}
