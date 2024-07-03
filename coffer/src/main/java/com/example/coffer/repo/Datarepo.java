package com.example.coffer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coffer.model.DataTable;

public interface Datarepo extends JpaRepository<DataTable, Long>{
	//DataTable is the entity name
	//Long is type of primary key
    
}
