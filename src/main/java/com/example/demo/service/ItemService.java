package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItemDao;
import com.example.demo.dto.Item;

@Service
public class ItemService {
	@Autowired
	private ItemDao itemDao;
	
	public Item saveItem(Item item) {
		return itemDao.saveItem(item);
	}
	
	public Item getItemById(int id) {
		return itemDao.getItemById(id);
	}
	
	public List<Item> getAllItems(Item item){
		return itemDao.getAllItems(item);
	}
	
	public boolean DeleteItems(int id) {
		return itemDao.deleteItems(id);
	}
	
	public Item updateItem(int id,Item item) {
		return itemDao.updateItem(id, item);
	}
}
