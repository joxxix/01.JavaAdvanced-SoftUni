import java.util.*;

public class p03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       HashSet<String> registeredVlogers = new HashSet<>();
       HashSet<Vlogger> vloggers = new HashSet<>();


        for (int i = 0; ; i++) {
            String[] vlooggerCommand = scan.nextLine().split(" ");

            String vlogger = vlooggerCommand[0];
            String followedVlog = vlooggerCommand[2];

            if (vlooggerCommand[1].equals("joined")){
                if (!vloggers.contains(vlogger)){
                    registeredVlogers.add(vlogger);
                }
            }
            else if (vlooggerCommand[1].equals("followed")){

            }

        }
    }
    class Vlogger{
        private String name;
        private List<String> followings;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getFollowings() {
            return followings;
        }

        public void setFollowings(List<String> followings) {
            this.followings = followings;
        }

        public List<String> getFollowers() {
            return followers;
        }

        public void setFollowers(List<String> followers) {
            this.followers = followers;
        }

        private List<String> followers;
    }

}

