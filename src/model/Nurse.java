package model;

import java.util.ArrayList;
import java.util.Date;

public class Nurse extends User{
    private String speciality;


    public Nurse() {
        super();
    }

    public Nurse(String name, String email) {
        super(name, email);
    }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + getSpeciality() + "\nAvailable " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado de Hospital: Cruz Verde");
        System.out.println("Departamentos: Cancerologia, Nutriologia, pediatria");
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appoinments \nDate: " + getDate() + "\nTime: " + getTime();
        }
    }
}
