package com.generation.services;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.generation.models.proveedor;
import com.generation.repositories.proveedorRepository;


public class ProveedorServices {
		// llamar al Repository
		@Autowired
		proveedorRepository proveedorRepository;

		//guardar un proveedor
		public void saveproveedor(Proveedor proveedor) {
			proveedorRepository.save(proveedor);
			
		}
	

	}
	


