package com.example.feignclient.controllers;

import com.example.feignclient.clients.FeignServerItemClient;
import com.example.feignclient.dtos.ItemDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/item")
public class FeignItemController {

    private final FeignServerItemClient feignServerItemClient;

    public FeignItemController(FeignServerItemClient feignServerItemClient) {
        this.feignServerItemClient = feignServerItemClient;
    }

    @GetMapping
    public ResponseEntity<ItemDTO> getItem(@RequestParam @NotNull @Min(0) final Integer id) {
        ItemDTO itemDTO = feignServerItemClient.getItem(id);
        return ResponseEntity.ok(itemDTO);
    }
}
