package com.spring.core.collections.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyController3 {

	private Map<String, String> map;
	private List<String> list;
	private Set<String> set;
	private Properties properties;

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void method3() {
		System.out.println("Map : " + map);
		System.out.println("List : " + list);
		System.out.println("Set : " + set);
		System.out.println("Properties : " + properties.entrySet());
	}
}
