package com.example.feignclient.clients;

import com.example.feignclient.dtos.ItemDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "feignserveritemclient", url = "${feign.client.feignserveritemclient.url}")
public interface FeignServerItemClient {

    @GetMapping("/items/{id}")
    ResponseEntity<ItemDto> getItem(@PathVariable Integer id);

    @GetMapping("/items")
    ResponseEntity<List<ItemDto>> getItems();
}
