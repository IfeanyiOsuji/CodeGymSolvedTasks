package com.codegym.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/* 
Reading and writing to a file: CodeGym

*/
public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            // Initialize users field for the codeGym object here
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Here check that the codeGym object is equal to the loadedObject object

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            PrintStream writer = new PrintStream(outputStream);


                if(users.size()>0) {
                 User user = users.get(0);
                String firstName =user.getFirstName();
                 String lastName = user.getLastName();
                String birthDate = user.getBirthDate().toString();
                String male = user.isMale()? "true":"false";
                String country =user.getCountry().toString();
               writer.print(firstName+","+lastName+","+birthDate+","+male+","+country);

                for(int i=1; i<users.size(); i++){
                     user = users.get(i);
                     firstName =user.getFirstName();
                    lastName = user.getLastName();
                      birthDate = user.getBirthDate().toString();
                      male = user.isMale()? "true":"false";
                      country =user.getCountry().toString();
                    writer.print("\n"+firstName+","+lastName+","+birthDate+","+male+","+country);
                }


           writer.flush();

            } //writer.close();
            }


        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            BufferedReader scan = new BufferedReader(new InputStreamReader(inputStream));
            String d;
            while((d=scan.readLine())!=null) {
                String[] strings = d.split(",");
                String firstName = strings[0];
                String lastName = strings[1];
                String birth = strings[2];

                String isMale = strings[3];
                String country = strings[4];

                User user = new User();
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setBirthDate(new Date(birth));
                //SimpleDateFormat smp = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                //Date birthdate = smp.parse(birth);
                //user.setBirthDate(birthdate);
                if(isMale.equals("true"))
                    user.setMale(true);
                else
                    user.setMale(false);
                    user.setCountry(User.Country.valueOf(country));
                users.add(user);

            }
            scan.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
