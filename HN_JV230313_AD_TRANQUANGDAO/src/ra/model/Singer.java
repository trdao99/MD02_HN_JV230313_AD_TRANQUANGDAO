package ra.model;

import java.util.Scanner;

public class Singer {
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer() {
    }

    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static Singer singerArr[] = new Singer[100];
    public static int lenghtt = 0;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng ca sĩ muốn thêm: ");
        int singerCount = Integer.parseInt(sc.nextLine());
        for (int i = lenghtt; i < singerCount; i++) {
            singerArr[i] = new Singer();
            singerArr[i].setSingerId(i + 1);

            while (true) {
                System.out.println("nhập tên Singer: ");
                String name = sc.nextLine();
                if (name.equals("")) {
                    System.out.println("không được để trống");
                } else {
                    singerArr[i].setSingerName(name);
                    break;
                }
            }
            while (true) {
                System.out.println("nhập tuổi Singer: ");
                int age = Integer.parseInt(sc.nextLine());
                if (age > 0) {
                    singerArr[i].setAge(age);
                    break;
                } else {
                    System.out.println("không hợp lệ");

                }
            }
            while (true) {
                System.out.println("nhập quốc tịch Singer: ");
                String nationality = sc.nextLine();
                if (nationality.equals("")) {
                    System.out.println("không được để trống");
                } else {
                    singerArr[i].setNationality(nationality);
                    break;
                }
            }

            while (true) {
                System.out.println("dòng nhạc Singer hát: ");
                String genre = sc.nextLine();
                if (genre.equals("")) {
                    System.out.println("không được để trống");
                } else {
                    singerArr[i].setGenre(genre);
                    break;
                }
            }
            System.out.println("nhập giới tính Singer: ");
            boolean gender = Boolean.parseBoolean(sc.nextLine());
            singerArr[i].setGender(gender);
            lenghtt++;
        }
    }

    public void displayData() {
        for (int i = 0; i < lenghtt; i++) {
            System.out.println("id: " + singerArr[i].getSingerId() +
                    "\ntên ca sĩ: " + singerArr[i].getSingerName() +
                    "\ntuổi: " + singerArr[i].getAge() +
                    "\nquốc tịch: " + singerArr[i].getNationality() +
                    "\nthể loại: " + singerArr[i].genre +
                    "\ngiới tính: " + (singerArr[i].isGender() ? "male" : "female"));
            System.out.println("=================================");
        }

    }

    public void change() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID singer muốn thay đổi ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lenghtt; i++) {
            if (singerArr[i].getSingerId() == id) {
                while (true) {
                    System.out.println("nhập tên Singer: ");
                    String name = sc.nextLine();
                    if (name.equals("")) {
                        System.out.println("không được để trống");
                    } else {
                        singerArr[i].setSingerName(name);
                        break;
                    }
                }
                while (true) {
                    System.out.println("nhập tuổi Singer: ");
                    int age = Integer.parseInt(sc.nextLine());
                    if (age > 0) {
                        singerArr[i].setAge(age);
                        break;
                    } else {
                        System.out.println("không hợp lệ");

                    }
                }
                while (true) {
                    System.out.println("nhập quốc tịch Singer: ");
                    String nationality = sc.nextLine();
                    if (nationality.equals("")) {
                        System.out.println("không được để trống");
                    } else {
                        singerArr[i].setNationality(nationality);
                        break;
                    }
                }

                while (true) {
                    System.out.println("dòng nhạc Singer hát: ");
                    String genre = sc.nextLine();
                    if (genre.equals("")) {
                        System.out.println("không được để trống");
                    } else {
                        singerArr[i].setGenre(genre);
                        break;
                    }
                }
                System.out.println("nhập giới tính Singer: ");
                boolean gender = Boolean.parseBoolean(sc.nextLine());
                singerArr[i].setGender(gender);
            }
            else{
                System.out.println("ID không chính xác");
            }

        }
    }






}
