package dev.dhanush.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;

public interface HelloController {
    @RequestMapping("/greeting")
    String greeting();
}
