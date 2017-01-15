package org.proxibanquev3.dao;


public interface IDao<T> {

	T select(Object primaryKey);

	T modifier(T object);

	void supprimer(T object);

	T creer(T object);
}
