package com.github.vetordev.jspringboot.controller;

import com.github.vetordev.jspringboot.model.entity.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping()
    public Client getClient() {
        return new Client(28, "Peter", "2020232323");
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return new Client(id, "Luke", "2020232323");
    }

    @GetMapping(path = "/search")
    public Client searchClient(
            @RequestParam(name = "id", defaultValue = "1") int id
    ) {
        return new Client(id, "Luke", "2020232323");
    }
}
