package com.produit.produitservice.controller;

import com.produit.produitservice.model.Produit;
import com.produit.produitservice.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produits")
public class ProduitController {
    private final ProduitService produitService;
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
    @GetMapping("/all")
    public List<Produit> getAllProduits(){
        return produitService.getAllProduit();

    }

    @PostMapping
    public Produit  creatProduit(@RequestBody Produit produit){
        return  produitService.createProduit(produit);

    }
}
