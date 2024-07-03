package com.example.coffer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.coffer.model.DataTable;
import com.example.coffer.service.DataService;


@Controller
public class Datacontroller {

    @Autowired
    private DataService dataService;

    public Datacontroller(DataService dataService){
        super();
        this.dataService=dataService;
    }

    //handler method to handle list of data and return mode and view

    @CrossOrigin(origins = "http://localhost:3002")
    @GetMapping("/datalist1")
    public String listData(Model model){
        model.addAttribute("data",dataService.getAllData());
        return "datalist"; //datalist is the viewname created as datalist.html;
        
    }

    @GetMapping("/datalist/new")
    public String createDataForm(Model model){
        //create DataTable object to hold data form data;
        DataTable data=new DataTable();
        model.addAttribute("data1",data);
        return "create_data";//create_data is the view name created as create_data.html;
    }

    @PostMapping("/datalist")
    public String saveData(@ModelAttribute("data1") DataTable datas){
        dataService.saveData(datas);
        return "redirect:/datalist1";
    }

    @GetMapping("/datan/edit/{id}")
    public String editData(@PathVariable Long id,Model model){
        model.addAttribute("data1",dataService.getDataById(id));
        return "edit_data";
    }

    @PostMapping("/datalist/{id}")
    public String updateData(@PathVariable Long id,@ModelAttribute("data1") DataTable data,Model model){
        //get data from database by id
        DataTable existingData = dataService.getDataById(id);
        existingData.setId(id);
        existingData.setEndYear(data.getEndYear());
        existingData.setIntensity(data.getIntensity());
        existingData.setSector(data.getSector());
        existingData.setTopic(data.getTopic());
        existingData.setSwot(data.getSwot());
        existingData.setRegion(data.getRegion());
        existingData.setStartYear(data.getStartYear());
        existingData.setCity(data.getCity());

        existingData.setCountry(data.getCountry());
        existingData.setRelevance(data.getRelevance());
        existingData.setPestle(data.getPestle());
        existingData.setSource(data.getSource());
        existingData.setLikelihood(data.getLikelihood());

        //save data to DataTable object
        dataService.updateDataTable(existingData);
        return "redirect:/datalist1";

    }

    //handler method to handle delete data request
    @GetMapping("/datan/{id}")
    public String deleteData(@PathVariable Long id){
        dataService.deleteDataById(id);
        return "redirect:/datalist1";
    }
}
