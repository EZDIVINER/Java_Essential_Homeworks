package homework3_Task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom[] classRooms = new ClassRoom[4];
        classRooms[0] = new ClassRoom(new ExcelentPupil());
        classRooms[1] = new ClassRoom(new GoodPupil());
        classRooms[2] = new ClassRoom(new BadPupil());
        classRooms[3] = new ClassRoom(new GoodPupil());
    }
}
