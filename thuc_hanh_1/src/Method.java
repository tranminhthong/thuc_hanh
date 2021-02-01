import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    static ArrayList<Room> rooms = new ArrayList<>();

    static {
        rooms.add(new Room(101, "thường", 250000));
        rooms.add(new Room(102, "thường", 250000));
        rooms.add(new Room(103, "thường", 250000));
        rooms.add(new Room(201, "Vip", 500000));
        rooms.add(new Room(202, "Vip", 500000));
        rooms.add(new Room(203, "Vip", 500000));
    }
Scanner sc = new Scanner(System.in);
    public void addPerson(int  numberRoom) {
        boolean flag = false;
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        while (!flag){

            try {
                System.out.print("Nhập id: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập tuổi: ");
                int age = Integer.parseInt(sc.nextLine());
                Person person = new Person(name, age, id);
                for (Room room : rooms) {
                    if (room.getNumberRoom() == numberRoom)
                        room.persons.add(person);
                }
                flag = true;
            }catch (NumberFormatException e){
                System.out.println("Nhập lỗi. Tên là chữ, tuổi và id là số");

            }

        }



    }
    public void deletePerson(int numbRoom) {
        System.out.print("Nhập id cần xóa: ");
        int id0 = Integer.parseInt(sc.nextLine());
        for (Room r : rooms) {
            if (r.getNumberRoom() == numbRoom) {
                for (int i = 0; i < r.persons.size(); i++) {
                    if (r.persons.get(i).getIdentity() == id0) {
                        r.persons.remove(i);
                    }
                }
            }
        }
    }
    public void searchRoom(int numbRoom) {
        for (Room r : rooms) {
            if (r.getNumberRoom() == numbRoom) {
                System.out.println("Thông tin phòng thuê:");
                for (Person p: r.persons){
                    System.out.println(p.toString());
                }
                System.out.println("- Thời gian bắt đầu thuê: " + r.getTimeStart() + " giờ");
            }
        }
    }
    public void listRoom() {
        for (Room room : rooms) {
            if (room.persons.size() == 0)
                System.out.printf("\nPhòng %d | Loại  %s | Giá  %d vnđ",
                        room.getNumberRoom(),
                        room.getTypeRoom(),
                        room.getRoomPrices());
        }
    }
    public Person searchPerson(int id) {
        Person p = new Person();
        for (Room room : rooms) {
            for (int j = 0; j < room.persons.size(); j++) {
                if (room.persons.get(j).getIdentity() == id)
                    p = room.persons.get(j);
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
    public void pay() {
        System.out.print("Nhập số phòng: ");
        int numberRoom1 = Integer.parseInt(sc.nextLine());
        searchRoom(numberRoom1);
        System.out.println("Nhập  thời gian trả phòng");
        int timeEnd = Integer.parseInt(sc.nextLine());
        for (Room room : rooms) {
            if (room.getNumberRoom() == numberRoom1) {
                System.out.println("Số tiền cần thanh toán: " + (timeEnd - room.getTimeStart()) * room.getRoomPrices() + " vnđ");
                room.persons.clear();
            }
        }
    }
    public int checkInputNumberRoom(int number){
        boolean check = false;
        int numberRoom = 0;
        for (Room room : rooms) {
            if (number == room.getNumberRoom()) {
                check = true;
            }
        }
        if (check) numberRoom  = number;
        if (!check){
            System.out.println("Nhập sai. Nhập lại");
            int numberRoo  = Integer.parseInt(sc.nextLine());
            checkInputNumberRoom(numberRoo);
        }
        return numberRoom;
    }
}
