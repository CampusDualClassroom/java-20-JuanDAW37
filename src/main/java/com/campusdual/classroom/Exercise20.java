package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        ArrayList<Person> personas = new ArrayList<Person>();
        Person person = new Person("John", "Smith");
        Teacher teacher = new Teacher("María", "Montessori", "Educación");
        Doctor doctor = new Doctor("Gregory", "House", "Nefrología e infectología");
        PoliceOfficer policeOfficer = new PoliceOfficer("Jake", "Peralta", "B-99");
        personas.add(person);
        personas.add(teacher);
        personas.add(policeOfficer);
        personas.add(doctor);
        return personas;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            stringList.get(i).getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
