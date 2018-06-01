package com.example.sgpapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sgpapi.entite.Banque;

public interface BanqueRepository extends JpaRepository<Banque, Integer> {

}
