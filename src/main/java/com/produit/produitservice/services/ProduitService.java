package com.produit.produitservice.services;

import com.produit.produitservice.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor


public class ProduitService {
    private  final ProduitRepository produitRepository;

}
