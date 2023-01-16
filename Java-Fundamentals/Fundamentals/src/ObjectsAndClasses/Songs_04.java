package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    static class Song {
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }
        public String getTypeList() {
            return this.typeList;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }


        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> listSongs = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song currentSong = new Song();
            currentSong.setTypeList(type);
            currentSong.setName(name);
            currentSong.setTime(time);

            listSongs.add(currentSong);

        }

        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeList().equals(command)) {

                    System.out.println(item.getName());
                }


            }
        }
    }
}