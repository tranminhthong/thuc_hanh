package Entities;

import java.util.List;

public class Room {
    private int timeStart;
    private int numberRoom;
    private String typeRoom;
    private int roomPrices;
    private List<Person> persons;

    public Room() {
    }

    public Room(int numberRoom, String typeRoom, int roomPrices, List<Person> persons) {
        this.numberRoom = numberRoom;
        this.typeRoom = typeRoom;
        this.roomPrices = roomPrices;
        this.persons = persons;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getRoomPrices() {
        return roomPrices;
    }

    public void setRoomPrices(int roomPrices) {
        this.roomPrices = roomPrices;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Room{" +
                "timeStart=" + timeStart +
                ", numberRoom=" + numberRoom +
                ", typeRoom='" + typeRoom + '\'' +
                ", roomPrices=" + roomPrices +
                ", persons=" + persons +
                '}';
    }
}
