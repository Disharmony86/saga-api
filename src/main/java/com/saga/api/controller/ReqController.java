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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/requerimientos")
@Tag(name = "Requerimientos", description = "Operaciones para gestionar requerimientos")
public class ReqController {

    // ArrayList para poder almacenar los datos que probaremos en las peticiones manuales mediante Postman
    private final List<Requerimiento> lista = new ArrayList<>();


    // Endpoint GET para listar todos los requerimientos
   @GetMapping("/api/requerimientos")
   @Operation(summary = "Listar todos los requerimientos",
           description = "Devuelve la lista completa de requerimientos registrados en memoria")
    public List<Requerimiento> listarTodos() {
        return lista;
   }


    // Endpoint POST para crear requerimientos
   @PostMapping("/api/requerimientos")
   @Operation(summary = "Crear un nuevo requerimiento",
           description = "Agrega un nuevo requerimiento al listado en memoria")
    public Requerimiento crear(@RequestBody Requerimiento req) {
        lista.add(req);
        return req;
   }



   // Endpoint GET buscar por ID
@GetMapping("/api/requerimientos/{id}")
@Operation(summary = "Buscar requerimiento por ID",
        description = "Devuelve un requerimiento específico según su ID")
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
    @Operation(summary = "Actualizar estado de un requerimiento",
            description = "Actualiza el estado de un requerimiento identificado por su ID")
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
