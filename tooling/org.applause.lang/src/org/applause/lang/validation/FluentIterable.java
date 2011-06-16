package org.applause.lang.validation;

import java.util.Iterator;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * Taken from http://codemonkeyism.com/creating-a-fluent-interface-for-google-collections/
 */
public class FluentIterable<T> implements Iterable<T> {
	private Iterable<T> iterable;

	public FluentIterable(Iterable<T> iterable) {
		this.iterable = iterable;
	}

	public static <T> FluentIterable<T> with(Iterable<T> iterable) {
		return new FluentIterable<T>(iterable);
	}

	public FluentIterable<T> filter(Predicate<? super T> predicate) {
		return new FluentIterable<T>(Iterables.filter(this.iterable, predicate));
	}

	public Iterator<T> iterator() {
		return this.iterable.iterator();
	}

	public boolean exactlyOnce() {
		return Iterables.size(this) == 1;
	}
	
}
