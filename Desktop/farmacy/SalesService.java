package com.ismt.micropharma.service;

import java.util.List;

import com.ismt.micropharma.model.Sales;

public interface SalesService {

	public void saveSalesInfo(Sales sales);

	public void deleteSalesInfo(int id);

	public List<Sales> getAllSalesInfo();

	public Sales getSalesInfoById(int id);
}
