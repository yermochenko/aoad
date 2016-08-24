package by.vsu.mf.aoad.domain;

import by.vsu.mf.aoad.utils.Fraction;

public interface CurriculumDiscipline extends Entity {
	Discipline getDiscipline();

	void setDiscipline(Discipline discipline);

	Flow getFlow();

	void setFlow(Flow flow);

	/* лекционные часы */

	/* чтение столбца 10 */
	Fraction getHoursCurriculumLecture();

	/* запись столбца 10 */
	void setHoursCurriculumLecture(Fraction hoursCurriculumLecture);

	/* вычисление столбца 11 */
	Fraction calcHoursLecture();

	/* часы практических и семинарских занятий */

	/* чтение столбца 12 */
	Fraction getHoursCurriculumPractice();

	/* запись столбца 12 */
	void setHoursCurriculumPractice(Fraction hoursCurriculumPractice);

	/* вычисление столбца 13 */
	Fraction calcHoursPractice();

	/* часы лабораторных работ */

	/* чтение столбца 14 */
	Fraction getHoursCurriculumLabWork();

	/* запись столбца 14 */
	void setHoursCurriculumLab1Work(Fraction hoursCurriculumLabWork);

	/* вычисление столбца 15 */
	Fraction calcHoursLabWork();

	/* контрольные работы */

	/* чтение столбца 16 */
	Integer getNumberCurriculumControlWork();

	/* запись столбца 16 */
	void setNumberCurriculumControlWork(Integer numberCurriculumControlWork);

	/* вычисление столбца 19 */
	Fraction calcHoursControlWorkChecking();

	/* управляемая самостоятельная работа */

	/* чтение столбца 17 */
	Fraction getHoursManagedSelfWork();

	/* запись столбца 17 */
	void setHoursManagedSelfWork(Fraction hoursManagedSelfWork);

	/* вычисление столбца 18 */
	Fraction calcHoursControlManagedSelfWork();

	/* текущие консультации,
	 * если коэффициент равен null, значит консультации считаются обычным образом,
	 * если коэффициент отрицательный, значит консультаций не будет,
	 * если коэффициент положительный, значит часы консультаций, посчитанные обычным образом, домножаются на этот коэффициент */

	/* чтение столбца 32 */
	Fraction getCoefficientCurrentConsultation();

	/* запись столбца 32 */
	void setCoefficientCurrentConsultation(Fraction coefficientCurrentConsultation);

	/* вычисление столбца 20 */
	Fraction calcHoursCurrentConsultation();

	/* индивидуальные консультации для заочников */

	/* вычисление столбца 21 */
	Fraction calcHoursIndividualConsultation();

	/* экзаменационные консультации и экзамены,
	 * если коэффициент равен null, значит ни экзаменов, ни консультаций нет,
	 * если коэффициент равен 0, значит есть и экзамены, и консультации, которые считаются обычным образом,
	 * если коэффициент больше 0, значит есть экзамен (коэффициент показывает, сколько часов отводится на 1 студента), но нет консультаций */

	/* чтение столбца 33 */
	Fraction getCoefficientExamination();

	/* запись столбца 33 */
	void setCoefficientExamination(Fraction coefficientExamination);

	/* вычисление столбца 22 */
	Fraction calcHoursExaminationConsultation();

	/* вычисление столбца 23 */
	Fraction calcHoursExamination();

	/* зачёты,
	 * если коэффициент равен null, значит зачёта нет,
	 * если коэффициент равен 0, значит есть зачёт, который считается обычным образом,
	 * если коэффициент больше 0, значит есть зачёт, а коэффициент показывает, сколько часов отводится на 1 студента */

	/* чтение столбца 34 */
	Fraction getCoefficientCredit();

	/* запись столбца 34 */
	void setCoefficientCredit(Fraction coefficientCredit);

	/* вычисление столбца 24 */
	Fraction calcHoursCredit();

	/* учебная практика */

	/* чтение столбца 35 */
	boolean isStudyPractice();

	/* запись столбца 35 */
	void setStudyPractice(boolean studyPractice);

	/* вычисление столбца 25 */
	Fraction calcHoursStudyPractice();

	/* производственная практика (коэффициент указывает количество часов на 1 студента) */

	/* чтение столбца 36 */
	Fraction getCoefficientProductionPractice();

	/* запись столбца 36 */
	void setCoefficientProductionPractice(Fraction coefficientProductionPractice);

	/* вычисление столбца 26 */
	Fraction calcHoursProductionPractice();

	/* курсовые работы */

	/* чтение столбца 37 */
	boolean isTermPaper();

	/* запись столбца 37 */
	void setTermPaper(boolean termPaper);

	/* вычисление столбца 27 */
	Fraction calcHoursTermPaper();

	/* дипломные работы */

	/* чтение столбца 38 */
	boolean isDiplomaProject();

	/* запись столбца 38 */
	void setDiplomaProject(boolean diplomaProject);

	/* вычисление столбца 28 */
	Fraction calcHoursDiplomaProject();

	/* занятия с магистрантами */

	/* чтение столбца 39 */
	Fraction getCoefficientMagistracy();

	/* запись столбца 39 */
	void setCoefficientMagistracy(Fraction coefficientMagistracy);

	/* вычисление столбца 29 */
	Fraction calcHoursMagistracy();

	/* ГЭК */

	/* чтение столбца 40 */
	Fraction getCoefficientStateExaminationBoard();

	/* запись столбца 40 */
	void setCoefficientStateExaminationBoard(Fraction coefficientStateExaminationBoard);

	/* вычисление столбца 30 */
	Fraction calcHoursStateExaminationBoard();

	/* всего часов */

	/* вычисление столбца 31 */
	Fraction calcHoursTotal();
}