package ra.model;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer;
    private String songWriter;
    private Date createdDate = new Date();
    private boolean songStatus;

    public Song() {
    }

    public Song(String songId, String songName, String descriptions, Singer singer, String songWriter, Date createdDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    public static Song[] listSong = new Song[100];
    public static int lenght = 0;

    public void inputSong(Singer singerArr[], int lenghtt) {

        Scanner sc = new Scanner(System.in);
        System.out.println("số lượng nhạc muốn thêm: ");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = lenght; i < num; i++) {
            listSong[i] = new Song();
            boolean checkID = true;
            while (checkID) {
                System.out.println("nhập ID bài hát: ");
                String id = sc.nextLine();
                int j =0;
                do{

                    if (lenght >= 1 && id.equals(listSong[j].songId) && id.length() < 4) {
                        System.out.println("không hợp lệ");
                    } else if (id.startsWith("S")) {
                        listSong[i].setSongId(id);
                        checkID = false;
                        break;
                    } else {
                        System.out.println("không hợp lệ");
                    }
                    j++;
                }while (j<lenght);
            }

            while (true) {
                System.out.println("nhập tên bài hát: ");
                String name = sc.nextLine();
                if (name.isEmpty()) {
                    System.out.println("không được để trống");
                } else {
                    listSong[i].setSongName(name);
                    break;
                }
            }
            while (true) {
                System.out.println("nhập mô tả bài hát: ");
                String descrip = sc.nextLine();

                if (descrip.isEmpty()) {
                    System.out.println("không được để trống");
                } else {
                    listSong[i].setDescriptions(descrip);
                    break;
                }
            }
            while (true) {
                System.out.println("nhập người sáng tác: ");
                String writer = sc.nextLine();

                if (writer.isEmpty()) {
                    System.out.println("không được để trống");
                } else {
                    listSong[i].setSongWriter(writer);
                    break;
                }
            }
            out:
            while (true) {
                for (int j = 0; j < lenghtt; j++) {
                    singerArr[i].displayData();
                }
                System.out.println("nhập ID Singer hát: ");
                int singerID = Integer.parseInt(sc.nextLine());
                for (int j = 0; j < lenghtt; j++) {
                    if (singerID == singerArr[j].getSingerId()) {
                        singer = singerArr[j];
                        break out;
                    } else {
                        System.out.println("nhập lại");
                    }
                }
            }


            System.out.println("tình trạng bài hát: ");
            boolean status = Boolean.parseBoolean(sc.nextLine());
            listSong[i].setSongStatus(status);
            lenght++;
        }
    }

    public void displaySongs() {
        for (int i = 0; i < lenght; i++) {
            System.out.println("id: " + listSong[i].songId +
                    "tên bài hát: " + listSong[i].songName +
                    "người hát: " + listSong[i].singer +
                    "\nngười sáng tác: " + listSong[i].songWriter +
                    "\nngày sáng tác: " + listSong[i].createdDate +
                    "\ntình trạng: " + (listSong[i].songStatus ? "male" : "female"));
            System.out.println("=================================");
        }
    }

    public void changeSong(Singer singerArr[], int lenghtt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID song muốn thay đổi ");
        int ids = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lenght; i++) {
            if (singerArr[i].getSingerId() == ids) {
                boolean checkID = true;
                while (checkID) {
                    System.out.println("nhập ID bài hát: ");
                    String id = sc.nextLine();
                    for (int j = 0; j < lenght; j++) {
                        if (id.equals(listSong[j].songId) && id.length() < 4) {
                            System.out.println("không hợp lệ");
                        } else if (id.startsWith("S")) {
                            listSong[i].setSongId(id);
                            checkID = false;
                            break;
                        } else {
                            System.out.println("không hợp lệ");
                        }
                    }
                }

                while (true) {
                    System.out.println("nhập tên bài hát: ");
                    String name = sc.nextLine();
                    if (name.isEmpty()) {
                        System.out.println("không được để trống");
                    } else {
                        listSong[i].setSongName(name);
                        break;
                    }
                }
                while (true) {
                    System.out.println("nhập mô tả bài hát: ");
                    String descrip = sc.nextLine();

                    if (descrip.isEmpty()) {
                        System.out.println("không được để trống");
                    } else {
                        listSong[i].setDescriptions(descrip);
                        break;
                    }
                }
                while (true) {
                    System.out.println("nhập người sáng tác: ");
                    String writer = sc.nextLine();

                    if (writer.isEmpty()) {
                        System.out.println("không được để trống");
                    } else {
                        listSong[i].setSongWriter(writer);
                        break;
                    }
                }
                out:
                while (true) {
                    for (int j = 0; j < lenghtt; j++) {
                        singerArr[i].displayData();
                    }
                    System.out.println("nhập ID Singer hát: ");
                    int singerID = Integer.parseInt(sc.nextLine());
                    for (int j = 0; j < lenghtt; j++) {
                        if (singerID == singerArr[j].getSingerId()) {
                            singer = singerArr[j];
                            break out;
                        } else {
                            System.out.println("nhập lại");
                        }
                    }
                }


                System.out.println("tình trạng bài hát: ");
                boolean status = Boolean.parseBoolean(sc.nextLine());
                listSong[i].setSongStatus(status);
            }
        }
    }

    public void deleteSong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn Id song muốn xóa: ");
        String id = sc.nextLine();
        for (int i = 0; i < lenght; i++) {
            if (listSong[i].songId.equals(id)) {
                for (int j = i; j < lenght - 1; j++) {
                    listSong[j] = listSong[j + 1];
                }
                listSong[lenght - 1] = null;
                lenght--;
                break;
            }
        }
    }
}

