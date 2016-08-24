package by.vsu.mf.aoad.domain;

import java.util.List;

public interface Group extends NamedEntity {
	List<Subgroup> getSubgroups();

	void setSubgroups(List<Subgroup> subgroups);

	Integer getStudentsNumber();

	Speciality getSpeciality();

	void setSpeciality(Speciality speciality);

	EducationsForm getEducationsForm();

	void setEducationsForm(EducationsForm educationsForm);

	Integer getSemester();

	void setSemester(Integer semester);

	Integer getCourse();
}