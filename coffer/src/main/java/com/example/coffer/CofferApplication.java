package com.example.coffer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.coffer.repo.Datarepo;

@SpringBootApplication
public class CofferApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CofferApplication.class, args);
		System.out.println("heello hello");
	}

	@Autowired
	private Datarepo datarepository;

	@Override
	public void run(String... args) throws Exception {

		// DataTable data1 = new DataTable(2018,12,"Information Technology","Artificial Intelligence","","",2017,"","",3,"Technological","Infosysblogs",4);
		// datarepository.save(data1);

		// DataTable data2 = new DataTable(2,2020,16,"","Pharmaceutical","","",2010,"","",4,"Healthcare","",4);
		// datarepository.save(data2);

		// DataTable data3 = new DataTable(3,2024,20,"Pharmaceuticals","drug","","world",0,"","",5,"Healthcare","",4);
		// datarepository.save(data3);
	}



}
