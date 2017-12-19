package com.zyd.springboot;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.util.ClassUtils;

/**
 * 
 * Mapper名字生成器
 *
 */
public class MapperNameGenerator implements BeanNameGenerator {
	Map<String, Integer> nameMap = new HashMap<String, Integer>();

	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		// 获取类的名字
		String shortClassName = ClassUtils.getShortName(definition.getBeanClassName());
		// 将类名转换为规范的变量名
		String beanName = Introspector.decapitalize(shortClassName);
		if (nameMap.containsKey(beanName)) {
			int index = nameMap.get(beanName) + 1;
			nameMap.put(beanName, index);
			beanName += index;
		} else {
			nameMap.put(beanName, 1);
		}
		return beanName;
	}

}
