package by.vsu.mf.aoad.domain;

public interface Speciality extends NamedEntity, Hierarchy<Speciality> {
	String getCode();

	void setCode(String code);
}