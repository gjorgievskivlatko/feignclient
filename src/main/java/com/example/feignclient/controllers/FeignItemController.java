package com.example.feignclient.controllers;

import com.example.feignclient.clients.FeignServerItemClient;
import com.example.feignclient.dtos.ItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class FeignItemController {

    private final FeignServerItemClient feignServerItemClient;

    public FeignItemController(FeignServerItemClient feignServerItemClient) {
        this.feignServerItemClient = feignServerItemClient;
    }

    @GetMapping("{id}")
    public ResponseEntity<ItemDto> getItem(@PathVariable Integer id) {
        return feignServerItemClient.getItem(id);
    }
}
