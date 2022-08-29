package com.sing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author songbo
 * @since 2022-08-24
 */
@Controller
public class ThymeleafController {

	@RequestMapping("thymeleaf")
	public String thymeleaf(ModelMap map){

		map.put("thText","th:text设置文本内容 <b>加粗</b>");
		map.put("thUText","th:utext 设置文本内容 <b>加粗</b>");
		map.put("thValue","thValue 设置当前元素的value值");
		map.put("thEach", Arrays.asList("th:each", "遍历列表"));
		map.put("thIf","msg is not null");
		map.put("thObject",new Person("zhangsan",12));
		return "thymeleaf";
	}

	@RequestMapping("standardExpression")
	public String standardExpression(ModelMap map){
		map.put("Str", "Blog");
		map.put("Bool", true);
		map.put("Array", new Integer[]{1,2,3,4});
		map.put("List", Arrays.asList(1,3,2,4,0));
		Map hashMap = new HashMap();
		hashMap.put("thName", "${#...}");
		hashMap.put("desc", "变量表达式内置方法");
		map.put("hashMap", hashMap);
		map.put("Date", new Date());
		map.put("Num", 888.888D);
		map.put("Num2", 99);
		return "standardExpression";
	}

	@RequestMapping("fragment")
	public String fragment(){
		return "fragment";
	}
}

class Person{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
