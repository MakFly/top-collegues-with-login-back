package com.topcollegueswithlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topcollegueswithlogin.entite.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
