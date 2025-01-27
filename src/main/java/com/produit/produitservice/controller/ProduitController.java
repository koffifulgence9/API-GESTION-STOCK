package com.produit.produitservice.controller;

import com.produit.produitservice.services.ProduitService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/produits")
@RequiredArgsConstructor
public class ProduitController {
private  final ProduitService produitService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}

