package com.example.demo.services;

import com.example.demo.entities.Form;
import com.example.demo.repositories.FormRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    private final FormRepo formRepo;

    public FormService(FormRepo formRepo) {
        this.formRepo = formRepo;
    }

    public Form createForm(Form form){
        return formRepo.save(form);
    }

    public Form updateForm(String formId, String name){
        Form toUpdateForm = formRepo.findById(Long.parseLong(formId)).orElseThrow();
        toUpdateForm.setName(name);

        return formRepo.save(toUpdateForm);
    }

    public void deleteForm(String FormId){
        Form toDeleteForm = formRepo.findById(Long.parseLong(FormId)).orElseThrow();
        formRepo.delete(toDeleteForm);
    }

    public List<Form> getAllForms(){
        return formRepo.findAll();
    }
}
