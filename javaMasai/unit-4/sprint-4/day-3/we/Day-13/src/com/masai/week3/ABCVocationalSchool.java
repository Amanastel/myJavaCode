package com.masai.week3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
class TooShortCourseException extends Exception {
    public TooShortCourseException() {
        super("Course duration should not be less than 15 days");
    }
}
class TooLongCourseException extends Exception {
    public TooLongCourseException() {
        super("Course duration should not be more than 30 days");
    }
}
class InvalidDatesException extends Exception {
    public InvalidDatesException() {
        super("Start date must not be after end date");
    }
}
class TooShortAttendanceException extends Exception {
    public TooShortAttendanceException() {
        super("Minimum 75% attendance is required to appear in examination");
    }
}
class TooMuchMedicalLeavesException extends Exception {
    public TooMuchMedicalLeavesException() {
        super("Maximum 20% of total course duration can be taken as medical leave");
    }
}
class ABCVocationalSchool{
    static long getCourseDurationinDays(String startDateText, String endDateText) throws InvalidDatesException, TooLongCourseException, TooShortCourseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(startDateText, formatter);
        LocalDate endDate = LocalDate.parse(endDateText, formatter);
        // Checking for invalid dates
        if (endDate.isBefore(startDate)) {
            throw new InvalidDatesException();
        }
        long courseDurationInDays = ChronoUnit.DAYS.between(startDate, endDate.plusDays(1));
        // Checking for course duration
        if (courseDurationInDays < 15) {
            throw new TooShortCourseException();
        } else if (courseDurationInDays > 30) {
            throw new TooLongCourseException();
        }
        return courseDurationInDays;
    }

    static long getMedicalLeavesDurationinDays(String startDateText, String endDateText, long courseDurationInDays) throws InvalidDatesException, TooMuchMedicalLeavesException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(startDateText, formatter);
        LocalDate endDate = LocalDate.parse(endDateText, formatter);
        // Checking for invalid dates
        if (endDate.isBefore(startDate)) {
            throw new InvalidDatesException();
        }
        long medicalLeavesInDays = ChronoUnit.DAYS.between(startDate, endDate.plusDays(1));
        // Checking for medical leaves duration
        if ((double) medicalLeavesInDays / courseDurationInDays > 0.2) {
            throw new TooMuchMedicalLeavesException();
        }
        return medicalLeavesInDays;
    }

    static double getAttendancePercentage(long courseDurationInDays, long medicalLeavesInDays, long attendanceInDays) throws TooShortAttendanceException{
        double totalWorkingDays = courseDurationInDays - medicalLeavesInDays;
        double attendancePercentage = attendanceInDays / totalWorkingDays * 100;
        // Checking for attendance
        if (attendancePercentage < 75) {
            throw new TooShortAttendanceException();
        }
        return attendancePercentage;
    }

//    static String getRemark(double attendancePercentage){
//        if (attendancePercentage >= 95.00) {
//            return "You got 10 out of 10 marks in discipline and extracurricular activity";
//        //return remark based on attendance percentage such that this method is called when attendance percentage is more than or equals to 75.00
//    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter course start date of course ");
            String courseStartDate = sc.next();
            System.out.print("Enter course end date of course ");
            String courseEndDate = sc.next();
            long courseDurationInDays = getCourseDurationinDays(courseStartDate, courseEndDate);
            System.out.println("Total course duration is " + courseDurationInDays + " days");
            System.out.print("Have you taken medical leaves? (y/n) ");
            char takenMedicalLeave = sc.next().toLowerCase().charAt(0);
            long medicalLeavesInDays = 0;
            if(takenMedicalLeave == 'y'){

                System.out.print("Enter medical leave start date ");
                String medicalStartDate = sc.next();
                System.out.print("Enter medical leave end date ");
                String medicalEndDate = sc.next();

//                medicalLeavesInDays = getMedicalLeavesDurationinDays(medicalStartDate, medicalEndtDate, courseDurationInDays);
                System.out.println("Total medical leave duration is " + medicalLeavesInDays + " days");
            }
            System.out.print("Enter number of days you attended this course ");
            long attendanceInDays = sc.nextLong();
            double attendancePercentage = getAttendancePercentage(courseDurationInDays,
                    medicalLeavesInDays, attendanceInDays);
//            System.out.println(getRemark(attendancePercentage));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        sc.close();
    }
}