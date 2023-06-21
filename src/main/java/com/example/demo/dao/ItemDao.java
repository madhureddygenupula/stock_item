package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Item;
import com.example.demo.repository.ItemRepository;

@Repository
public class ItemDao {
@Autowired
	private ItemRepository itemRepository;
	
	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}
	
	public Item getItemById(int id) {
		Optional<Item> items=itemRepository.findById(id);
		if(items.isPresent()) {
			return items.get();
		}
		else
			
			return null;
	}
	
	public List<Item> getAllItems(Item item) {
		return itemRepository.findAll();
	}
	
	public boolean deleteItems(int id) {
		Item item=getItemById(id);
		if(item != null) {
			
			itemRepository.delete(item);
			return true;
		}
		else
			return false;
	}
	
	public Item updateItem(int id,Item item) {
		Item existingItem=getItemById(id);
		
		if(existingItem != null) {
		
		existingItem.setId(item.getId());
		existingItem.setName(item.getName());
		existingItem.setCost(item.getCost());
		existingItem.setBrand(item.getBrand());
		
		return itemRepository.save(existingItem);
		}
			return null;
	}
}
 