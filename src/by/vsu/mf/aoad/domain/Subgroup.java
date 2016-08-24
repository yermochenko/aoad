package by.vsu.mf.aoad.domain;

public interface Subgroup extends NamedEntity {
	Integer getStudentsNumber();

	void setStudentsNumber(Integer studentsNumber);

	Speciality getSpeciality();

	void setSpeciality(Speciality speciality);

	Integer getSemester();

	void setSemester(Integer semester);

	Integer getCourse();
}