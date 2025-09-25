package com.saga.api.controller;

import com.saga.api.model.Requerimiento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;

@RestController
public class ReqController {

    // ArrayList para poder almacenar los datos que probaremos en las peticiones manuales mediante Postman
    private final List<Requerimiento> lista = new ArrayList<>();

    // Endpoint GET para listar todos los requerimientos
   @GetMapping("/api/requerimientos")
    public List<Requerimiento> listarTodos() {
        return lista;
   }
    // Endpoint POST para crear requerimientos
   @PostMapping("/api/requerimientos")
    public Requerimiento crear(@RequestBody Requerimiento req) {
        lista.add(req);
        return req;
   }

   // Endpoint GET buscar por ID
@GetMapping("/api/requerimientos/{id}")
   public ResponseEntity<Requerimiento> getById(@PathVariable int id){
        for(Requerimiento r : lista){
            if (r.getIdReq() == id){
                return ResponseEntity.ok(r);
            }
        }
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
   }

   // Endpoint PUT actualizar estado
    @PutMapping("/api/requerimientos/{id}/estado")
    public ResponseEntity<Requerimiento> actualizarEstado(@PathVariable int id, @RequestParam String valor){
        for(Requerimiento r : lista){
            if (r.getIdReq() == id){
                r.setEstado(valor);
                return ResponseEntity.ok(r);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }



}
