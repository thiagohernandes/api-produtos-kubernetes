package com.kubernetes.skaffold.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RestProdutoController {

    @RequestMapping("/produtos")
    public ResponseEntity<List<String>> getProdutos(){
        return ResponseEntity.ok(Arrays.asList("Produto 1", "Produto 2", "Produto 3"));
    }

}
