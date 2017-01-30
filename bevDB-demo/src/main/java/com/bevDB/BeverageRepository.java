package com.bevDB;

/**
 * Created by pberman on 1/30/17.
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageRepository extends JpaRepository<Beverage, Integer> {



}
