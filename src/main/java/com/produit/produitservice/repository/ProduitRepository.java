package com.produit.produitservice.repository;

import com.produit.produitservice.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
                                                        //pour le type on prend le nom du model et le type du id
public interface ProduitRepository extends JpaRepository<Produit, Long> {


}
