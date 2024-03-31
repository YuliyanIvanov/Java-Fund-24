package Final_Exam;

import java.util.*;

public class Third_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, UserInfo> userStatistics = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("Statistics")) {
            String[] com = command.split("=");
            switch (com[0]) {
                case "Add":
                    String username = com[1];
                    int sentMessages = Integer.parseInt(com[2]);
                    int receivedMessages = Integer.parseInt(com[3]);
                    UserInfo user = new UserInfo(sentMessages, receivedMessages);
                    userStatistics.putIfAbsent(username, user);
                    break;
                case "Message":
                    String sender = com[1];
                    String receiver = com[2];
                    if (userStatistics.containsKey(sender) && userStatistics.containsKey(receiver)) {
                        userStatistics.get(sender).incrementSent();
                        if (userStatistics.get(sender).getTotalMessages() >= capacity) {
                            System.out.println(sender + " reached the capacity!");
                            userStatistics.remove(sender);
                        }
                        userStatistics.get(receiver).incrementReceived();
                        if (userStatistics.get(receiver).getTotalMessages() >= capacity) {
                            System.out.println(receiver + " reached the capacity!");
                            userStatistics.remove(receiver);
                        }
                    }
                    break;
                case "Empty":
                    String userToDelete = com[1];
                    if (userToDelete.equals("All")) {
                        userStatistics.clear();
                    } else {
                        userStatistics.remove(userToDelete);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Users count: " + userStatistics.size());
        userStatistics.forEach((username, userInfo) ->
                System.out.println(username + " - " + userInfo.getTotalMessages()));
    }

    static class UserInfo {
        private int sentMessages;
        private int receivedMessages;

        public UserInfo(int sentMessages, int receivedMessages) {
            this.sentMessages = sentMessages;
            this.receivedMessages = receivedMessages;
        }

        public void incrementSent() {
            sentMessages++;
        }

        public void incrementReceived() {
            receivedMessages++;
        }

        public int getTotalMessages() {
            return sentMessages + receivedMessages;
        }
    }
}