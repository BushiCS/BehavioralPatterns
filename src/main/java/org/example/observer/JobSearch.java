package org.example.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer max = new Subscriber("Max");
        Observer petya = new Subscriber("Petya");

        jobSite.addObserver(max);
        jobSite.addObserver(petya);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java position");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
