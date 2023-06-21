package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Item;
import com.example.demo.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@PostMapping("/item")
	public Item saveItem(@RequestBody Item item) {
		return itemService.saveItem(item);
	}
	
	@GetMapping("item/{id}")
	public Item getItemById(@PathVariable int id) {
		return itemService.getItemById(id);
	}
	
	@GetMapping("/item")
	public List<Item> getAllItems(@RequestBody Item item) {
		return itemService.getAllItems(item);
	}
	
	@DeleteMapping("item/{id}")
	public boolean deleteItems(@PathVariable int id) {
		return itemService.DeleteItems(id);
	}
	@PatchMapping("item/{id}")
	public Item updateItem(@PathVariable int id,@RequestBody Item item) {
		return itemService.updateItem(id, item);
	}
}
