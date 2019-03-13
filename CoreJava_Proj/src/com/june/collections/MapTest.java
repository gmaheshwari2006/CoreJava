package com.june.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		MapTest mapTest = new MapTest();
		mapTest.test();
		mapTest.iteratorTest();

	}

	public void test() {
		Map<Long, CountryEntity> countryMap = new HashMap<Long, CountryEntity>();

		countryMap.put(10L, createCountry(100L, "India", "Delhi"));
		countryMap.put(11L, createCountry(11L, "Lanka", "Columbo"));
		countryMap.put(12L, createCountry(12L, "USA", "NY"));
		Set<Entry<Long, CountryEntity>> entrySet = countryMap.entrySet();
		// 1st way of iteration
		for (Entry<Long, CountryEntity> entry : countryMap.entrySet()) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue().getCountryName());
		}
		// 2nd way of iteration
		Set<Long> keys = countryMap.keySet();
		for (Long id : keys) {
			System.out.println("value for key: " + id + " : is: "
					+ countryMap.get(id).getCountryName());
		}

		System.out.println(countryMap.containsKey(11L));
		System.out.println(countryMap.containsValue(createCountry(10L, "India",
				"Delhi")));
		countryMap.remove(11L);
		System.out.println(countryMap.containsKey(11L));
		for (Long id : keys) {
			System.out.println("value for key: " + id + " : is: "
					+ countryMap.get(id).getCountryName());
		}

		System.out.println("size: " + countryMap.size());
		System.out.println("is empty: " + countryMap.isEmpty());

		countryMap.put(null, createCountry(12L, "USA", "NY"));
		System.out.println("size: " + countryMap.size());
		countryMap.put(null, createCountry(13L, "USA1", "NY1"));
		System.out.println("size: " + countryMap.size());

		for (Long id : keys) {
			System.out.println("value for key: " + id + " : is: "
					+ countryMap.get(id).getCountryName());
		}

		Map<Long, CountryEntity> countryTable = new Hashtable<Long, CountryEntity>();
		countryTable.put(10L, createCountry(100L, "India", "Delhi"));
		countryTable.put(15L, createCountry(101L, "India1", "Delhi1"));
		countryTable.put(20L, createCountry(102L, "India2", "Delhi2"));
		
		Iterator<Entry<Long, CountryEntity>> it = countryTable.entrySet().iterator();
		
		Hashtable<Long, CountryEntity> countryTable1 = new Hashtable<Long, CountryEntity>();
		countryTable1.put(10L, createCountry(100L, "India", "Delhi"));
		countryTable1.put(15L, createCountry(101L, "India1", "Delhi1"));
		countryTable1.put(20L, createCountry(102L, "India2", "Delhi2"));
		
		Enumeration<Long> em = countryTable1.keys();

		while (em.hasMoreElements()){
			Long countryId = (Long) em.nextElement(); 
			System.out.println("em id: " + countryId);
		}
	}

	public void iteratorTest() {
		List<CountryEntity> countries = new ArrayList<CountryEntity>();
		CountryEntity country1 = createCountry(100L, "India", "Delhi");
		CountryEntity country2 = createCountry(11L, "Lanka", "Columbo");
		CountryEntity country3 =  createCountry(12L, "USA", "NY");
		countries.add(country2);
		countries.add(country1);
		countries.add(country3);
		
		Iterator it = countries.iterator();
		
		while (it.hasNext()){
			CountryEntity country = (CountryEntity) it.next(); 
			System.out.println(country.getCountryName());
		}
	}

	public CountryEntity createCountry(Long id, String name, String capital) {
		CountryEntity entity = new CountryEntity();
		entity.setId(id);
		entity.setCapital(capital);
		entity.setCountryName(name);
		return entity;
	}
}
