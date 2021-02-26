package Behaviors;

import Entities.Person;
import Entities.Room;

import java.util.ArrayList;

public class RoomManagement {
    static ArrayList<Room> rooms = new ArrayList<>();

    static {
        rooms.add(new Room(101, "thường", 250000, new ArrayList<>(4)));
        rooms.add(new Room(102, "thường", 250000, new ArrayList<>(4)));
        rooms.add(new Room(103, "thường", 250000, new ArrayList<>(4)));
        rooms.add(new Room(201, "Vip", 500000, new ArrayList<>(2)));
        rooms.add(new Room(202, "Vip", 500000, new ArrayList<>(2)));
        rooms.add(new Room(203, "Vip", 500000, new ArrayList<>(2)));
    }

    public void addPerson(Person person, int numberRoom) {
        for (Room room : rooms) {
            if (room.getNumberRoom() == numberRoom)
                room.getPersons().add(person);
        }
    }

    public void deletePerson(int id, int numbRoom) {
        for (Room r : rooms) {
            if (r.getNumberRoom() == numbRoom) {
                for (int i = 0; i < r.getPersons().size(); i++) {
                    if (r.getPersons().get(i).getIdentity() == id) {
                        r.getPersons().remove(i);
                    }
                }
            }
        }
    }

    public void update(int numRoom, int id, String name) {
        for (Room r : rooms) {
            if (r.getNumberRoom() == numRoom) {
                for (Person p : r.getPersons()) {
                    if (p.getIdentity() == id) {
                        p.setName(name);
                    }
                }
            }
        }
    }

    public void displayRoom(int numbRoom) {
        for (Room r : rooms) {
            if (r.getNumberRoom() == numbRoom) {
                System.out.println("Thông tin phòng thuê:");
                for (Person p : r.getPersons()) {
                    System.out.println(p.toString());
                }
                System.out.println("- Thời gian bắt đầu thuê: " + r.getTimeStart() + " giờ");
            }
        }
    }

    public void listRoom() {
        for (Room room : rooms) {
            if (room.getPersons().size() == 0)
                System.out.printf("\nPhòng %d | Loại  %s | Giá  %d vnđ",
                        room.getNumberRoom(),
                        room.getTypeRoom(),
                        room.getRoomPrices());
        }
    }

    public Person searchPerson(int id) {
        Person p = new Person();
        for (Room room : rooms) {
            for (int j = 0; j < room.getPersons().size(); j++) {
                if (room.getPersons().get(j).getIdentity() == id)
                    p = room.getPersons().get(j);
            }
        }
        return p;
    }

    public void setTime(int numberRoom, int timeStart) {
        for (Room r : rooms) {
            if (r.getNumberRoom() == numberRoom) {
                r.setTimeStart(timeStart);
            }
        }
    }

    public int pay(int numRoom, int timeEnd) {
        int total = 0;
        for (Room room : rooms) {
            if (room.getNumberRoom() == numRoom) {
                total = (timeEnd - room.getTimeStart()) * room.getRoomPrices();
                room.getPersons().clear();
                break;
            }
        }
        return total;
    }

}
