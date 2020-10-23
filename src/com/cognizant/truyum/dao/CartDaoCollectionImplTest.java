package com.cognizant.truyum.dao;

import java.util.*;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {

	public static void main(String[] args) {
		
	}
	
	public static void testAddCartItem() {
		
		CartDaoCollectionImpl cartDaoImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoImpl;
		cartDao.addCartItem(1, 1);
		cartDao.addCartItem(1, 4);
		List<MenuItem> lst;
		try {
			lst = cartDao.getAllCartItems(1);
			System.out.println("MenuItem List:"+ lst);
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testGetItemAllCartItems() throws CartEmptyException{
		
		CartDaoCollectionImpl cartDaoImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoImpl;
		List<MenuItem> lst;
		lst= cartDao.getAllCartItems(1);
		
		for(MenuItem m:lst) {
			System.out.println(m);
		}
		
	}
	public static void testRemoveCartItem() {
		
		CartDaoCollectionImpl cartDaoImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoImpl;
		cartDao.removeCartItem(1, 4);
		List<MenuItem> newlst;
		try {
			newlst = cartDao.getAllCartItems(1);
			System.out.println(newlst);
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
