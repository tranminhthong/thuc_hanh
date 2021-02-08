package Behaviors;

import Entities.Family;
import Entities.Person;
import Entities.Residential;

import java.util.ArrayList;
import java.util.List;

public class ResidentialManagement {
    static List<Residential> residencies = new ArrayList<>();

    static {
        residencies.add(new Residential(1, "Hai Bà Trưng", new ArrayList<>()));
        residencies.add(new Residential(2, "Đống Đa", new ArrayList<>()));
        residencies.add(new Residential(3, "Cầu Giấy", new ArrayList<>()));
        residencies.add(new Residential(4, "Nam Từ Liêm", new ArrayList<>()));
        residencies.add(new Residential(5, "Bắc Từ Liêm", new ArrayList<>()));

    }

    public void addFamily(Family family, int idR) {
        for (Residential r : residencies) {
            if (r.getId() == idR) {
                r.getFamilies().add(family);
            }
        }
    }
    public static void update(int idR,int idP,int idF,String name){
        for (Residential r: residencies){
            if (r.getId()==idR){
                for (Family family: r.getFamilies()){
                    if (family.getId()==idF){
                        for (Person  p: family.getPersons()){
                            if (p.getId()==idP){
                                p.setName(name);
                            }
                        }
                    }
                }
            }
        }
    }
    public void delete(int idR,int idF){
        for (Residential r: residencies){
            if (r.getId() == idR){
                for (Family f: r.getFamilies()){
                    if (f.getId()==idF){
                        r.getFamilies().remove(f);
                    }
                }
            }
        }
    }
    public Family getFamily(int idR, int idF){
        for (Residential r:  residencies){
            if (r.getId()==idR){
                for (Family f: r.getFamilies()){
                    if (f.getId()==idF){
                        return f;
                    }
                }
            }
        }
        return null;
    }

    public void displayFamilyOfResident(int idR){
        for (Residential r: residencies){
            if (r.getId()==idR){
                System.out.println(r);
            }
        }
    }
    public void displayFamilyHasPersonEqual80(){
        for (Residential r: residencies){
            for (Family f: r.getFamilies()){
                for (Person p: f.getPersons()){
                    if (p.getDateOfBirth().equals("80")){
                        System.out.println(f);
                    }
                }
            }
        }
    }
}
