package com.example.feignclient.clients;

import com.example.feignclient.dtos.ItemDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
@FeignClient(value = "feignserveritemclient", url = "${feign.client.feignserveritemclient.url}")
public interface FeignServerItemClient {

    @GetMapping("/item")
    ItemDTO getItem(@RequestParam @NotNull @Min(0) final Integer id);
}
