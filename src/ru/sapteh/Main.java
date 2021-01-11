package ru.sapteh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        if (args.length ==0){
            System.out.println("Введите данные");
            return;
        }

        String fileName = "Student.txt";
        List<Student> students = new ArrayList<>();

        //reading from file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()){
                Student employee = getStudent(reader.readLine()) ;
                students.add(employee);
            }
        }

        //input data
        if (args[0].equals("-c")){
            int id = 0;
            for (Student student:students) {
                if (student.getId() > id){
                    id = student.getId();
                }
            }
            String lastName= args[1];
            String firstName = args[2];
            String patronomic = args[3];
            String dateBirthDay = args[4];
            String special = args[5];
            int course = Integer.parseInt(args[6]);
            int group = Integer.parseInt(args[7]);
            Student student = new Student(++id,lastName,firstName,patronomic,dateBirthDay,special,course,group);
            students.add(student);
        }
        if (args[0].equals("-u")){
            int id = Integer.parseInt(args[1]);
            for (Student student: students) {
                if (id ==student.getId()){
                    students.set(id-1,new Student(id,args[2],args[3],args[4],args[5],args[6],Integer.parseInt(args[7]),Integer.parseInt(args[8])));
                }

            }
        }
        if (args[0].equals(("-d"))){
            int id = Integer.parseInt(args[1]);
            students.removeIf(student -> id == student.getId());
        }

        System.out.println(students);


        //writing in file
        try (FileWriter fw = new FileWriter(fileName)){
            for (Student student:students) {
                fw.write(student.toString());
                fw.write("\n");
            }
        }
    }

    public static Student getStudent(String stringLine){
        String[] student = stringLine.split(" ");
        int id = Integer.parseInt(student[0].trim());
        String lastName= student[1].trim();
        String firstName = student[2].trim();
        String patronomic = student[3].trim();
        String dateBirthDay =student [4].trim();
        String special = student[5].trim();
        int course = Integer.parseInt(student[6].trim());
        int group = Integer.parseInt(student[7]);
        return new Student(id, lastName,firstName,patronomic,dateBirthDay,special,course,group);
    }
}
