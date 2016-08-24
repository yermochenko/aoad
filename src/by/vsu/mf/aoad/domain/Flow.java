package by.vsu.mf.aoad.domain;

import java.util.List;

public interface Flow extends Entity {
	List<Group> getGroups();

	void setGroups(List<Group> groups);

	Integer getStudentsNumber();
}
