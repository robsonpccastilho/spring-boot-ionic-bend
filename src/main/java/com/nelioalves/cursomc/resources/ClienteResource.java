package com.nelioalves.cursomc.resources;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> 1aabb704caa6d6707a2335480414e52b8e684f20
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
<<<<<<< HEAD

	@Autowired
	private ClienteService service;

=======
	
	@Autowired
	private ClienteService service;
	
>>>>>>> 1aabb704caa6d6707a2335480414e52b8e684f20
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id)
	{
		Cliente obj = service.find(id);
<<<<<<< HEAD

		return ResponseEntity.ok().body(obj);

	}
}
=======
		
		return ResponseEntity.ok().body(obj);
		
	}
}
>>>>>>> 1aabb704caa6d6707a2335480414e52b8e684f20
