package com.example.coffer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.coffer.model.DataTable;
import com.example.coffer.repo.Datarepo;
import com.example.coffer.service.DataService;

@Service
public class DataServiceImpl implements DataService{

    private Datarepo dataRepository;

    public DataServiceImpl(Datarepo dataRepository){
        super();
        this.dataRepository=dataRepository;
    }

    @Override
    public List<DataTable> getAllData() {
        return dataRepository.findAll();
    }

    @Override
    public DataTable saveData(DataTable data) {
        return dataRepository.save(data);
    }

    @Override
    public DataTable getDataById(Long id) {
        return dataRepository.findById(id).get();
    }

    @Override
    public DataTable updateDataTable(DataTable data) {
        return dataRepository.save(data);
    }

    @Override
    public void deleteDataById(Long id) {
       dataRepository.deleteById(id);
    }
    
}
