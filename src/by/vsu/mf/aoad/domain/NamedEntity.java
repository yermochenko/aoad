package by.vsu.mf.aoad.domain;

public interface NamedEntity extends Entity {
	String getName();

	void setName(String name);

	String getShortName();

	void setShortName(String shortName);
}