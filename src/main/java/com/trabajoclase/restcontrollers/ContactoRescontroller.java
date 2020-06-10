package com.trabajoclase.restcontrollers;

import com.trabajoclase.models.Contacto;
import com.trabajoclase.services.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoRescontroller {

    @Autowired
    ContactoService service;


    @GetMapping("/list")
    public List<Contacto> list(){
        return service.list();
    }

    @PostMapping("/add")
    public void add(@RequestBody Contacto contacto){
        service.add(contacto);
    }

    @PutMapping("/update/{id}") // La etiqueta {id} va a ser capturada gracias a @PathVariable para enviarse a la variable id
    public void update(@RequestBody Contacto contacto, @PathVariable int id){
        service.update(contacto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
