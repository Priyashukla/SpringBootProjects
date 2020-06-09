package com.crudproject.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudproject.entity.product;
import com.crudproject.repository.ProductRepo;
//It indicates service layer
@Service
@Transactional
public class ProductService {

        //Spring Data JPA will generate a proxy instance of ProductRepository and inject it to the instance of ProductService class
		@Autowired
		private ProductRepo repo;
		//method to get all details of table
		public List<product> listAll()
		{
			return repo.findAll();
		}
		//method to create or add data into database
		public void save(product pro)
		{
			 repo.save(pro);
		}
		//To fetch data according to id from database
		public product get(Integer id)
		{
		return repo.findById(id).get();	
		}
        //To delete data from database
	    public void delete(Integer id)
	    {
	    	repo.deleteById(id);
	    }

}
