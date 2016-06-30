package com.taojinqu.manual.handler;

public interface IFunction<T, E> {
	T call(E e);
}
