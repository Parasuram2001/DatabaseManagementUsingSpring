package com.example.coffer.service;
import java.util.List;

import com.example.coffer.model.DataTable;

public interface DataService {
    List<DataTable> getAllData();
    DataTable saveData(DataTable data);
    DataTable getDataById(Long id);
    DataTable updateDataTable(DataTable data);
    void deleteDataById(Long id);
}
