/**
 * 
 */
package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.CreditScore;

/**
 * @author Abridge
 *
 */
public interface BankDao extends JpaRepository<CreditScore, String> {

}
