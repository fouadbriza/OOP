public class AttendanceService {
    private Training[] trainings = new Training[90];
    private int trainingCount = 0;

    public void addTraining(Training training) {
        if (trainingCount < trainings.length && training != null) {
            trainings[trainingCount++] = training;
        }
    }

    public void recordAbsences(Workshop w, Student[] s) {
        if (w != null) {
            w.addAbsentees(s);
            if (s != null) {
                for (Student st : s) {
                    if (st != null) {
                        st.addAbsenceFromWorkshop(w);
                    }
                }
            }
        }
    }

    public Training[] getTrainings() {
        return trainings;
    }

    public int getTrainingCount() {
        return trainingCount;
    }


}