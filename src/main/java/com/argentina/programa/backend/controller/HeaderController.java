package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.Header;
import com.argentina.programa.backend.service.IHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HeaderController {
    @Autowired
    private IHeaderService headServ;

    @PostMapping("/header")
    public void agregarHeader (@RequestBody Header head) {
        headServ.crearHeader(head);
    }
    @GetMapping("/header")
    @ResponseBody
    public List<Header> verHeaders(){
        return headServ.verHeaders();
    }
    @DeleteMapping ("/header/{id}")
    public void borrarHeader(@PathVariable Long id) {
        headServ.borrarHeader(id);
    }

    @GetMapping ("/header/{id}")
    @ResponseBody
    public Header buscarHeader(@PathVariable Long id) {
        return headServ.buscarHeader(id);
    }
    @PutMapping ("/header")
    public void modificarHeader(@RequestBody Header head){
        headServ.modificarHeader(head);
    }

}
