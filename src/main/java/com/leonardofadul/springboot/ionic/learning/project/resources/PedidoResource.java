package com.leonardofadul.springboot.ionic.learning.project.resources;

import com.leonardofadul.springboot.ionic.learning.project.domain.Pedido;
import com.leonardofadul.springboot.ionic.learning.project.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pedido> buscar(@PathVariable Integer id){
        Pedido obj = pedidoService.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
