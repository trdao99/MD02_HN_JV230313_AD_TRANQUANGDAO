package ra.run;

import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

import static ra.model.Singer.singerArr;
import static ra.model.Singer.lenghtt;
import static ra.model.Song.listSong;


public class MusicManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Singer singer = new Singer();
        Song songs = new Song();
       out: while (true) {
            System.out.println("************************MUSIC-MANAGEMENT*************************" +
                    "\n1. Quản lý ca sĩ" +
                    "\n2. Quản lý bài hát" +
                    "\n3. Tìm kiếm bài hát " +
                    "\n4. Thoát");
            System.out.println("=======================================");
            System.out.println("chọn chức năng");
            int choseMain = Integer.parseInt(sc.nextLine());
            switch (choseMain) {

                case 1:
                    outt:
                    while (true) {
                        int lengthSinger = lenghtt;
                        System.out.println("**********************SINGER-MANAGEMENT*************************\n1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới \n2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ \n3.Thay đổi thông tin ca sĩ theo mã id\n4.Xóa ca sĩ theo mã id \n5.Thoát");
                        System.out.println("=======================================");
                        System.out.println("chọn chức năng");
                        int choseSinger = Integer.parseInt(sc.nextLine());
                        switch (choseSinger) {
                            case 1:
                                singer.inputData();
                                break;
                            case 2:
                                singer.displayData();
                                break;
                            case 3:
                                singer.change();
                                break;
                            case 4:
                                deleteSinger(singerArr, lengthSinger, listSong);
                                break;
                            case 5:
                                break out;
                        }

                    }
                    break;
                case 2:
                    out:
                    while (true) {
                        System.out.println("**********************SONG-MANAGEMENT*************************\n1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới \n2.Hiển thị danh sách tất cả bài hát đã lưu trữ\n3.Thay đổi thông tin bài hát theo mã id\n4.Xóa bài hát theo mã id\n5.Thoát");
                        System.out.println("=======================================");
                        System.out.println("chọn chức năng");
                        int choseSongs = Integer.parseInt(sc.nextLine());
                        switch (choseSongs) {
                            case 1:
                                songs.inputSong(singerArr, lenghtt);
                                break;
                            case 2:
                                songs.displaySongs();
                                break;
                            case 3:
                                songs.changeSong(singerArr, lenghtt);
                                break;
                            case 4:
                                songs.deleteSong();
                                break;
                            case 5:
                                break out;
                        }
                    }
                case 3:
                    out:
                    while (true) {
                        System.out.println("*********************SEARCH-MANAGEMENT************************\n1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại . \n2.Tìm kiếm ca sĩ theo tên hoặc thể loại \n3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần \n4.Hiển thị 10 bài hát được đăng mới nhất \n5.Thoát");
                        System.out.println("=======================================");
                        System.out.println("chọn chức năng");
                        int choseSongs = Integer.parseInt(sc.nextLine());
                        switch (choseSongs) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:
                                break out;
                        }
                    }
                    break;
                case 4:
                    break outt;
            }
        }
    }

    public static void deleteSinger(Singer[] singerArr, int lengthSinger, Song[] listSong) {
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        boolean check = false;
        System.out.println("Nhập vào Id ca sĩ cần xóa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lengthSinger; i++) {
            if (singerArr[i].getSingerId() == deleteId) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < lengthSinger; i++) {
            if (listSong[i].getSinger().getSingerName().equals(singerArr[index].getSingerName())) {
                System.out.println("Ca sĩ đã có bài hát, không thể xóa");
                check = true;
            }
        }
        if (index != -1 && !check) {
            for (int i = index; i < lengthSinger - 1; i++) {
                singerArr[i] = singerArr[i + 1];
            }
            singerArr[lengthSinger - 1] = null;
            lengthSinger--;
        }
    }
}
