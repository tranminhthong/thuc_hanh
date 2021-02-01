import java.util.ArrayList;

public class Room {
    private int timeStart;
    private int numberRoom;
    private String typeRoom;
    private int roomPrices;
    ArrayList<Person> persons = new ArrayList<>();

    public Room() {
    }

    public Room(int numberRoom, String typeRoom, int roomPrice) {
        this.numberRoom = numberRoom;

        this.typeRoom = typeRoom;
        this.roomPrices = roomPrice;
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

}
