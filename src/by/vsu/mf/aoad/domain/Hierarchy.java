package by.vsu.mf.aoad.domain;

import java.util.List;

public interface Hierarchy<T extends Entity> {
	T getParent();

	void setParent(T parent);

	List<T> getChildren();

	void setChildren(List<T> children);
}
