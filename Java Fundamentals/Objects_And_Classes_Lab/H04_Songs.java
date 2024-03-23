package Objects_And_Classes_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H04_Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        class Song {
            private final String typeList;
            private final String name;
            private String time;

            public Song(String typeList, String name, String time) {
                this.typeList = typeList;
                this.name = name;
                this.time = time;
            }

            public String getName() {
                return name;
            }

            public String getTypeList() {
                return typeList;
            }
        }

        int countSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<>();

        for (int count = 1; count <= countSongs; count++) {
            String data = scanner.nextLine();
            String[] songData = data.split("_");
            String typeList = songData[0];
            String name = songData[1];
            String time = songData[2];

            Song song = new Song(typeList, name, time);

            songsList.add(song);
        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songsList) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
